import java.util.*;
public class PermString {
    public static List<String> permutation(String s){
        List<String> result=new ArrayList<>();
        helper("", s, result);
        return result;
    }

    public static void helper(String r, String s, List<String> result){
        if(s.isEmpty()){
            result.add(r);
            return;
        }

        for(int i=0;i<=r.length();i++){
            helper(r.substring(0, i)+s.charAt(0)+r.substring(i), s.substring(1), result);
        }
    }

    public static void main(String[] args) {
        System.out.println(permutation("abc"));
    }
}
