import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] a, int lb, int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            mergeSort(a, lb, mid);
            mergeSort(a, mid+1, ub);
            merge(a, lb, ub, mid);
        }
    }
    public static void merge(int[] a, int lb, int ub, int mid){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int[] b=new int[a.length];

        while(i<=mid && j<=ub){
            if(a[i]<=a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            b[k]=a[i];
            i++;
            k++;
        }
        while(j<=ub){
            b[k]=a[j];
            j++;
            k++;
        }

        for(k=lb;k<=ub;k++){
            a[k]=b[k];
        }
    }

    public static void main(String[] args) {
        int[] a={9,10,5,4,1};
        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
