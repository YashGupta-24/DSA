import java.util.Arrays;

public class ZerosToEnd {
    public static void moveZerosToEnd(int [] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("Array is empty");
        }
        else if(arr.length==1){
            return;
        }
        else{
            int l=0;
            for(int r=0;r<arr.length;r++){
                if(arr[r]!=0){
                    arr[l]=arr[r];
                    l++;
                }
            }
            if(l!=0){
                while(l<arr.length){
                    arr[l]=0;
                    l++;
                }
            }
            System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
        }  
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        
        int[] singleElementArr = {0};
        moveZerosToEnd(singleElementArr);
        
        int[] noZeroArr = {1, 2, 3, 4, 5};
        moveZerosToEnd(noZeroArr);
        
        int[] allZeroArr = {0, 0, 0, 0};
        moveZerosToEnd(allZeroArr);

        int[] emptyArr = {};
        moveZerosToEnd(emptyArr);
    }
}
