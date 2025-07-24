import java.util.Arrays;

public class InversionCount {
    public static int mergeSort(int[] a, int lb, int ub){
        if(lb<ub){
            int mid=(lb+ub)/2;
            int left = mergeSort(a, lb, mid);
            int right = mergeSort(a, mid+1, ub);
            int inversion = merge(a, lb, ub, mid);

            return left+right+inversion;
        }
        return 0;
    }
    public static int merge(int[] a, int lb, int ub, int mid){
        int i=lb;
        int j=mid+1;
        int k=lb;
        int[] b=new int[a.length];
        int inversion=0;

        while(i<=mid && j<=ub){
            if(a[i]<=a[j]){
                b[k]=a[i];
                i++;
            }
            else{
                b[k]=a[j];
                j++;
                inversion+=(mid-i+1);
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
        return inversion;
    }

    public static void main(String[] args) {
        int[] a={9,10,5,4,1};
        System.out.println(Arrays.toString(a));
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
