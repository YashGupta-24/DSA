import java.util.ArrayList;

public class AllPaths extends Graphs {
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[V];
        createGraph(graph, V);
        allPaths(graph, 0, 3, V);
    }

    public static void allPaths(ArrayList<Edge>[] graph, int source, int target, int V){
        boolean[] visited=new boolean[V+1];
        String path="";
        allPaths(graph, target, source, visited, path);  
    }

    public static void allPaths(ArrayList<Edge>[] graph, int target, int curr, boolean[] visited, String path){
        if(curr==target){
            System.out.println(path);
            return;
        }

        for(int i=0;i<graph[curr].size();i++){
            if(!visited[graph[curr].get(i).destination]){
                visited[curr]=true;
                allPaths(graph, target, graph[curr].get(i).destination, visited, path+graph[curr].get(i).destination);
                visited[curr]=false;
            }
        }
    }

}
