package Recursion;
import java.util.*;
public class Permutation {
    public static ArrayList<String> stringPermutation(String s){
        ArrayList<String> result=new ArrayList<>();
        stringHelper("", s, result);
        return result;
    }
    public static void stringHelper(String r, String s, ArrayList<String> result){
        if (s.isEmpty()) {
            result.add(r);
            return;
        }
        for(int i=0;i<=r.length();i++){
            stringHelper(r.substring(0,i)+s.charAt(0)+r.substring(i),s.substring(1), result);
        }
    }
}
