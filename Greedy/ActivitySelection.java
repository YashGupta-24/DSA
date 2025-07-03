package Greedy;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        
        Integer arr[][] = new Integer[n][3];
        for(int i=0;i<n;i++){
           arr[i][0] = i;
           arr[i][1] = start[i];
           arr[i][2] = finish[i];
        }
        
        Arrays.sort(arr,Comparator.comparingInt(o ->o[2]));
        int r = arr[0][2];
        int res=1;
        for(int i=0;i<n;i++){
            if(arr[i][1]>r){
                r = arr[i][2];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 5, 8};
        int[] finish = {2, 4, 6, 7, 9, 9};
        int maxActivities = activitySelection(start, finish);
        System.out.println("Maximum number of activities that can be performed: " + maxActivities);

        // Example output: Maximum number of activities that can be performed: 4
        // You can test with different start and finish times
        int[] start2 = {1, 2, 3, 4, 5};
        int[] finish2 = {2, 3, 4, 5, 6};
        int maxActivities2 = activitySelection(start2, finish2);
        System.out.println("Maximum number of activities that can be performed: " + maxActivities2);
        // Example output: Maximum number of activities that can be performed: 3


    }
}
