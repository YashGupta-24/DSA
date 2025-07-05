package Greedy;
import java.util.Arrays;
//Train Schedule Problem
public class MinimumPlatform {
    public static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(i<arr.length && j<dep.length){
            if(arr[i]<=dep[j]){
                count++;
                i++;
            }
            else{
                count--;
                j++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1000, 1010, 1030, 1040, 1050};
        int dep[] = {1010, 1020, 1040, 1050, 1060}; 
        System.out.println(findPlatform(arr, dep));
    }
}
