package Greedy;

import java.util.*;

public class JobScheduling {
    public static ArrayList<Integer> jobSequencing(int[] deadline, int[] profit){
        int[][] map=new int[deadline.length][3];
        int count=0, maxProfit=0;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<map.length;i++){
            map[i][0]=i+1;
            map[i][1]=deadline[i];
            map[i][2]=profit[i];
        }

        Arrays.sort(map, (x, y) -> Integer.compare(y[2],x[2]));
        Arrays.sort(map, (x, y) -> Integer.compare(y[1],x[1]));

        for(int i=0;i<map.length;i++){
            if(map[i][1]>=count){
                maxProfit+=map[i][2];
                count++;
            }
        }
        result.add(count);
        result.add(maxProfit);

        return result;
    }
    public static void main(String[] args) {
        int[] deadline={4, 1, 1, 1};
        int[] profit={20, 10, 40, 30};
        System.out.println(jobSequencing(deadline, profit));
    }
}
