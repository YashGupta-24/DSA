public class SumDigit {
    public static int sumDigit(int[] a, int i){
        if(i>=a.length) return 0;
        return a[i]+sumDigit(a, i+1);
    }
    public static void main(String[] args) {
        int[] a={1,2,3};
        System.out.println(sumDigit(a, 0));
    }
}
