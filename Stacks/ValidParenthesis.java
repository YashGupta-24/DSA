package Stacks;

import java.util.*;

public class ValidParenthesis {
    public static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            else {
                if (stack.size() > 0) {
                    if ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[') || (s.charAt(i) == '}' && stack.peek() == '{'))
                        stack.pop();
                    else
                        return false;
                } else
                    return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(validParenthesis("()")); // true
        System.out.println(validParenthesis("()[]{}")); // true
        System.out.println(validParenthesis("(]")); // false
        System.out.println(validParenthesis("([)]")); // false
        System.out.println(validParenthesis("{[]}")); // true
    }
}
