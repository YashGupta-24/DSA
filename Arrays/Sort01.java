import java.util.Arrays;

public class Sort01 {
    public static void method1(int[] arr){
        int count0=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            count0++;
        }

        for(int i=0;i<arr.length;i++){
            if(i<count0)
            arr[i]=0;
            else
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void method2(int[] arr){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            if(arr[l]==0)
            l++;
            else{
                int t=arr[h];
                arr[h]=arr[l];
                arr[l]=t;
                h--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 0, 1};
        method2(arr);
    }
}
