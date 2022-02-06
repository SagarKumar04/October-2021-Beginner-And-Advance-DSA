package Graphs;

public class PrimsMinimumSpanningTree {
    private static int V = 5;

    private static int getMinimumKey(int key[], boolean mstSet[]) {
        int minimumValue = Integer.MAX_VALUE;
        int minimumValueIndex = -1;

        for(int i = 0; i < V; i++) {
            if(mstSet[i] == false && key[i] < minimumValue) {
                minimumValue = key[i];
                minimumValueIndex = i;
            }
        }

        return minimumValueIndex;
    }

    private static void printMST(int parent[], int graph[][]) {
        System.out.println("Edge\tWeight");
        for(int i = 1; i < V; i++) {
            System.out.println(parent[i] + "-" + i + "\t" + graph[i][parent[i]]);
        }
    }

    private static void primsMST(int graph[][]) {
        int parent[] = new int[V];
        int key[] = new int[V];
        boolean mstSet[] = new boolean[V];

        for(int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
        }

        key[0] = 0;
        parent[0] = -1;

        for(int i = 0; i < (V - 1); i++) {
            int u = getMinimumKey(key, mstSet);
            mstSet[u] = true;

            for(int v = 0; v < V; v++) {
                if(graph[u][v] != 0
                && mstSet[v] == false
                && graph[u][v] < key[v]) {
                    key[v] = graph[u][v];
                    parent[v] = u;
                }
            }
        }

        System.out.println("Parent Array:");
        for(int i = 0; i < V; i++) {
            System.out.println(i + " " + parent[i]);
        }

        System.out.println();

        printMST(parent, graph);
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        primsMST(graph);
    }
}
