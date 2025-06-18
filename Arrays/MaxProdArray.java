public class MaxProdArray {
    public static int maxProduct(int[] arr) {
        if(arr.length==0){
            throw new IllegalArgumentException("Array is empty");
        }
        else if(arr.length==1){
            return arr[0];
        }
        int maxPreProd = Integer.MIN_VALUE;
        int maxSufProd = Integer.MIN_VALUE;
        int preProd = 1;
        int sufProd = 1;
        for(int i=0;i<arr.length;i++){
            preProd *= arr[i];
            maxPreProd = Math.max(maxPreProd, preProd);
            if(preProd == 0) {
                preProd = 1; // Reset if product becomes zero
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            sufProd *= arr[i];
            maxSufProd = Math.max(maxSufProd, sufProd);
            if(sufProd == 0) {
                sufProd = 1; // Reset if product becomes zero
            }
        }
        return Math.max(maxPreProd, maxSufProd);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println("Maximum product of subarray: " + maxProduct(arr));
    }
}