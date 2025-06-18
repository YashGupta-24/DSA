import java.util.Arrays;

public class MergeSortedArray {
    public static void mergeSortedArrays(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Input arrays cannot be null");
        }
        else if(a.length == 0) {
            System.out.println(Arrays.toString(b));
            return;
        }
        else if(b.length == 0) { 
            System.out.println(Arrays.toString(a));
            return;    
        }
        else{
            int i=0;
            while(i<a.length){
                if(a[i]> b[0]){
                    int t=a[i];
                    a[i]=b[0];
                    int j=1;
                    while(j<b.length && b[j]<t){
                        b[j-1]=b[j];
                        j++;
                    }
                    b[j-1]=t;
                }
                i++;
            }
            System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));
        }
    }
    public static void main(String[] args) {
        int a[]={2,4,7,10};
        int b[]={2,3};
        mergeSortedArrays(a, b);
        int m[]={1, 5, 9, 10, 15, 20};
        int n[]={2, 3, 8, 13};
        mergeSortedArrays(m, n);
        int c[]={0,1};
        int d[]={2, 3};
        mergeSortedArrays(c, d);
    }
}
