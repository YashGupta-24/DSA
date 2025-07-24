import java.util.Arrays;

public class Reverse {
    public static String reverseString(String s){
        if(s.isEmpty())
        return s;

        return reverseString(s.substring(1))+s.charAt(0);

        /*
         * TC:O(n)
         * SC:O(n)
         */
    }

    public static void reverseArray(int[] a, int i){
        if(i>a.length/2) return;

        int t=a[a.length-i-1];
        a[a.length-i-1]=a[i];
        a[i]=t;
        reverseArray(a, i+1);

        /*
         * TC:O(log n)
         * SC:O(n)
         */
    }
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        reverseArray(a, 0);
        System.out.println(Arrays.toString(a));

        String s="yash";
        System.out.println(reverseString(s));

    }
}
