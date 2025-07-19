// package Recursion;
import java.util.*;
public class Subsequence {
    public static void subSequence(String r, String s){
        if(s.isEmpty()){
            System.out.println(r);
            return;
        }
        subSequence(r+s.charAt(0), s.substring(1));
        subSequence(r, s.substring(1));
    }

    //Store the subsequences in an arraylist
    public static void subSet(int[] nums, ArrayList<Integer> list, int i, ArrayList<ArrayList<Integer>> set){
        if(i>=nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[i]);
        subSet(nums, list, i+1, set);
        list.remove(list.size()-1);
        subSet(nums,list, i+1, set);
    }


    //Simply print the subsequence
    public static void subSet(int[] nums, ArrayList<Integer> output, int i){
        if(i>=nums.length){
            System.out.println(output);
            return;
        }
        output.add(nums[i]);
        subSet(nums, output, i+1);
        output.remove(output.size()-1);
        subSet(nums, output, i+1);
    }
    public static void main(String[] args) {
        String s="abc";
        subSequence("", s);
        int[] a={1,2,3};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> set=new ArrayList<>();
        subSet(a, list, 0, set);
        subSet(a, list, 0);

        for(int i=0;i<set.size();i++){
            System.out.println(set.get(i));
        }
    }
}
