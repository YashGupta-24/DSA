import java.util.Arrays;

public class AlternatePN {
    public static void alternatePN(int[] arr){
        int[] temp = new int[arr.length];
        int p=0;
        int n=1;
        int cn=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                cn++;
            }
        }
        int min = Math.min(cn, arr.length - cn);
        if(cn<arr.length - cn){
            for(int i=0;i<arr.length;i++){
                if(arr[i]<0){
                    temp[n]=arr[i];
                    n+=2;
                }
                else{
                    temp[p]=arr[i];
                    if(p>=(2*min))
                    p+=1;
                    else
                    p+=2;
                }
            }
        } else if(cn>arr.length - cn) {
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    temp[p]=arr[i];
                    p+=2;
                }
                else{
                    temp[n]=arr[i];
                    if(n>=(2*min))
                    n+=1;
                    else
                    n+=2;
                }
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]<0){
                    temp[n]=arr[i];
                    n+=2;
                }
                else{
                    temp[p]=arr[i];
                    p+=2;
                }
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 4,3, 5, 6};
        alternatePN(arr);
    }
}
