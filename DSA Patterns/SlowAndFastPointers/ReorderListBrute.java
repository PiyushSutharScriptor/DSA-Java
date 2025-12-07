import java.util.*;

class Node {
    Node next;
    int data;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class ReorderListBrute {

    public static void print(Node root) {
        while (root != null) {
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

        root.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        print(root);

        Node temp = root;
        List<Node> li = new ArrayList<>();

        while (temp != null) {
            li.add(temp);
            temp = temp.next;
        }

        int left = 0;
        int right = li.size() - 1;
        Node res = new Node(-1);
        Node mover = res;
        boolean turn = true;

        while (left <= right) {
            if (turn) {
                Node n1 = li.get(right);
                mover.next = n1;
                mover = mover.next;
                right--;
            } else {
                Node n1 = li.get(left);
                mover.next = n1;
                mover = mover.next;
                left++;
            }
            turn = !turn;
        }

        mover.next = null;

        System.out.println();

        print(res.next);

    }
}
