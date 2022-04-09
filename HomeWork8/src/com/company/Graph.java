package com.company;

import java.util.LinkedList;
import java.util.List;

public class Graph {
    
    private List<Integer>[] verticesInfo;

    public Graph (int V) {
        this.verticesInfo = new LinkedList[V];

        for(int i = 0; i < V; i++) {

            verticesInfo[i] = new LinkedList();
        }
    }

    public List<Integer>[] getVerticesInfo() {
        return verticesInfo;
    }

    public void addEdge (int a, int b) {
        verticesInfo[a].add(b);
        verticesInfo[b].add(a);
    }

    public List<Integer> nexts(int v) {
        return verticesInfo[v];
    }

//    vertices():
//            return номера от 0 до V

    public int size () {
        return verticesInfo.length;
    }

}
