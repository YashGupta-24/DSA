import java.util.*;

public class FirstNegative {
    public static List<Integer> firstNegInt(int arr[], int k){
        List<Integer> result=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int l=0;
        
        for(int r=0;r<arr.length;r++){
            if(arr[r]<0)
            q.add(arr[r]);

            while((r-l+1)>k && !q.isEmpty()){
                if(q.peek()==arr[l])
                q.remove();

                l++;
            }

            if((r-l+1)==k){
                result.add((q.peek()==null)?0:q.peek());
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(firstNegInt(arr, 3));
    }
}
