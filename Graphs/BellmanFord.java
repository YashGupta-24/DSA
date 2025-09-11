
import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord extends Graphs {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = create(V);
        createDirectedGraph(graph, V);
        bellmanFord(graph, 0, V);
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int curr, int V) {
        int[] distance = new int[V];

        for (int i = 0; i < V; i++) {
            if (i != curr) {
                distance[i] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);

                    int u = e.source;
                    int v = e.destination;

                    if (distance[u] != Integer.MAX_VALUE
                            && distance[u] + e.weight < distance[v]) {
                        distance[v] = distance[u] + e.weight;
                    }
                }
            }
        }

        for (int j = 0; j < V; j++) {
            for (int k = 0; k < graph[j].size(); k++) {
                Edge e = graph[j].get(k);

                int u = e.source;
                int v = e.destination;

                if (distance[u] != Integer.MAX_VALUE
                        && distance[u] + e.weight < distance[v]) {
                    System.out.println("Negative weight cycle");
                    return;
                }
            }
        }

        System.out.println(Arrays.toString(distance));
    }
}
