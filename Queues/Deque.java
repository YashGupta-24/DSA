public class Deque {
    static int[] q=new int[5];
    static int front=-1,rear=-1;
    public static void enqueFront(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()){
            front=0;
            rear=0;
        }
        else if(front==0){
            front=q.length-1;
        }
        else{
            front--;
        }
        q[front]=x;
    }

    public static void enqueRear(int x){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty()){
            front=0;
            rear=0;
        }
        else if(rear==q.length-1){
            rear=0;
        }
        else{
            rear++;
        }
        q[rear]=x;

    }

    public static void dequeFront(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int t=q[front];
        if(front==rear)
            front=rear=-1;
        else if(front==q.length-1)
            front=0;
        else
            front++;
        
        System.out.println(t);
    }

    public static void dequeRear(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int t=q[rear];
        if(front==rear)
            front=rear=-1;
        else if(rear==0)
            rear=q.length-1;
        else
            rear--;
        
        System.out.println(t);
    }

    public static int getFront(){
        return q[front];
    }

    public static int getRear(){
        return q[rear];
    }

    public static boolean isFull(){
        if(front==rear+1 || (front==0 && rear==q.length-1)) return true;
        return false;
    }

    public static boolean isEmpty(){
        if(front==-1 && rear==-1) return true;
        return false;
    }

    public static void display(){
        if(front==-1 && rear==-1){
            System.out.println("Empty");
            return;
        }
        int i=front;
        while(i!=rear){
            System.out.print(q[i]+" ");
            i=(i+1)%q.length;
        }
        System.out.println(q[i]);
    }

    public static void main(String[] args) {
        enqueFront(2);
        enqueFront(5);
        dequeRear();
        enqueRear(-1);
        enqueRear(0);
        enqueFront(7);
        enqueFront(4);
        display();
    }
}
