package com.saurabh;

import com.saurabh.graphs.AdjacencyMatrix;
import com.saurabh.graphs.Graph;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addEdge("A","B");
        myGraph.printGraph();
    }
}