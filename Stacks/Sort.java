import java.util.*;
public class Sort {
    public static void insertSorted(Stack<Integer> stack, int x){
        if(stack.isEmpty() || stack.peek()<x){
            stack.push(x);
            return;
        }    
        int t=stack.pop();
        insertSorted(stack, x);
        stack.push(t);
    }

    public static void sort(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int x=stack.pop();
            sort(stack);
            insertSorted(stack, x);
        }
    }
}
