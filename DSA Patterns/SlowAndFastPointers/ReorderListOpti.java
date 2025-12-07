class Node {
    Node next;
    int data;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class ReorderListOpti {

    public static void print(Node root){
        while(root!=null){
            System.err.print(root.data + " ");
            root = root.next;
        }
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

        //split into two half
        Node slow = root;
        Node fast = root;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = slow.next;
        slow.next = null;

        //reversing the second half : 
        Node prev = null;
        Node curr = second;

        while(curr!=null){
            Node nxt = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nxt;
        }



        Node fList = root;
        Node sList = prev;

        while(sList!=null){
            Node fnext = fList.next;
            Node snext = sList.next;

            fList.next = sList;
            sList.next = fnext;

            fList = fnext;
            sList = snext;
        }

        print(root);
    }
}
