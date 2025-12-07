class Node {
    Node next;
    int data;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class CycleStartingPointOptimized {

    public static Node findNode(Node root){
        Node slow = root;
        Node fast = root;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                slow = root;

                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);

        root.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n3;

        Node res = findNode(root);
        System.out.println(res.data);
    }    
}
