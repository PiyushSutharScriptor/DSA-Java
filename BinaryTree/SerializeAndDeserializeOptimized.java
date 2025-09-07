import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data1) {
        this.data = data1;
        this.left = null;
        this.right = null;
    }

}

public class SerializeAndDeserializeOptimized {
    public static String serialize(Node root){
        if(root==null) return null;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        StringBuilder str = new StringBuilder();

        while(!q.isEmpty()){
            
            Node node = q.poll();

            if(node==null){
                str.append("n ");
                continue;
            }

            str.append(node.data + " ");

            q.add(node.left);
            q.add(node.right);
        }

        return str.toString();

    }

    public static Node deserialize(String str){
        if(str.isEmpty() || str.equals("")) return null;

        String values[] = str.split(" ");
        Node node1 = new Node(Integer.parseInt(values[0]));

        Queue<Node> que = new LinkedList<>();
        que.add(node1);
        
        int i=1;

        while(!que.isEmpty() && i<values.length){

            Node node = que.poll();

            if(!values[i].equals("n")){
                node.left = new Node(Integer.parseInt(values[i]));
                que.add(node.left);
            }
            i++;
            
            if(!values[i].equals("n")){
                node.right = new Node(Integer.parseInt(values[i]));
                que.add(node.right);
            }
            i++;
        }

        return node1;
    }

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(13);
        root.right.left = new Node(4);
        root.right.right = new Node(5);

        String str = serialize(root);
        System.out.println(str);

        Node res = deserialize(str);
        System.out.println(res.data);
    }
}
