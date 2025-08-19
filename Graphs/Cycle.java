import java.util.*;
public class Cycle extends Graphs {
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph = create(V);
        // createGraph(graph, V);
        boolean[] visited=new boolean[V+1];
        // System.out.println(undirected(graph, visited, 0, 0));
        boolean[] rec=new boolean[V+1];
        createDirectedGraph(graph, V);
        System.out.println(directed(graph, visited, 0, rec));
    }

    public static void createDirectedGraph(ArrayList<Edge>[] graph, int V){
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2,2));

        // graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        // graph[2].add(new Edge(2, 3,-1));

        // graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[3].add(new Edge(3, 2,-1));
        // graph[3].add(new Edge(3, 1,0));
    }

    public static boolean undirected(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            if(visited[graph[curr].get(i).destination] && graph[curr].get(i).destination!=parent){
                return true;
            }
            if(!visited[graph[curr].get(i).destination]){
                if(undirected(graph, visited, graph[curr].get(i).destination, curr)) return true;
            }
        }
        return false;
    }

    public static boolean directed(ArrayList<Edge>[] graph, boolean[] visited, int curr, boolean[] rec){
        visited[curr]=true;
        rec[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(rec[e.destination]) return true;

            else if(!visited[e.destination])
            if(directed(graph, visited, e.destination, rec)) return true;
        }
        rec[curr]=false;
        return false;
    }
}
