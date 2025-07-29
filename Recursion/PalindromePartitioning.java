import java.util.*;
public class PalindromePartitioning {
    public static List<List<String>> getAllParts(String s){
        List<String> output=new ArrayList<>();
        List<List<String>> result=new ArrayList<>();
        helper(s, output, result);
        return result;
    }
    public static void helper(String s, List<String> output, List<List<String>> result){
        if(s.isEmpty()){
            result.add(new ArrayList<>(output));
            return;
        }

        for(int i=0;i<s.length();i++){
            String part=s.substring(0, i+1);
            if(!isPalin(part)){
                output.add(part);
                helper(s.substring(i+1), output, result);
                output.remove(output.size()-1);
            }
        }
    }

    public static boolean isPalin(String s){
        int lb=0;
        int ub=s.length()-1;
        while(lb<ub){
            if(s.charAt(lb)!=s.charAt(ub))
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="aab";
        System.out.println(getAllParts(s));
    }
}
