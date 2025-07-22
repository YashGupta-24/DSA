// package Stacks;

public class ArrayStack {
    static int[] stack=new int[1000];
    static int top=-1;

    public static void push(int x){
        if(top==stack.length-1)
        return;

        stack[++top]=x;
    }

    public static int pop(){
        if(top==-1)
        return -1;

        return stack[top--];
    }

    public static void main(String[] args) {
        push(3);
        push(5);
        pop();
        push(7);
        pop();
    }
}
