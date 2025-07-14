package Stacks;

import java.util.Stack;

public class IPR {
    public static String iPR(String s){
        s='('+s+')';
        String rev=reverse("", s);
        String result="";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<rev.length();i++){
            if(rev.charAt(i)==')'){
                stack.push(')');
            }
            else if(rev.charAt(i)=='('){
                while(stack.peek()!=')'){
                    result+=stack.pop();
                }
                stack.pop();
            }
            else if(rev.charAt(i)=='^'||rev.charAt(i)=='/'||rev.charAt(i)=='*'||rev.charAt(i)=='+'||rev.charAt(i)=='-'||rev.charAt(i)=='('){
                while(!stack.isEmpty() && priority(stack.peek())>=priority(rev.charAt(i))){
                    result+=stack.pop();
                }
                stack.push(rev.charAt(i));
            }
            else{
                result+=rev.charAt(i);
            }
        }
        return reverse("", result);
    }
    public static int priority(Character c){
        switch (c) {
            case '^':
                return 3;

            case '/':
            case '*':
                return 2;

            case '+':
            case '-':
                return 1;
        
            default:
                return -1;
        }
    }
    public static String reverse(String r,String s){
        if(s.isEmpty())
        return r;

        return reverse(s.charAt(0)+r, s.substring(1));
    }

    public static void main(String[] args) {
        String s="(A+B)*C-D+F";
        System.out.println(iPR(s));
    }
}
