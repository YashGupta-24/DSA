import java.util.Arrays;

public class Frequency {
    public static void frequency(int[]arr){
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
    public static void main(String[] args) {
        int[] arr = {2,3,2,2,5};
        frequency(arr); 
    }
}
