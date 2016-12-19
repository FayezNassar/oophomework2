package homework2;

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

public class Graph {
    String name;
    // TODO Write abstraction function and representation invariant
    /**
     * Constructs Graph .
     * @requires a nun empty name string.
     * @effects constructs a Graph from a none empty name.
     **/
    public Graph(String name) {
        // TODO Implement this constructor
    }

    /**
     * add a node to the graph.
     * @requiers a none negative cost and none empty string name.
     * @effects add a node to the
     */
    public void addNode(String nodeName, int cost) {
        // TODO Implement this method
    }

}
