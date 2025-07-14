package Stacks;

import java.util.Stack;

public class PRI {
    public static String pRI(String s){
        Stack<String> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='^'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'){
                String a=stack.pop();
                String b=stack.pop();
                String r='('+a+s.charAt(i)+b+')';
                stack.push(r);
            }
            else{
                stack.push(s.charAt(i)+"");
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String s="*+pq-mn";
        System.out.println(pRI(s));
    }
}
