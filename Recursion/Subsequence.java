package Recursion;

public class Subsequence {
    public static void subSequence(String r, String s){
        if(s.isEmpty()){
            System.out.println(r);
            return;
        }
        subSequence(r+s.charAt(0), s.substring(1));
        subSequence(r, s.substring(1));
    }
    public static void main(String[] args) {
        String s="abc";
        subSequence("", s);
    }
}
