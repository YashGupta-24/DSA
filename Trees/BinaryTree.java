import java.util.*;

public class BinaryTree{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static int id=-1;
    public static Node buildTree(int[] nodes){
        id++;
        if(nodes[id] == -1){
            return null;
        }

        Node node=new Node(nodes[id]);
        node.left=buildTree(nodes);
        node.right=buildTree(nodes);

        return node;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root==null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void levelOrder(Node root){
        if(root==null) return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()) break;
                q.add(null);
            }
            else{
                System.out.print(curr.data+" ");

                if(curr.left!=null)
                q.add(curr.left);
                
                if(curr.right!=null)
                q.add(curr.right);
            }
        }
    }
    public static int sumK(Node root, int k){
        if(root==null) return 0;
        if(k==0) return root.data;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        k--;

        while(!q.isEmpty()){
            Node curr=q.remove();
            int sum=0;
            if(curr==null){
                System.out.println();
                if(q.isEmpty()) break;
                q.add(null);
            }
            else{
                if(k<=0){
                    if(k<0) return sum;
                    sum+=curr.data;
                }
                else{
                    if(curr.left!=null)
                    q.add(curr.left);
                    
                    if(curr.right!=null)
                    q.add(curr.right);

                    k--;
                }
            }
        }
        return 0;
    }

    public static int countNodes(Node root){ //TC = O(N)
        if(root==null)
        return 0;

        int left=countNodes(root.left);
        int right=countNodes(root.right);

        return left+right+1;
    }
    public static int sumNodes(Node root){ //TC = O(N)
        if(root==null)
        return 0;

        int left=sumNodes(root.left);
        int right=sumNodes(root.right);

        return left+right+root.data;
    }
    public static int height(Node root){ //TC = O(N)
        if(root==null)
        return 0;

        int left=height(root.left);
        int right=height(root.right);

        return Math.max(left, right)+1;
    }

    public static int diameter(Node root){ //TC:O(N^2)

        if(root==null) return 0;
        int d1=diameter(root.left);
        int d2=diameter(root.right);

        int d3=height(root.left)+height(root.right)+1;

        return Math.max(d3, Math.max(d1, d2));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }


    public static TreeInfo diameter2(Node root){
        if(root ==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int ht=Math.max(left.ht, right.ht)+1;

        int d1=left.diam;
        int d2=right.diam;

        int d3=left.ht+right.ht+1;

        int diam = Math.max(d1, Math.max(d2, d3));

        TreeInfo tree=new TreeInfo(ht, diam);

        return tree;
    }

    public static boolean isSubtree(Node root, Node sRoot){
        if(sRoot==null)
        return true;

        if(root==null)
        return false;

        if(root.data == sRoot.data){
            return isIdentical(root, sRoot);
        }

        boolean left = isSubtree(root.left, sRoot);
        boolean right = isSubtree(root.right, sRoot);

        return left || right;

    }

    public static boolean isIdentical(Node root, Node sRoot){
        if(root==null && sRoot==null) return true;

        if(root == null || sRoot==null) return false;

        if(root.data != sRoot.data) return false;

        boolean left=isIdentical(root.left, sRoot.left);
        boolean right = isIdentical(root.right, sRoot.right);

        return left && right;
    }
    
    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);
        // System.out.println("PreOrder");
        // preOrder(root);
        // System.out.println("\nPostOrder");
        // postOrder(root);
        // System.out.println("\nInOrder");
        // inOrder(root);
        // System.out.println("\nLevelOrder");
        // levelOrder(root);
        // System.out.println(countNodes(root));
        // System.out.println(sumNodes(root));
        // System.out.println(height(root));
        // System.out.println(diameter(root));
        System.out.println(diameter2(root).diam);
    }
}