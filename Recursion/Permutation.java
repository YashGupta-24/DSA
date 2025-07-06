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
    // public static arrayPermutation(int[] nums){

    // }
    // public static void arrayHelper(int[] nums, int i, ArrayList<int[]> result){
    //     if(i>=nums.length){
    //         result.add(nums);
    //         return;
    //     }
    //     for(int idx=i;idx<nums.length;idx++){
    //         swap(nums[idx], nums[i]);
    //         arrayHelper(nums, i+1, result);
    //         swap(nums[idx], nums[i]);
    //     }
    // }

    // public static void swap(int a, int b){

    // }
}
