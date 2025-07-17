public class ProdN {
    public static int prodN(int n){
        if(n==1)
        return 1;
        return n*prodN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(prodN(6));
    }
}
