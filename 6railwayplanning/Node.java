import java.util.*;

public class Node {

    private int station;

    private Map<Integer, Node> edges = new HashMap<>();

    private Node pred = this;

    private boolean visited = false;

    public Node (int station) {
        this.station =  station;
    }

    public int getStation() {
        return station;
    }

    public Map<Integer, Node> getEdges(){
        return edges;
    }

    public void addEdge(int w, Node e) {
        edges.put(w, e);
    }

    public void setPred(Node v) {
        pred = v;
    }

    public Node getPred() {
        return pred;
    }

    public void setVisited() {
        visited = true; 
    }

    public void setNotVisited() {
        visited = false; 
    }

    public boolean getVisited() {
        return visited ; 
    }

    public int depth(Node start) {
        return depth(start, pred);
    }
    
    private int depth(Node start, Node node) {
        if (start == node) {
            return 1;
        } else {
            return 1 + depth(start, node.getPred());
        }
    }
}     