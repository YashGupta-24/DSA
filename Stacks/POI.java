package Stacks;

import java.util.Stack;

public class POI {
    public static String pOI(String s){
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='^'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'){
                String a=stack.pop();
                String b=stack.pop();
                String r='('+b+s.charAt(i)+a+')';
                stack.push(r);
            }
            else{
                stack.push(s.charAt(i)+"");
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String s="ab-de+f*/";
        System.out.println(pOI(s));
    }
}
