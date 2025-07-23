public class MaxArray {
    public static int maxArray(int[] array, int m, int i){
        if(i>=array.length) return m;
        m=Math.max(m, array[i]);
        return maxArray(array, m, i+1);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(maxArray(a, Integer.MIN_VALUE, 0));
    }
}
