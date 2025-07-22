import java.util.*;
public class LargestRectHist {
    public static int[] left(int[] heights){
        Stack<Integer> stack=new Stack<>();
        int[] left=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i])
            stack.pop();

            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return left;
    }
    public static int[] right(int[] heights){
        Stack<Integer> stack=new Stack<>();
        int[] right=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>heights[i])
            stack.pop();

            right[i]=stack.isEmpty()?heights.length:stack.peek();
            stack.push(i);
        }
        return right;
    }

    public static int largestRectangleArea(int[] heights) {
        int[] left=left(heights);
        int[] right=right(heights);

        int max=0;
        for(int i=0;i<heights.length;i++){
            int area=heights[i]*(right[i]-left[i]-1);
            max=Math.max(max, area);
        }
        return max;
        
    }

    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}
