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

        Arrays.sort(map, (x, y) -> Integer.compare(x[2],y[2]));
        Arrays.sort(map, (x, y) -> Integer.compare(x[1],y[1]));

        int[] store=new int[map[map.length-1][2]];

        for(int i=0;i<map.length;i++){
            if(map[i][1]>=count){
                count=map[i][1];
                store[count-1]=Math.max(store[count-1], map[i][2]);
            }
        }
        count=0;
        for(int i=0;i<store.length;i++){
            if(store[i]!=0){
                maxProfit+=store[i];
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
        int[] deadline2={2, 1, 2, 1, 1};
        int[] profit2={100, 19, 27, 25, 15};
        System.out.println(jobSequencing(deadline2, profit2));
        
    }
}
