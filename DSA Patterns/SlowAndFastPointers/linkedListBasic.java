class Node {
    int data;
    Node next;

    Node(int d1) {
        this.data = d1;
        this.next = null;
    }
}

public class linkedListBasic {

    public static void print(Node node){
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int n = arr.length;

        Node root = new Node(arr[0]);
        Node mover = root;
        for (int i = 1; i < n; i++) {
            Node n1 = new Node(arr[i]);
            mover.next = n1;
            mover = mover.next;
        }

        print(root);
    }
}
