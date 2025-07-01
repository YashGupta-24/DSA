import java.util.Arrays;
import java.util.HashMap;

public class Frequency {
    public static void frequency(int[]arr){
        //Calculating frequency in O(n) time and O(1) space
        int i=0;
        while(i<arr.length){
            if(arr[i]>0){
                int t=arr[i];
                if(arr[t-1]>0){
                    arr[i]=arr[t-1];
                    arr[t-1]=-1;
                }
                else{
                    arr[i]=0;
                    arr[t-1]--;
                } 
            }
            else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            arr[i]=Math.abs(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void frequency2(int[] arr) {
        //Calculating frequency in O(n) time and O(n) space
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (int i: map.keySet()) {
            System.out.println("Element: " + i + ", Frequency: " + map.get(i));
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,2,5};
        frequency2(arr); 
    }
}
