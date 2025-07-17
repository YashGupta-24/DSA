import java.util.*;

public class ReverseArray {
    public static void reverseArray(int[] arr, int lb){
        if(lb>=arr.length/2)
        return;

        int t=arr[lb];
        arr[lb]=arr[arr.length-lb-1];
        arr[arr.length-lb-1]=t;

        reverseArray(arr, lb+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println("Original = "+Arrays.toString(arr));
        reverseArray(arr, 0);
        System.out.println("Reversed = "+Arrays.toString(arr));
    }
}
