public class Palindrome {
    public static boolean palindrome(String s, int lb){
        if(lb>=s.length()/2)
        return true;

        if(s.charAt(lb)!=s.charAt(s.length()-lb-1))
        return false;

        return palindrome(s, lb+1);
    }
    public static void main(String[] args) {
        System.out.println(palindrome("a", 0));
    }
}
