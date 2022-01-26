package Graphs;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    private static int numberOfNodes;

    private static void addEdge(int u, int v, List<ArrayList<Integer>> adjacencyList) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    private static void dfs(int startingVertex, List<ArrayList<Integer>> adjacencyList) {
        boolean visited[] = new boolean[numberOfNodes];
        dfsUtil(startingVertex, visited, adjacencyList);
    }

    private static void dfsUtil(int vertex, boolean visited[], List<ArrayList<Integer>> adjacencyList) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        List<Integer> adjacentVertices = adjacencyList.get(vertex);

        for(Integer eachAdjacentVertex : adjacentVertices) {
            if(!visited[eachAdjacentVertex]) {
                dfsUtil(eachAdjacentVertex, visited, adjacencyList);
            }
        }
    }

    public static void main(String[] args) {
        numberOfNodes = 6;

        List<ArrayList<Integer>> adjacencyList
                = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        addEdge(0, 1, adjacencyList);
        addEdge(0, 2, adjacencyList);
        addEdge(1, 3, adjacencyList);
        addEdge(1, 4, adjacencyList);
        addEdge(2, 4, adjacencyList);
        addEdge(3, 5, adjacencyList);
        addEdge(3, 4, adjacencyList);
        addEdge(4, 5, adjacencyList);

        System.out.println("adjacencyList: " + adjacencyList);

        dfs(0, adjacencyList);
    }
}
