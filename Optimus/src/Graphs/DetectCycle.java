package Graphs;

public class DetectCycle {
    int V, E;
    Edge edge[];

    class Edge {
        int source, destination;
    }

    DetectCycle(int v, int e) {
        V = v;
        E = e;

        edge = new Edge[e];
        for(int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    private void union(int parent[], int source, int destination) {
        parent[source] = destination;
    }

    private int find(int parent[], int vertex) {
        if(parent[vertex] == -1) {
            return vertex;
        }

        return find(parent, parent[vertex]);
    }

    private boolean hasCycle() {
        int parent[] = new int[V];

        for(int i = 0; i < V; i++) {
            parent[i] = -1;
        }

        for(int i = 0; i < E; i++) {
            int sourceSubset = find(parent, edge[i].source);
            int destinationSubset = find(parent, edge[i].destination);

            if(sourceSubset == destinationSubset) {
                return true;
            }

            union(parent, sourceSubset, destinationSubset);
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 3, E = 3;
        DetectCycle detectCycle = new DetectCycle(V, E);

        //add edge 0-1
        detectCycle.edge[0].source = 0;
        detectCycle.edge[0].destination = 1;

        //add edge 1-2
        detectCycle.edge[1].source = 1;
        detectCycle.edge[1].destination = 2;

        //add edge 0-2
        detectCycle.edge[2].source = 2;
        detectCycle.edge[2].destination = 0;

        boolean isCyclePresent = detectCycle.hasCycle();

        System.out.println("Cycle present: " + isCyclePresent);
    }
}
