package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static int V = 6;
    public static Graph graph;

    public static void main(String[] args) {
        graph = new Graph(V);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);

        calcPaths(graph);
    }

    public static int dfs(int v, int mark, int[] marks) {
        marks[v] = mark;
        int size = 1;

        for (int vv : graph.adjacent(v)) {
            if (marks[vv] == 0) {
                size += dfs(vv, mark, marks);
            }
        }
        return size;
    }

    public static void calcPaths(Graph graph) {
        int[] marks = new int[graph.size()];
        List<Integer> markSizes = new LinkedList<>();

        for (int v = 0; v < graph.size(); v++) {
            if (marks[v] == 0) {
                int nextMark = markSizes.size() + 1;
                int size = dfs(v, nextMark, marks);
                markSizes.add(size);
            }
        }
        int[] answer = new int[graph.size()];

        for (int i = 0; i < graph.size(); i++) {
            answer[i] = markSizes.get(marks[i] - 1) - 1;

        }
        System.out.print("How many reachable cities for each city: " + Arrays.toString(answer));
    }

}
