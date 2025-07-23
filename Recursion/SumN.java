public class SumN {
    public static int sum(int n){
        if(n<1) return -1;
        if(n==1) return n;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
