import java.util.*;
public class Reverse{
    //This will work for large test cases
    public Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack=new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.peek());
            queue.remove();
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        return queue;
    }

    public static void reverse(Queue<Integer> queue){
        if(queue.isEmpty())
        return;

        int t=queue.peek();
        queue.remove();
        reverse(queue);
        queue.add(t);
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(6);
        q.add(5);
        q.add(4);
        q.add(3);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
    }

}