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
public class MergeKSortedLinkedListBrute {

    public static Node mergeLL(Node[] lists){
        List<Integer> li = new ArrayList<>();

        int n = lists.length;
        for(int i=0 ; i<n ; i++){
            Node temp = lists[i];
            while(temp!=null){
                li.add(temp.val);
                temp = temp.next;
            }
        }

        Collections.sort(li);

        Node res = new Node(0);
        Node mover = res;
        for(int el : li){
            Node temp = new Node(el);
            mover.next = temp;
            mover = mover.next;
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

        Node ans = mergeLL(lists);
        
        while(ans!=null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
