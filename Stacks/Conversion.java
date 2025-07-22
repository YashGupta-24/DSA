// package Stacks;

import java.util.Stack;

public class Conversion {
    //Infix to Postfix Conversion
    public static String iPO(String s){
        Stack<Character> stack=new Stack<>();
        s='('+s+')';
        String result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push('(');
            }
            else if(s.charAt(i)==')'){
                while(stack.peek()!='('){
                    result+=stack.pop();
                }
                stack.pop();
            }
            else if(s.charAt(i)=='^'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'){
                while(!stack.isEmpty() && priority(stack.peek())>=priority(s.charAt(i))){
                    result+=stack.pop();
                }
                stack.push(s.charAt(i));
            }
            else{
                result+=s.charAt(i);
            }
        }
        return result;
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

    //Infix to Prefix Conversion
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
    public static String reverse(String r,String s){
        if(s.isEmpty())
        return r;

        return reverse(s.charAt(0)+r, s.substring(1));
    }

    //Postfix to Infix Conversion
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

    //Prefix to Infix Conversion
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
    
    //Postfix to Prefix Conversion
    public static String pOPR(String s){
        Stack<String> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='^'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'){
                String a=stack.pop();
                String b=stack.pop();
                String r=s.charAt(i)+b+a;
                stack.push(r);
            }
            else{
                stack.push(s.charAt(i)+"");
            }
        }
        return stack.pop();
    }

    //Prefix to Postfix Conversion
    public static String pRPO(String s){
        Stack<String> stack=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='^'||s.charAt(i)=='/'||s.charAt(i)=='*'||s.charAt(i)=='+'||s.charAt(i)=='-'){
                String a=stack.pop();
                String b=stack.pop();

                String r=a+b+s.charAt(i);
                stack.push(r);
            }
            else{
                stack.push(s.charAt(i)+"");
            }
        }
        return stack.pop();
    }

}
