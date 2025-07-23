public class Palindrome {
    public static boolean palindrome(String s, int i){
        if(i>s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return palindrome(s, i+1);
    }
    public static void main(String[] args) {
        String s="yash";
        String r="madam";
        System.out.println(palindrome(s, 0));
        System.out.println(palindrome(r, 0));
    }
}
