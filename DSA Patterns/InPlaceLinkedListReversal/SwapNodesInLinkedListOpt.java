class Node{
    Node next;
    int data;

    Node(int data1, Node node1){
        this.next = node1;
        this.data = data1;
    }

    Node(int data2){
        this.data = data2;
        this.next = null;
    }
}

public class SwapNodesInLinkedListOpt {

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int k = 2;

        Node first = head;
        Node second = head;

        for(int i=1; i<k ; i++){
            first = first.next;
        }

        Node temp = first;
        while(temp.next!=null){
            temp = temp.next;
            second = second.next;
        }

        int val = first.data;
        first.data = second.data;
        second.data = val;

        print(head);
    }
}
