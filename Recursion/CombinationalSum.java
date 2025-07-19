import java.util.*;
public class CombinationalSum {
    public static void combinationSum(int[] arr, int i, int t, int sum, ArrayList<Integer> output){
        if(i>=arr.length || sum>=t){
            if(sum==t){
                System.out.println(output);
            }
            return;
        }

        sum+=arr[i];
        output.add(arr[i]);
        combinationSum(arr, i, t, sum, output);
        sum-=arr[i];
        output.remove(output.size()-1);
        combinationSum(arr, i+1, t, sum, output);
    }
    public static void combinationSum2(int[] arr, int i, int t, int sum, ArrayList<Integer> output){
        if(i>=arr.length || sum>=t){
            if(sum==t){
                System.out.println(output);
            }
            return;
        }
        int idx=0;
        for(idx=i;idx<arr.length;idx++){
            if(idx>i && arr[idx]==arr[idx-1])continue;
        }
        sum+=arr[idx];
        output.add(arr[idx]);
        combinationSum(arr, idx+1, t, sum, output);
        sum-=arr[idx];
        output.remove(output.size()-1);
    }
    public static void main(String[] args) {
        int[] arr={10,1,2,7,6,1,5};
        ArrayList<Integer> output=new ArrayList<>();
        Arrays.sort(arr);
        combinationSum2(arr, 0, 8, 0, output);
    }
}
