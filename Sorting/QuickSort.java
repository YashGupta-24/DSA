import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] a, int lb, int ub){
        int pivot=a[lb];
        int start=lb;
        int end=ub;

        while(start<end){
            while(a[start]<=pivot){
                start++;
            }

            while(a[end]>pivot){
                end--;
            }
            if(start<end){
                int t=a[start];
                a[start]=a[end];
                a[end]=t;
            }
        }
        int t=a[end];
        a[end]=a[lb];
        a[lb]=t;

        return end;
    }

    public static void quickSort(int[] a, int lb, int ub){
        if(lb<ub){
            int partition=partition(a, lb, ub);
            quickSort(a, lb, partition-1);
            quickSort(a, partition+1, ub);
        }
    }

    public static void main(String[] args) {
        int[] a={9,10,5,4,1};
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
