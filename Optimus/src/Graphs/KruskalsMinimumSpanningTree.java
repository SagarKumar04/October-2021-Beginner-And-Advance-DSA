package Graphs;

import java.util.Arrays;

public class KruskalsMinimumSpanningTree {
    int V, E;
    Edge edge[];

    class Edge implements Comparable<Edge> {
        int source, destination, weight;

        @Override
        public int compareTo(Edge o) {
            return (this.weight - o.weight);
        }
    }

    class Subset {
        int parent, rank;
    }

    KruskalsMinimumSpanningTree(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];

        for(int i = 0; i < E; i++) {
            edge[i] = new Edge();
        }
    }

    private int find(Subset subset[], int vertex) {
        if(subset[vertex].parent != vertex) {
            subset[vertex].parent = find(subset, subset[vertex].parent);
        }
        return subset[vertex].parent;
    }

    private void union(Subset subset[], int sourceVertex, int destinationVertex) {
        int sourceRoot = find(subset, sourceVertex);
        int destinationRoot = find(subset, destinationVertex);

        if(subset[sourceRoot].rank < subset[destinationRoot].rank) {
            subset[sourceRoot].parent = destinationRoot;
        }
        else if(subset[sourceRoot].rank > subset[destinationRoot].rank) {
            subset[destinationRoot].parent = sourceRoot;
        }
        else {
            subset[destinationRoot].parent = sourceRoot;
            subset[sourceRoot].rank = subset[sourceRoot].rank++;
        }
    }

    private void findKruskalsMST() {
        Edge result[] = new Edge[V];
        Subset subset[] = new Subset[V];

        for(int i = 0; i < V; i++) {
            result[i] = new Edge();
        }

        Arrays.sort(edge);

        for(int i = 0; i < V; i++) {
            subset[i] = new Subset();
            subset[i].parent = i;
            subset[i].rank = 0;
        }

        int currentEdgeIndex = 0;
        int edgeCount = 0;

        while(edgeCount < (V - 1)) {
            Edge currentEdge = edge[currentEdgeIndex++];

            int sourceSubset = find(subset, currentEdge.source);
            int destinationSubset = find(subset, currentEdge.destination);

            if(sourceSubset != destinationSubset) {
                result[edgeCount++] = currentEdge;
                union(subset, sourceSubset, destinationSubset);
            }
        }

        //calculate the cost of the generated MST
        int costOfMST = 0;
        for(int i = 0; i < edgeCount; i++) {
            System.out.println(result[i].source + "-----" + result[i].destination + "-----" + result[i].weight);
            costOfMST = costOfMST + result[i].weight;
        }

        System.out.println("Cost: " + costOfMST);
    }

    public static void main(String[] args) {
        int V = 4;
        int E = 5;
        KruskalsMinimumSpanningTree kMst = new KruskalsMinimumSpanningTree(V, E);

        kMst.edge[0].source = 0;
        kMst.edge[0].destination = 1;
        kMst.edge[0].weight = 10;

        kMst.edge[1].source = 0;
        kMst.edge[1].destination = 2;
        kMst.edge[1].weight = 6;

        kMst.edge[2].source = 0;
        kMst.edge[2].destination = 3;
        kMst.edge[2].weight = 5;

        kMst.edge[3].source = 1;
        kMst.edge[3].destination = 3;
        kMst.edge[3].weight = 15;

        kMst.edge[4].source = 2;
        kMst.edge[4].destination = 3;
        kMst.edge[4].weight = 4;

        kMst.findKruskalsMST();
    }
}
