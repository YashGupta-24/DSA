import java.util.HashMap;

public class EqualArrays {
    public static boolean areEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false; // Arrays of different lengths cannot be equal
        }   
        HashMap<Integer, Integer> m=new HashMap<>();
        HashMap<Integer, Integer> n=new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            m.put(a[i], m.getOrDefault(a[i], 0) + 1);
            n.put(b[i], n.getOrDefault(b[i], 0) + 1);
        }
        for (int key : m.keySet()) {
            if(!n.containsKey(key) || !n.get(key).equals(m.get(key))) {
                return false; // If any key in m is not in n or counts don't match, arrays are not equal
            }
        }
        for (int key : n.keySet()) {    
            if(!m.containsKey(key) || !m.get(key).equals(n.get(key))) {
                return false; // If any key in n is not in m or counts don't match, arrays are not equal
            }
        }
        return true; // All keys and counts match, arrays are equal
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};
        int[] c = {1, 2, 3, 4, 6};
        System.out.println("Are arrays a and b equal? " + areEqual(a, b)); // Output: true
        System.out.println("Are arrays a and c equal? " + areEqual(a, c)); // Output: false
    }
}
