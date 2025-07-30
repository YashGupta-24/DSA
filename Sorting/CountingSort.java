import java.util.*;
public class CountingSort{
    public static void sort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        int[] temp=new int[max+1];
        int[] output=new int[arr.length];
        Arrays.fill(temp,0);
        for(int i=0;i<arr.length;i++){
            ++temp[arr[i]];
        }
        for(int i=1;i<temp.length;i++){
            temp[i]=temp[i]+temp[i-1];
        }
        
        for(int i=arr.length-1;i>=0;i--){ 
            int index=temp[arr[i]]-1;
            output[index]=arr[i];
        }

        System.out.println(Arrays.toString(output));
    }
    public static void main(String[] args) {
        int[] a={2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        sort(a);
    }
}