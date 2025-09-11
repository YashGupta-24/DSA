
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Prims extends Graphs{

    static class Pair implements Comparable<Pair>{
        int node;
        int weight;

        Pair(int node, int weight){
            this.node=node;
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

        boolean[] visited=new boolean[V];
        System.out.println(mst(graph, visited));    
    }

    public static int mst(ArrayList<Edge>[] graphs, boolean[] visited){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int sum=0;

        while(!pq.isEmpty()){
            Pair curr=pq.remove();

            if(!visited[curr.node]){
                visited[curr.node]=true;
                sum+=curr.weight;

                for(int i=0;i<graphs[curr.node].size();i++){
                    Edge e=graphs[curr.node].get(i);
                    if(!visited[e.destination])
                    pq.add(new Pair(e.destination, e.weight ));
                }
            }
        }
        return sum;
    }
}