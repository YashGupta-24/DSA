import java.util.*;
public class Dijkstra extends Graphs {
    public static class Pair implements Comparable<Pair>{
        int node;
        int dist;

        public Pair(int node, int dist) {
            this.node=node;
            this.dist=dist;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=create(V);
        createDirectedGraph(graph, V);
        dijkstra(graph, 0, V);
    }

    public static void dijkstra(ArrayList<Edge>[] graph, int src, int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        int[] dist=new int[V];

        for(int i=0;i<V;i++){
            if(i!=src)
            dist[i]=Integer.MAX_VALUE;
        }


        boolean[] visited=new boolean[V];

        pq.add(new Pair(0, 0));
        
        while(!pq.isEmpty()){
            Pair curr = pq.remove();

            if(!visited[curr.node]){
                visited[curr.node]=true;

                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int u=e.source;
                    int v=e.destination;

                    if((dist[u]+e.weight)<dist[v]){
                        dist[v]=dist[u]+e.weight;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dist)); 
    }
}
