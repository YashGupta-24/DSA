public class PeakElement {
    public static int findPeakElement(int[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException("Array is empty");
        }
        else if (arr.length==1){
            return 0; // The only element is the peak
        }
        else if(arr[0]>arr[1])
        return 0; // First element is a peak
        int lb=1;
        int ub=arr.length-2;
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            return mid;
            else if(arr[mid]<arr[mid+1])
            lb=mid+1;
            else
            ub=mid-1;
        }
        return arr.length-1; // Last element is a peak
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element found at index: " + peakIndex + ", value: " + arr[peakIndex]);
    }

}
