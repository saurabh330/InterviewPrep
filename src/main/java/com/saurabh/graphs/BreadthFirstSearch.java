package com.saurabh.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    /**
     *
     * @param V
     * @param adjList
     * @return
     *
     * TimeComplexity: O(N) + O(2E) where N = Nodes and 2E is for total degrees as we traverse all adjacent nodes
     * SpaceComplexity: O(3N) ~ O(N)
     *
     */
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adjList) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);

            for (Integer neighbour: adjList.get(node)) {
                if (visited[neighbour] == false) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }

    public static void main (String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adjList.add(new ArrayList<>());
        }
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        adjList.get(0).add(4);
        adjList.get(4).add(0);
        adjList.get(1).add(2);
        adjList.get(2).add(1);
        adjList.get(1).add(3);
        adjList.get(3).add(1);

        BreadthFirstSearch bfs = new BreadthFirstSearch();
        ArrayList<Integer> solution = bfs.bfsOfGraph(5, adjList);
        int n = solution.size();
        for (int i = 0; i < n; i++) {
            System.out.println(solution.get(i));
        }

    }
}
