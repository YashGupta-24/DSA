package Stacks;
import java.util.*;
public class IPO {
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

    public static void main(String[] args) {
        String s="a+b*(c^d-e)";
        System.out.println(iPO(s));
    }
}
