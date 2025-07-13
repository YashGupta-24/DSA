package Heap;
import java.util.*;
public class MinHeap {
    public static void insert(ArrayList<Integer> a, int value){
        a.add(value);
        if(a.size()>1){
            int i=a.size()-1;
            while(i>0 && a.get((i-1)/2)>a.get(i)){
                int t=a.get((i-1)/2);
                a.set(((i-1)/2), a.get(i));
                a.set(i,t);
                i=(i-1)/2;
            }
        }
        System.out.println(a);
    }

    public static void delete(ArrayList<Integer> a){
        if(a.isEmpty())
        {
            System.out.println("No Element to remove");
            return;
        }
        a.set(0, a.get(a.size()-1));
        int i=0;
        int j=smaller(a, (2*i+1), (2*i+2));
        if(j==-1){
            a.remove(a.size()-1);
             System.out.println(a);
             return;
         }
        while(a.get(i)>a.get(j)){
            int t=a.get(i);
            a.set(i,a.get(j));
            a.set(j, t);
            i=j;
            j=smaller(a, (2*i+1), (2*i+2));
            if(j==-1) break;
        }
        a.remove(a.size()-1);
        System.out.println(a);
    }
    public static int smaller(ArrayList<Integer> a, int m, int n){
        if(m>a.size()-1 || n>a.size()-1) return -1;
        if(m>a.size()) return n;
        if(n>a.size()) return m;
        return a.get(m)<a.get(n)?m:n;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> sorted=new ArrayList<>();
        insert(a, 8);
        insert(a, 7);
        insert(a, 9);
        insert(a, 10);
        insert(a, 11);
        insert(a, 12);
        insert(a, 14);
        insert(a, 13);
        insert(a, 5);
        while(!a.isEmpty()){
            sorted.add(a.get(0));
            delete(a);
        }
        System.out.println(sorted);
    }
}
