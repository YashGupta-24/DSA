import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        if(arr.length==0)
            throw new IllegalArgumentException("Array is empty");
        else if(arr.length==1)
            System.out.println("Reversed array: "+ Arrays.toString(arr));
        else{
            int lb=0;
            int ub=arr.length-1;
            while(lb!=ub && lb<ub){
                int temp=arr[lb];
                arr[lb]=arr[ub];
                arr[ub]=temp;
                lb++;
                ub--;
            }
            System.out.println("Reversed array: " + Arrays.toString(arr));
        }
        
    }
    public static void main(String[] args) {
        int[] arr={1};
        reverseArray(arr);
    }
}
