package Greedy;

import java.util.Arrays;
// import java.util.Comparator;

public class FractionalKnapsack {
    public static double fractionalKnapsack(int[] v, int[] w, int c){
        double[][] map = new double[v.length][3];
        double profit = 0;
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            map[i][0] = (double) v[i] / w[i]; // value-to-weight ratio
            map[i][1] = v[i];
            map[i][2] = w[i];
        }
        Arrays.sort(map, (a, b) -> Double.compare(b[0], a[0])); // sort by ratio descending
        for (int i = 0; i < map.length; i++) {
            if (count + map[i][2] <= c) {
                profit += map[i][1];
                count += map[i][2];
            } else {
                profit += map[i][0] * (c - count);
                break;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] v = {10,20,30};
        int[] w = {5,10,15};
        int c = 100;
        System.out.println(fractionalKnapsack(v, w, c));
    }
}
