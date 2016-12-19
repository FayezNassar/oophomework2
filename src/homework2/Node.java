package homework2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Fayez Nassar on 12/19/2016.
 */
/**
* A node is vertex in the Graph.
* <p>
*     the node has name, cost and list of children.
* <b> The following fielsds are used in the specification </b>
* <pre>
*     name      : string      // node name
*     cost      : int         // the pass cost via the node
*     data      : T           // data from any type.
*     children  : list<Node>  // the nodes that this has a direct edge to.
* </pre>
*/

public class Node<T>  {
    private final String name;          //the node name
    private final int cost;             //the node cost
    ArrayList<Node<T>> children;  //the nodes that this has a direct edge to.
    private T data;               //the data, the vertix contains.

    /**
    * Constructs a new Node
    * @requires : name != null, cost >= 0 and data != null
    * @effect   : Construct a new node with name, cost, data and zero children
    **/
    public Node(String name, int cost, T data) {
        this.name = name;
        this.cost = cost;
        this.data = data; //use cloneable instead
        this.children = new ArrayList<Node<T>>();
    }

    /**
    * Add a new child.
    * @requiers : child != null.
    * @modified : append the new child to the children list.
    **/
    public void addChild(Node<T> child) {
        this.children.add(child);
    }

    /**
    * @return : an iterator for node children.
    **/
    public Iterator<Node<T>> chilerdenIterator() {
        return children.iterator();
    }
}
