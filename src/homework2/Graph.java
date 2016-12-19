package homework2;

import java.util.ArrayList;

/**
 * A Graph is a directed graph, it contains nodes that connected to each other
 * with directed edges.
 * <p>
 * graph are mutable,
 * graph saves edges and nodes,
 * graph can be modified by adding nodes and edges.
 * graph can find the shortest/cheapest path between two nodes.
 * <p>
 * <p>
 * <b>The following fields are used in the specification:</b>
 * <pre>
 *   name :  string           // the Graph instance name
 *   nodes        // longitude measured in degrees
 * </pre>
 **/

public class Graph<N> {
    private String name;
    private ArrayList<N> nodes;
    // TODO Write abstraction function and representation invariant

    /**
     * Constructs Graph .
     *
     * @requires name != null
     * @effects constructs a Graph from a none empty name.
     **/
    public Graph(String name) {
        this.name = name;
        this.nodes = new ArrayList<N>();
    }

    /**
     * add a node to the graph.
     * @requiers node != null.
     * @effects add a node to the Graph.
     * @modifies modify the ArrayList.
     */
    public void addNode(N node) {
        this.nodes.add(node);
    }

    /**
     * add an edge to the graph.
     * @requiers a valid two nodes.
     * @effects add a childNode to the childrinns of fatherNode.
     * @modifies modify the ArrayList.
     */
    public void addEdge(N fatherNode, N childNode) {
        // TODO Implement this method
    }

    /**
     * print the nodes in the graph.
     */
    public void printNodes() {
        // TODO Implement this method
    }

    /**
     * print the node childerns in the graph.
     * @requiers a valid father nodes.
     */
    public void printNodeChilderns(N node) {
        // TODO Implement this method
    }

    /**
     * prit shortest path between two nodes.
     * @requiers a valid two list of nodes.
     */
    public void shotrtestPath(ArrayList<N> from, ArrayList<N> to) {
        // TODO Implement this method
    }

}