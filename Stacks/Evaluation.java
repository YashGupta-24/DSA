package Stacks;

import java.util.Stack;

public class Evaluation {
    //Evaluate Postfix Expression
    public static int evalPO(String[] s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length; i++) {
            if (s[i] == "/" || s[i] == "*" || s[i] == "+" || s[i] == "-") {
                String a = stack.pop();
                String b = stack.pop();
                int r = eval(b, s[i], a);
                stack.push(Integer.toString(r));
            } else {
                stack.push(s[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    //Evaluate Prefix Expression
    public static int evalPR(String[] s){
        Stack<String> stack=new Stack<>();
        for(int i=s.length-1;i>=0;i--){
            if (s[i] == "/" || s[i] == "*" || s[i] == "+" || s[i] == "-"){
                String a = stack.pop();
                String b = stack.pop();
                int r = eval(a, s[i], b);
                stack.push(Integer.toString(r));
            }else {
                stack.push(s[i]);
            }
        }
        return Integer.parseInt(stack.pop());
    }
    
    public static int eval(String a, String op, String b) {
        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);
        switch (op) {
            case "/":
                return m / n;

            case "*":
                return m * n;

            case "+":
                return m + n;

            case "-":
                return m - n;

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        String[] tokens = { "+", "9", "*", "2", "6"};
        System.out.println(evalPR(tokens));
    }
}
