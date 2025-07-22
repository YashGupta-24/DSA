// package Stacks;
import java.util.*;
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures){
        Stack<int[]> stack=new Stack<>();
        int[] result=new int[temperatures.length];

        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i]>=stack.peek()[1]){
                stack.pop();
            }
            if(stack.isEmpty())
            result[i]=0;
            else
            result[i]=stack.peek()[0]-i;

            stack.push(new int[]{i, temperatures[i]});
        }
        return result;
    }
    public static void main(String[] args) {
        int[] temperatures={30,60,90};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
