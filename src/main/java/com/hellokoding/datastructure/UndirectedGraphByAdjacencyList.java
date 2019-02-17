package com.hellokoding.datastructure;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraphByAdjacencyList {
    int V;
    List<Integer>[] adjacencyList;

    public UndirectedGraphByAdjacencyList(int V) {
        this.V = V;

        adjacencyList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int source, int dest) {
        adjacencyList[source].add(dest);
        adjacencyList[dest].add(source);
    }

    public void print() {
        for (int i = 0; i < V; i++) {
            System.out.printf("Adjacency list of vertex %d is %s %s", i, adjacencyList[i], System.lineSeparator());
        }
    }

    public static void main(String[] args) {
        UndirectedGraphByAdjacencyList graph = new UndirectedGraphByAdjacencyList(3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.print();
    }
}
