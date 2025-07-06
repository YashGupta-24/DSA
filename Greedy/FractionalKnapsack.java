package Greedy;

import java.util.*;

public class FractionalKnapsack {
    public static void fractionalKnapsack(int[] v, int[] w, int W){
        int[][] map=new int[v.length][3];
        double profit=0.0;
        for(int i=0;i<v.length;i++){
            map[i][0]=v[i]/w[i];
            map[i][1]=v[i];
            map[i][2]=w[i];
        }
        Arrays.sort(map, Comparator.comparingInt(o->o[0]));
        for(int i=map.length-1;i>=0;i--){
            if(map[i][2]<=W)
                 profit+=map[i][1];
            else{
                profit+=(((double)map[i][1]/map[i][2])*W);
            }
            W-=map[i][2];
            if(W<=0)
            break;
        }
        System.out.println(profit);
        }
    public static void main(String[] args) {
        int[] v={8,2,10,1,9,7,2,6,4,9};
        int[] w={10,1,7,7,5,1,8,6,8,7};
        fractionalKnapsack(v, w, 21);
    }
}
