package LinkedList;

public class SLL {
    public static void main(String[] args) {
        Node head=null;
        Node tail=null;
        int[] arr = {1, 2, 3, 4, 5};
        for(int i=0;i<arr.length;i++){
            Node node=new Node(arr[i]);
            if(head==null && tail==null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                node.prev=tail;
                tail=node;
            }
        }
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.data + " ");
            ptr=ptr.next;
        }
        // System.out.print(ptr.data + " ");
    }
}

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
