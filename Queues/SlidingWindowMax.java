import java.util.*;
import java.util.Deque;

public class SlidingWindowMax {
    public static int[] slidingWindwoMax(int[] nums, int k){
        ArrayList<Integer> temp=new ArrayList<>();
        Deque<Integer> q=new ArrayDeque<>();
        int l=0;

        for(int r=0;r<nums.length;r++){
            while(!q.isEmpty() && nums[q.peekLast()]<=nums[r]){
                q.removeLast();
            }
            q.add(r);
            while(!q.isEmpty() && (r-l+1)>k){
                if(q.peek()==l)
                q.removeFirst();

                l++;
            }
            
            if((r-l+1)==k){
                temp.add(nums[q.peek()]);
            }
        }
        int[] result=new int[temp.size()];
        for(int i=0;i<result.length;i++){
            result[i]=temp.get(i);
        }
        return result;
    }
}
