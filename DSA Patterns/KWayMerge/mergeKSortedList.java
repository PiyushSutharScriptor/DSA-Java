import java.util.*;

class Node{
    Node next;
    int data;

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class mergeKSortedList {

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        //create list
        Node root = new Node(1);
        root.next = new Node(4);
        root.next.next = new Node(5);

        Node root2 = new Node(1);
        root2.next = new Node(3);
        root2.next.next = new Node(4);

        Node root3 = new Node(2);
        root3.next = new Node(6);

        //printing ll's
        print(root);
        print(root2);
        print(root3);

        Node[] arr = {root,root2,root3};

        PriorityQueue<Node> heap = new PriorityQueue<>((a,b)->a.data-b.data);

        for(Node head : arr){
            if(head!=null) heap.add(head);
        }

        //create a ll
        Node res = new Node(-1);
        Node mover = res;
        while(!heap.isEmpty()){
            Node temp = heap.poll();
            mover.next = new Node(temp.data);
            mover = mover.next;

            if(temp.next!=null){
                heap.add(temp.next);
            }
        }

        //final ll print
        print(res.next);

    }
}
