package Stacks;
import java.util.*;
public class MinStack {
    static Stack<ArrayList<Integer>> stack=new Stack<>();
    static int min=Integer.MAX_VALUE;
    public static void push(int x){
        ArrayList<Integer> a=new ArrayList<>();
        a.add(x);
        min=Math.min(x, min);
        a.add(min);
        stack.push(a);
    }

    public static int pop(){
        if(stack.isEmpty())
        return -1;

        int t=stack.peek().get(0);
        stack.pop();
        return t;
    }

    public static int getMin(){
        if(stack.isEmpty())
        return -1;
        return stack.peek().get(1);
    }

    public static void main(String[] args) {
        push(1);
        System.out.println(getMin());
        push(0);
        System.out.println(getMin());
        System.err.println(pop());
        System.out.println(getMin());
    }
}
