public class BinarySearch {
    public static boolean binarySearch(int[] a, int lb, int ub, int t){
        if(lb<=ub){
            int mid=(lb+ub)/2;

            if(a[mid]==t) return true;
            if(a[mid]<t)
            return binarySearch(a, mid+1, ub, t);
            else
            return binarySearch(a, lb, mid-1, t);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(binarySearch(a, 0, a.length-1, 10));
    }
}
