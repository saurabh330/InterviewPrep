package com.saurabh.graphs;

import java.util.Arrays;

public class AdjacencyMatrix {
    /**
     * Complexity = O(uv)
     */
    private int[][] matrix;

    public AdjacencyMatrix(int n) {
        matrix = new int[n][n];
    }

    public void addEdge(int u, int v, boolean undirected) {
        matrix[u][v] = 1;
        if (undirected) {
            matrix[v][u] = 1;
        }
    }

    public void printMatrix() {
        for (int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(4);
        graph.addEdge(0,1,true);
        graph.addEdge(0,2,true);
        graph.addEdge(0,3,true);
        graph.addEdge(2,3,true);
        graph.printMatrix();
    }
}
