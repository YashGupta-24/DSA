
import java.util.*;
public class Graphs{
    static class Edge{
    int source;
    int destination;
    int weight;

    Edge(int source, int destination){
        this.source=source;
        this.destination=destination;
    }

    Edge(int source, int destination, int weight){
        this.source=source;
        this.destination=destination;
        this.weight=weight;
    }
}
    public static ArrayList<Edge>[] create(int V) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[V];
        return graph;
        // createGraph(graph, V);
        // printNeighbors(graph);
        // boolean[] visited=new boolean[V+1];
        // bfs(graph, V, visited);
        // for(int i=0;i<V;i++){
        //     if(!visited[i]){
        //         dfs(graph, visited, 0);
        //     }
        // }
    }

    public static void createGraph(ArrayList<Edge>[] graph, int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(0, 3,30));

        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1, 3,40));

        graph[2].add(new Edge(2, 0,15));
        graph[2].add(new Edge(2, 3,50));
        
        graph[3].add(new Edge(3, 0,30));
        graph[3].add(new Edge(3, 1,40));
        graph[3].add(new Edge(3, 2,50));
        
    }
    public static void createDirectedGraph(ArrayList<Edge>[] graph, int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));

        graph[1].add(new Edge(1, 2,-4));

        graph[2].add(new Edge(2, 3,2));

        graph[3].add(new Edge(3, 4,4));

        graph[4].add(new Edge(4, 1,-10));
    }

    public static void printNeighbors(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            System.out.print(i+": ");
            for(int j=0;j<graph[i].size();j++){
                System.out.print(graph[i].get(j).destination+"("+graph[i].get(j).weight+") ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge>[] graph,int V, boolean[] visited) {
        Queue<Integer> q=new LinkedList<>();
        q.add(graph[0].get(0).source);

        while(!q.isEmpty()){
            int cur=q.remove();
            if(!visited[cur]){
                System.out.print(cur+" ");
                visited[cur]=true;
                for(int i=0;i<graph[cur].size();i++){
                    q.add(graph[cur].get(i).destination);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph, boolean[] visited,int curr){
        System.out.println(curr);
        visited[curr]=true;
        
        for(int i=0;i<graph[curr].size();i++){
            if(!visited[graph[curr].get(i).destination]){
                dfs(graph, visited, graph[curr].get(i).destination);
            }
        }
    }
}