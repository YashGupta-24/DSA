public class LargestElement {
    public static int largestElement(int[] arr){
        if(arr.length==0)
            throw new IllegalArgumentException("Array is empty");
        else if(arr.length==1)
        return arr[0];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Largest element in the array: " + largestElement(arr));
        
        int[] emptyArr = {};
        System.out.println("Largest element in the empty array: " + largestElement(emptyArr));
        
        int[] singleElementArr = {42};
        System.out.println("Largest element in the single element array: " + largestElement(singleElementArr));
        
        int[] negativeArr = {-1, -2, -3, -4, -5};
        System.out.println("Largest element in the negative array: " + largestElement(negativeArr));
    }
}
