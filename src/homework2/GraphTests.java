package homework2;


import org.junit.Test;

import java.util.Iterator;
import static org.junit.Assert.*;

/**
 * This class contains a set of test cases that can be used to test the graph
 * and shortest path finding algorithm implementations of homework assignment
 * #2.
 */
public class GraphTests extends ScriptFileTests {

	// black-box test are inherited from super
	public GraphTests(java.nio.file.Path testFile) {
		super(testFile);
	}

	@Test
	public void AddSameNodeToTwoGraph() {
		Graph<WeightedNode> graph1 = new Graph("first_graph");
		Graph<WeightedNode> graph2 = new Graph("second_graph");
		WeightedNode node1 = new WeightedNode("first_node", 1);
        graph1.addNode(node1);
        graph2.addNode(node1);
        Iterator<WeightedNode> graph1Iterator = graph1.getNodesIterator();
        Iterator<WeightedNode> graph2Iterator = graph2.getNodesIterator();
        assertTrue(graph1Iterator.next() == graph2Iterator.next());
	}

	@Test
    public void AddEdgeTwoOneGraph() {
        Graph<WeightedNode> graph1 = new Graph("first_graph");
        Graph<WeightedNode> graph2 = new Graph("second_graph");
        WeightedNode node1 = new WeightedNode("first_node", 1);
        WeightedNode node2 = new WeightedNode("second_node", 2);
        graph1.addNode(node1);
        graph2.addNode(node1);
        graph2.addNode(node2);
        graph2.addEdge(node1, node2);
        Iterator<WeightedNode> node1InGraph1ChildrenIterator = graph1.getNodeChildrenIterator(node1);
        int numOfNode1InGraph1 = 0;
        while (node1InGraph1ChildrenIterator.hasNext()) {
            numOfNode1InGraph1++;
            node1InGraph1ChildrenIterator.next();
        }
        Iterator<WeightedNode> node1InGraph2ChildrenIterator = graph2.getNodeChildrenIterator(node1);
        int numOfNode1InGraph2 = 0;
        while (node1InGraph2ChildrenIterator.hasNext()) {
            numOfNode1InGraph2++;
            node1InGraph2ChildrenIterator.next();
        }
        assertEquals(numOfNode1InGraph1, 0);
        assertEquals(numOfNode1InGraph2, 1);
    }

    @Test
    public void addNullNodeToGraph() {
        Graph<WeightedNode> graph1 = new Graph("first_graph");
        WeightedNode node1 = new WeightedNode("first_node", 1);
        graph1.addNode(node1);
        graph1.addNode(null);
        Iterator<WeightedNode> nodesIterator = graph1.getNodesIterator();
        int numberOfGraph1Nodes = 0;
        while (nodesIterator.hasNext()) {
            numberOfGraph1Nodes++;
            nodesIterator.next();
        }
        assertEquals(numberOfGraph1Nodes, 2);
        graph1.addEdge(node1, null);
        graph1.addEdge(null, node1);
        Iterator<WeightedNode> node1ChildrenIterator = graph1.getNodeChildrenIterator(node1);
        int numberOfNode1ChildrenInGraph1 = 0;
        while (node1ChildrenIterator.hasNext()) {
            numberOfNode1ChildrenInGraph1++;
            node1ChildrenIterator.next();
        }
        assertEquals(numberOfNode1ChildrenInGraph1, 1);
    }
}
