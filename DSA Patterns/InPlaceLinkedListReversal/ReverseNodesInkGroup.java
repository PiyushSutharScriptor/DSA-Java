import java.util.*;

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

    public static Node findRevOrder(Node head, int k){
        List<Integer> li = new ArrayList<>();
        Node temp = head;

        while(temp!=null){
            li.add(temp.data);
            temp = temp.next;
        }

        for(int i=0 ; i<li.size()-k ; i+=k){
            Collections.reverse(li.subList(i,i+k));
        }

        Node dummy = new Node(-1);
        Node mover = dummy;
        int i=0;

        while(i!=li.size()){
            mover.next = new Node(li.get(i));
            mover = mover.next;
            i++;
        }

        return dummy.next;
    }

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
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

        int k = 3;
        Node res = findRevOrder(root,k);
        print(res);
    }
}
