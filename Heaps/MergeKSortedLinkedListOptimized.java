import java.util.*;

class Node{
    public int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }

    Node(int val1, Node next){
        this.val = val1;
        this.next = next;
    }
}   
public class MergeKSortedLinkedListOptimized{

    public static Node mergeKLL(Node[] lists){
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for(Node head : lists){
            if(head!=null){
                pq.add(head);
            }
        }

        Node res = new Node(-1);
        Node mover = res;

        while(!pq.isEmpty()){
            Node temp = pq.poll();
            mover.next = temp;
            mover = mover.next;
            
            if(temp.next!=null){
                pq.add(temp.next);
            }
        }

        return res.next;

    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(4);
        n1.next.next = new Node(5);

        Node n2 = new Node(1);
        n2.next = new Node(3);
        n2.next.next = new Node(4);

        Node n3 = new Node(2);
        n3.next = new Node(6);

        Node[] lists = {n1 , n2 , n3};

        Node ans = mergeKLL(lists);

        while(ans!=null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
