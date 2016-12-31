package homework2;

import java.util.*;

/**
 * Created by Fayez Nassar on 12/31/2016.
 */
public class PathFinder {
    /**
     * Return the shortestPath
     * @requiers:
     */
    public static <Node, ShortestPath extends Path<Node, ShortestPath>> ShortestPath FindShortestPath(Graph<Node> graph,
                                                                                     List<ShortestPath> startPaths, List<Node> goals) {
        Map<Node, ShortestPath> paths = new HashMap<Node, ShortestPath>();
        PriorityQueue<ShortestPath> active = new PriorityQueue<ShortestPath>();
        Set<Node> finished = new HashSet<Node>();
        for(ShortestPath path : startPaths) {
            paths.put(path.getEnd(), path);
            active.add(path);
        }

        while (!active.isEmpty()) {
            Node minimumPathEndNode = active.poll().getEnd();
            ShortestPath minimumPath = paths.get(minimumPathEndNode);

            if (goals.contains(minimumPathEndNode)) {
                return minimumPath;
            }
            Iterator<Node> minimumPathEndNodeChildrenIterator = graph.getNodeChildrenIterator(minimumPathEndNode);
            while (minimumPathEndNodeChildrenIterator.hasNext()) {
                Node nextNode = minimumPathEndNodeChildrenIterator.next();
                ShortestPath newPath = minimumPath.extend(nextNode);
                if(!finished.contains(nextNode) && !active.contains(nextNode) && nextNode != minimumPathEndNode) {
                    paths.put(nextNode, newPath);
                    active.add(newPath);
                }
            }
            finished.add(minimumPathEndNode);
        }
        return null;
    }
 }
