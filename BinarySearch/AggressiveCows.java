import java.util.Arrays;

public class AggressiveCows{
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int ans=-1;

        int lb=1;
        int ub=stalls[stalls.length-1]-stalls[0];

        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(isPossible(stalls, k, mid)){
                ans=mid;
                lb=mid+1;
            }
            else{
                ub=mid-1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] stalls, int k, int mid){
        int cows=1,lastStallPos=stalls[0];

        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastStallPos>=mid){
                cows++;
                lastStallPos=stalls[i];
            }

            if(cows==k){
                return true;
            }
        }
        return false;
    }
}