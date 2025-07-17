// package Recursion;
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

    public static ArrayList<ArrayList<Integer>> arrayPermutation(int[] nums){
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> output=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        arrayHelper(nums, result, output, freq);
        return result;
    }

    public static void arrayHelper(int[] nums, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> output, boolean[] freq){
        if(output.size()==nums.length){
            result.add(new ArrayList<>(output));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i]) continue;
            freq[i]=true;
            output.add(nums[i]);
            arrayHelper(nums, result, output, freq);
            output.remove(output.size()-1);
            freq[i]=false;
        }
    }

    public static void main(String[] args) {
        String s="abc";
        ArrayList<String> r=stringPermutation(s);
        System.out.println(r);

        int[] nums={1,2,3};
        System.out.println(arrayPermutation(nums));
    }
}
