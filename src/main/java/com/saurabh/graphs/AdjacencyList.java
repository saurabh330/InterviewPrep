package com.saurabh.graphs;

import java.util.*;

public class AdjacencyList {

    /**
     * Complexity = O(u+v)
     */
    private boolean undirected;
    private ArrayList<ArrayList<Integer>> adj;

    public AdjacencyList(int n, boolean undirected) {
        this.undirected = undirected;
        this.adj = new ArrayList<>();
        for (int i =0; i<n;i++) {
            ArrayList<Integer> list = new ArrayList<>();
            adj.add(list);
        }
    }
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        if (undirected) {
            adj.get(v).add(u);
        }
    }

    public void printGraph() {
        for (ArrayList<Integer> list: adj) {
            System.out.println(list.toString());
        }
    }

    private void bfsCore(int source, boolean[] visited) {
        if (visited[source] == false) {
            visited[source] = true;
            Queue<Integer> queue = new LinkedList<>();
            queue.add(source);

            while (queue.size() > 0) {
                System.out.println(queue.peek());
                int top = queue.remove();
                List<Integer> neigbours = adj.get(top);
                for(Integer neighbour: neigbours) {
                    if (!visited[neighbour]) {
                        visited[neighbour] = true;
                        queue.add(neighbour);
                    }
                }
            }
        }
    }

    public void bfs() {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        for(int i= 0; i < visited.length; i++) {
            if (!visited[i]) {
                bfsCore(i,visited);
            }
        }
    }

    public static void main (String[] args) {
        AdjacencyList graph = new AdjacencyList(7, true);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(5,6);
        graph.printGraph();
        graph.bfs();
    }
}
