package Graphs;

public class AdjacencyMatrix {
    private static boolean searchEdge(int u, int v, int adjacencyMatrix[][]) {
        return (adjacencyMatrix[u][v] == 1 ? true : false);
    }

    private static void deleteEdge(int u, int v, int adjacencyMatrix[][]) {
        adjacencyMatrix[u][v] = 0;
    }

    private static void addEdge(int u, int v, int adjacencyMatrix[][]) {
        adjacencyMatrix[u][v] = 1;
    }

    public static void main(String[] args) {
        int numberOfNodes = 5;
        int adjacencyMatrix[][] = new int[numberOfNodes][numberOfNodes];

        addEdge(0, 1, adjacencyMatrix);
        addEdge(1, 4, adjacencyMatrix);

        deleteEdge(0, 1, adjacencyMatrix);

        boolean isAvailable = searchEdge(0, 1, adjacencyMatrix);
    }
}
