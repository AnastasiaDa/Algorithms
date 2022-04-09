package com.company;

import java.util.*;

public class Main {

    public static int V = 7;
    public static Graph graph;

    public static void main(String[] args) {
        graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);

        virusMeme(graph, 0);
    }

    public static void virusMeme(Graph graph, int startUser) {
        boolean[] visited = new boolean[graph.size()];
        ArrayDeque<Integer> sent = new ArrayDeque<Integer>();
        visited[startUser] = true;
        sent.add(startUser);
        int lastViewer = 0;

        while (!sent.isEmpty()) {
            lastViewer = sent.pollFirst();
            for (int v : graph.nexts(lastViewer)) {
                if (!visited[v]) {
                    visited[v] = true;
                    sent.add(v);
                }
            }
        }
        System.out.print("Last viewer is " + lastViewer);
    }
}
