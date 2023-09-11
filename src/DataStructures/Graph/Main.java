package DataStructures.Graph;

import java.security.PublicKey;

public class Main {
    public static void main(String[] args) {
        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A", "D");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("B", "C");
        myGraph.removeEdge("C","A");

        myGraph.removeVertex("A");

        myGraph.printGraph();
    }
}
