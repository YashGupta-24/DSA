import java.util.Arrays;

public class Sort012 {
    public static void method1(int[] arr) {
        int c0=0, c1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                c0++;
            else if (arr[i] == 1)
                c1++;
        }

        for(int i=0;i<arr.length;i++){
            if(i<c0)
                arr[i] = 0;
            else if(i<c0+c1)
                arr[i] = 1;
            else
                arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void method2(int arr[]){
        int l=0;
        int m=0;
        int h=arr.length-1;
        while(m<=h){
            if(arr[m]==1){
                m++;
            }
            else if(arr[m]==0){
                int t=arr[l];
                arr[l]=arr[m];
                arr[m]=t;
                l++;
                m++;
            }
            else{
                int t=arr[h];
                arr[h]=arr[m];
                arr[m]=t;
                h--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        method2(arr);
    }
}
