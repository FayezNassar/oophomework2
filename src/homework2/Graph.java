package homework2;

import javax.xml.soap.*;
import java.util.ArrayList;
import java.util.Collections;

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
    private String name;
    private ArrayList<Node> nodes;
    // TODO Write abstraction function and representation invariant

    /**
     * Constructs Graph .
     *
     * @requires name != null
     * @effects constructs a Graph from a none empty name.
     **/
    public Graph(String name) {
        this.name = name;
        this.nodes = new ArrayList<Node>();
    }

    /**
     * add a node to the graph.
     * @requiers node != null.
     * @effects  add a node to the Graph, keep the nodes sorted by there names.
     */
    public void addNode(Node node) {
        this.nodes.add(node);
        Collections.sort(nodes);
    }

    /**
     * add an edge to the graph.
     * @requiers fatherNode != null and childNode != null.
     * @effects  add a new edge, from father to child nodes to the graph.
     * @modifies modify the father to has a new child,
     * in the case that one of the nodes isn't in the graph, the graph and the nodes will not effected.
     */
    public void addEdge(Node fatherNode, Node childNode) {
        if(!nodes.contains(fatherNode) || !nodes.contains(childNode)) {
            return; //TODO: check what to print in the case oof input error
        }
        fatherNode.addChild(childNode);
    }

    /**
     * print the nodes in the graph.
     * @effect: prints the nodes of the graph
     */
    public void printNodes() {
        System.out.print(name + " contains: ");
        for(Node node : nodes) {
            System.out.print(node.getName() + " ");
        }
    }

    /**
     * print the node childrens in the graph.
     * @requiers a valid father nodes.
     */
    public void printNodeChildrens(Node node) {

    }

    /**
     * prit shortest path between two nodes.
     * @requiers a valid two list of nodes.
     */
    public void shotrtestPath(ArrayList<Node> from, ArrayList<N> to) {
        // TODO Implement this method
    }

}