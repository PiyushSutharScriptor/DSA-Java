
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


public class SwapNodesInPairs {

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
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

        print(root);

        Node mainHead = null;
        Node prevNode = null;
        Node head = root;

        while(head!=null && head.next!=null){ 
            Node first = head;
            Node second = head.next;
            Node third = second.next;
            // the third will not give NullPointer because of head.next!=null condition check

            second.next = first;
            first.next = third;

            if(prevNode!=null){
                prevNode.next = second;
            }
            else{
                mainHead = second;
            }

            prevNode = first;
            head = third;
        }

        print(mainHead);
    }
}
