package homework2;

import java.util.WeakHashMap;

/**
 * Created by Fayez Nassar on 12/28/2016.
 */
public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph("first_graph");
        WeightedNode node1 = new WeightedNode("first_node", 3);
        WeightedNode node2 = new WeightedNode("second_node", 1);
        WeightedNode node3 = new WeightedNode("third_node", 4);
        WeightedNode node4 = new WeightedNode("fourth_node", 2);
        graph.addNode(node1);
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addEdge(node1, node2);
    }
}
