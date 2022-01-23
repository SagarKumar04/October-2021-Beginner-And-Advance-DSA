package Graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    private static boolean searchEdge(int u, int v, List<ArrayList<Integer>> adjacencyList) {
        boolean result = false;

        if(adjacencyList.get(u).contains(v)) {
            result = true;
        }

        return result;
    }

    private static void deleteEdge(int u, int v, List<ArrayList<Integer>> adjacencyList) {
        Integer object;
        object = v;
        adjacencyList.get(u).remove(object);
        object = u;
        adjacencyList.get(v).remove(object);
    }

    private static void addEdge(int u, int v, List<ArrayList<Integer>> adjacencyList) {
        adjacencyList.get(u).add(v);
        adjacencyList.get(v).add(u);
    }

    public static void main(String[] args) {
        int numberOfNodes = 5;

        List<ArrayList<Integer>> adjacencyList
                = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        addEdge(0, 1, adjacencyList);
        System.out.println(adjacencyList);

        addEdge(1, 4, adjacencyList);
        System.out.println(adjacencyList);

        boolean isAvailable = searchEdge(1, 4, adjacencyList);
        System.out.println(isAvailable);

        deleteEdge(1, 4, adjacencyList);
        System.out.println(adjacencyList);

        isAvailable = searchEdge(1, 4, adjacencyList);
        System.out.println(isAvailable);
    }
}
