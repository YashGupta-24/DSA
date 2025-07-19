import java.util.*;
import java.util.Deque;

public class FirstNegative {
    public static List<Integer> firstNegInt(int arr[], int k){
        List<Integer> result=new ArrayList<>();
        Deque<Integer> q=new ArrayDeque<>();
        int l=0;
        
        for(int r=0;r<arr.length;r++){
            if(arr[r]<0)
            q.addLast(r);

            while(!q.isEmpty() && (r-l+1)>k){
                if(q.peek()==l)
                q.removeFirst();

                l++;
            }

            if((r-l+1)==k){
                result.add((q.peek()==null)?0:arr[q.peek()]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={-8, 2, 3, -6, 10};
        System.out.println(firstNegInt(arr, 2));
    }
}
