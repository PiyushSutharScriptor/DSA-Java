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

public class MergeTwoSortedLinkedListOptimized{
    public static Node mergeKLL(Node l1 , Node l2){
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        Node res = new Node(-1);
        Node mover = res;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                mover.next = l1;
                l1 = l1.next;
            }
            else{
                mover.next = l2;
                l2 = l2.next;
            }

            mover = mover.next;
        }

        if(l1!=null) mover.next=l1;
        if(l2!=null) mover.next=l2;

        return res.next;
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(4);
        n1.next.next = new Node(5);

        Node n2 = new Node(1);
        n2.next = new Node(3);
        n2.next.next = new Node(4);

        Node ans = mergeKLL(n1,n2);

        while(ans!=null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}