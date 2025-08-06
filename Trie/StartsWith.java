public class StartsWith{
    static class Node{
        Node[] children;
        boolean eow;

        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }

    static Node root=new Node();

    public static void insert(String word){
        Node temp=root;
        for(int i=0;i<word.length();i++){
                int ind=word.charAt(i)-'a';
                if(temp.children[ind]==null){
                    Node node=new Node();
                    temp.children[ind]=node;
                }
                if(i==word.length()-1){
                    temp.children[ind].eow=true;
                }
                temp=temp.children[ind];
            }
    }

    public static boolean startsWith(String s){
        Node temp=root;
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(temp.children[ind]==null){
                return false;
            }
            temp=temp.children[ind];
        }
        return true;
    } 

    public static void main(String[] args) {
        String[] words={"apple","app","mango","man","woman"};

        for(String word:words){
            insert(word);
        }
        
        System.out.println(startsWith("app"));
        System.out.println(startsWith("moon"));
    }
}