// package Stacks;
import java.util.*;
public class ALStack {
    static ArrayList<Integer> stack=new ArrayList<>();
    public static void push(int x){
        stack.add(x);
        display();
    }
    public static int pop(){
        if(stack.isEmpty())
        return -1;
        int t=stack.getLast();
        stack.remove(stack.size()-1);
        return t;
    }
    public static void display(){
        System.out.println(stack);
    }

    public static void main(String[] args) {
        push(1);
        push(3);
        System.out.println(pop());
        push(5);
        System.out.println(pop());
        push(7);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
    }
}
