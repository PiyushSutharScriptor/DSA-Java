
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

public class ReverseNodesInkGroup {

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
            root = root.next;
        }
    }

    public static Node findRevOrder(Node root, int k){
        Node head = root;
        Node mainHead = null;
        Node prevTail = null;

        while (head!=null){

            Node kthNode = head;

            for(int i=0; i<k-1 && kthNode!=null; i++){
                kthNode = kthNode.next;
            }

            if(kthNode==null) break;

            Node nextNode = kthNode.next;
            kthNode.next = null;

            Node newHead = reverse(head);

            if(mainHead==null) mainHead=newHead;

            if(prevTail != null){
                prevTail.next = newHead;
            }

            prevTail=head;
            head = nextNode;
        }

        if(prevTail != null){
            prevTail.next = head;
        }

        return mainHead;
    }

    public static Node reverse(Node root){
        Node curr = root;
        Node prev = null;

        while (curr!=null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
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

        int k = 3;
        Node res = findRevOrder(root,k);
        print(res);
    }
}
