package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private static int numberOfNodes;

    private static void addEdge(int u, int v, List<ArrayList<Integer>> adjacencyList) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    private static void bfs(int startingVertex, List<ArrayList<Integer>> adjacencyList) {
        boolean visited[] = new boolean[numberOfNodes];
        Queue<Integer> queue = new LinkedList<Integer>();

        visited[startingVertex] = true;
        queue.add(startingVertex);

        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            List<Integer> neighbours = adjacencyList.get(vertex);

            for(Integer eachNeighbour : neighbours) {
                if(!visited[eachNeighbour]) {
                    visited[eachNeighbour] = true;
                    queue.add(eachNeighbour);
                }
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

        bfs(0, adjacencyList);
    }
}