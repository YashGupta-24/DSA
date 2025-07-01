import java.util.HashMap;

public class IstNonRepeating {
    public static char firstNonRepeating(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) 
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for(int i = 0; i < s.length(); i++) 
            if(map.get(s.charAt(i)) == 1)
                return s.charAt(i);
        return '\0'; // Return null character if no non-repeating character is found
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char result = firstNonRepeating(s);
        if(result != '\0') {
            System.out.println("First non-repeating character: " + result); // Output: f
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
