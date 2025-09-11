import java.util.*;
public class Kruskal extends Cycle {

    static class Pair implements Comparable<Pair>{
        int source;
        int destination;
        int weight;

        public Pair(int source, int destination, int weight) {
            this.source=source;
            this.destination=destination;
            this.weight=weight;
        }

        @Override
        public int compareTo(Pair p2){
            return this.weight-p2.weight;
        }
        
    }
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=create(V);
        createGraph(graph, V);


    }

    public static int kruskal(ArrayList<Edge>[] graph, boolean[] visited){
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        pq.add(new Pair)
    }
}
