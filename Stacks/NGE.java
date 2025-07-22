// package Stacks;
import java.util.*;

public class NGE {
    public static int[] nge(int[] a){
        int[] result=new int[a.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=result.length-1;i>=0;i--){
            while(!stack.isEmpty() && a[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty())
            result[i]=-1;
            else
            result[i]=stack.peek();

            stack.push(a[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a={4,12,5,3,1,2,5,3,1,2,4,6};
        System.out.println(Arrays.toString(nge(a)));
    }
}
