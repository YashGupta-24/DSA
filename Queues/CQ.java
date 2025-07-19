// import java.util.Arrays;

public class CQ{
    static int[] arr=new int[3];
    static int front=-1, rear=-1,size=0;

    public static void insert(int x){
        if(isFull())
        return;
        if(front ==-1 && rear==-1){
            front=0;
            rear=0;
        }
        else
        rear=(rear+1)%arr.length;

        arr[rear]=x;
        size++;
    }

    public static int remove(){

        if(isEmpty())
        return 0;

        if(front==-1 && rear==-1)
        return -1;

        int temp=arr[front];
        front=(front+1)%arr.length;
        size--;
        return temp;
    }

    public static boolean isFull(){
        if(front==rear+1 || (front==0 && rear==arr.length-1)) return true;
        return false;
    }

    public static boolean isEmpty(){
        if(front==-1 && rear==-1) return true;
        return false;
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        System.out.println(remove());
        System.out.println(remove());
        insert(5);
    }
}