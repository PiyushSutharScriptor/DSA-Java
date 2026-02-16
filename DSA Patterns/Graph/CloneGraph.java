import java.util.*;

class CloneGraphBrute {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
                                
        Node copy = new Node(node.val);

        for(Node nei : node.neighbors){
            copy.neighbors.add(cloneGraph(nei));
        }

        return copy;
    }
}
