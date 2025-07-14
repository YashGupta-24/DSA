package Heap;
import java.util.*;
public class MaxHeap {
    public static void insert(ArrayList<Integer> a, int value){
        a.add(value);
        if(a.size()>1){
            int i=a.size()-1;
            while(i>0 && a.get((i-1)/2)<a.get(i)){
                int t=a.get((i-1)/2);
                a.set(((i-1)/2), a.get(i));
                a.set(i,t);
                i=(i-1)/2;
            }
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        // ArrayList<Integer> sorted=new ArrayList<>();
        insert(a, 8);
        insert(a, 7);
        insert(a, 9);
        insert(a, 10);
        insert(a, 11);
        insert(a, 12);
        insert(a, 14);
        insert(a, 13);
        insert(a, 5);
        // while(!a.isEmpty()){
        //     sorted.add(a.get(0));
        //     delete(a);
        // }
        // System.out.println(sorted);
    }
}
