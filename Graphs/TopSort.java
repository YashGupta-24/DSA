
import java.util.ArrayList;
import java.util.Stack;

public class TopSort extends Graphs {
    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge>[] graph=create(V);
        createDirectedGraph(graph, V);
        Stack<Integer> stack=new Stack<>();
        boolean[] visited=new boolean[V+1];
        topSort(graph, 0, visited, stack);

        System.out.println(stack);
    }
    public static void topSort(ArrayList<Edge>[] graph, int curr, boolean[] visited, Stack<Integer> stack){
        visited[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);

            if(!visited[e.destination])
            topSort(graph, e.destination, visited, stack);
        }
        stack.push(curr);
    }
}
