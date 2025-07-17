package Stacks;

import java.util.*;

public class NGE1 {
    public static int[] nge1(int[] nums1, int[] nums2){
        int result[]=new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums2[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(nums2[i], -1);
            }
            else{
                map.put(nums2[i], stack.peek());
            }

            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            result[i]=map.get(nums1[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1={2,4};
        int[] nums2={1,2,3,4};
        System.out.println(Arrays.toString(nge1(nums1, nums2)));
    }
}
