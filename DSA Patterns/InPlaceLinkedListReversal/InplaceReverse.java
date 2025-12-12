class Node{
    Node next;
    int data;

    Node(Node next1 , int data1){
        this.next = next1;
        this.data = data1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class InplaceReverse {

    public static Node reverseLL(Node root){
        Node curr = root;
        Node prev = null;

        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void print(Node root){
        while(root!=null){
            System.out.println(root.data);
            root = root.next;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        root.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Node nd = reverseLL(root);
        print(nd);
    }
}
