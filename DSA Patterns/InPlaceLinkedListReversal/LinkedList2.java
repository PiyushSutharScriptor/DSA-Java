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

public class LinkedList2 {

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
    }

    public static Node reverse(Node root){
        Node curr = root;
        Node prev = null;

        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        int left = 2;
        int right = 5;

        Node leftNode = null;
        Node rightNode = null;

        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data==left){
                leftNode = temp;
            }
            if(temp.next.data==right){
                rightNode = temp;
            }
            temp = temp.next;
        }

        print(leftNode);
        print(rightNode);

        Node nextLeft = leftNode.next;
        Node nextRight = rightNode.next;

        Node rightConnect = nextRight.next;
        nextRight.next = null;

        print(nextLeft);
        Node newHead = reverse(nextLeft);
        print(newHead);
        
        leftNode.next = newHead;
        Node rightTemp = newHead;

        while(rightTemp.next!=null){
            rightTemp = rightTemp.next;
        }

        rightTemp.next = rightConnect;
        print(head);
    }
}
