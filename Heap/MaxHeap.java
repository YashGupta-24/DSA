package Heap;
import java.util.*;
public class MaxHeap {
    public static void insert(ArrayList<Integer> a, int value){
        a.add(value);
        int i=a.size()-1;
        while(i>0){
            int parent=(int)Math.floor((i-1)/2);
            if(a.get(parent)<value){
                Collections.swap(a, i, parent);
                i=parent;
            }
            else
            break;
        }
    }

    public static void delete(ArrayList<Integer> a){
        int i=0;
        int left=(2*i)+1;
        int right=(2*i)+2;

        while(left<=a.size() && a.get(left)>a.get(i)){
            i=l;
        }

        while(right<=a.size() && a.get(right)>a.get(i)){
            i=right;
        }
        Collections.swap(a, 0, i);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        // ArrayList<Integer> sorted=new ArrayList<>();
        insert(a, 8);
        System.out.println(a);
        insert(a, 7);
        System.out.println(a);
        insert(a, 9);
        System.out.println(a);
        insert(a, 10);
        insert(a, 11);
        System.out.println(a);
        insert(a, 12);
        insert(a, 14);
        System.out.println(a);
        insert(a, 13);
        insert(a, 5);
        System.out.println(a);
        delete(a);
        System.out.println(a);
        // while(!a.isEmpty()){
        //     sorted.add(a.get(0));
        //     delete(a);
        // }
        // System.out.println(sorted);
    }
}
