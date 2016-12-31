package homework2;

import java.util.*;

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
 *   nodes                    // the node that the Graph instance has
 * </pre>
 **/

public class Graph<Node> {
    private final String name;
//    private final ArrayList<Node> nodes;
    private final Map<Node, ArrayList<Node>> nodes;

    /* Abstract Function:
    * A Graph g is not in the world
    * if the name is not valid,
    * if the nodes and the edge is legal, g=(nodes, edges) is out graph in our world.
    * */

    /*
    * Representation invariant for every graph g:
    * each node in his nodes is valid node(!=null).
    * each node have a list of childrens(list!=null), each child node is exist in the graph.
    * each node is presents once, and also the edges.
    * */

    private void checkRep() {
        assert this.name != null :
                "Name is null";
        for (Node node : nodes.keySet()) {
            ArrayList<Node> children = nodes.get(node);
            for (Node child : children) {
                assert nodes.containsKey(child) :
                        "node: " + node.toString() + " has a child: " + child.toString() + " that doesn't exist in the graph";
            }
        }
    }

    /**
     * Constructs Graph .
     *
     * @requires name != null
     * @effects constructs a Graph from a none empty name.
     **/
    public Graph(String name) {
        this.name = name;
//        this.nodes = new ArrayList<Node>();
        nodes = new HashMap<Node, ArrayList<Node>>();
        checkRep();
    }

    /**
     * add a node to the graph.
     *
     * @requiers node != null
     * @effects add a node to the Graph, keep the nodes sorted by there names.
     */
    public void addNode(Node node) {
        if (nodes.containsKey(node)) {
            return;
        }
        nodes.put(node, new ArrayList<Node>());
        checkRep();
    }

    /**
     * add an edge to the graph.
     *
     * @requiers fatherNode != null and childNode != null.
     * @effects add a new edge, from father to child nodes to the graph.
     * @modifies modify the father to has a new child,
     * in the case that one of the nodes isn't in the graph, the graph and the nodes will not effected.
     */

    public void addEdge(Node fatherNode, Node childNode) {
        if (!nodes.containsKey(fatherNode) || !nodes.containsKey(childNode)) {
            return;
        }
        ArrayList<Node> fatherChildren = nodes.get(fatherNode);
        if (!fatherChildren.contains(childNode)) {
            fatherChildren.add(childNode);
        }
        checkRep();
    }

    /**
     * @return: return iterator for the nodes, that start from the first node.
     */
    public Iterator<Node> getNodesIterator() {
        return nodes.keySet().iterator();
    }

    /**
     * @requiers: node != null
     * @return: if the node in the graph, return iterator for the given node children in the graph
     *          otherwise, return an empty iterator.
    * */
    public Iterator<Node> getNodeChildrenIterator(Node node) {
        if(nodes.containsKey(node)) {
            return nodes.get(node).iterator();
        } else {
            return Collections.emptyIterator();
        }
    }

}