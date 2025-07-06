import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data2) {
        this.data = data2;
        this.next = null;
    }
}

public class OddEvenLinkedListBrute {

    public static Node createLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node oddEvenLL(Node head) {

        if(head==null || head.next==null) return head;

        ArrayList<Integer> list = new ArrayList<>();
        
        Node slow = head;
        Node fast = head.next;
        while(slow!=null){
            list.add(slow.data);
            if(slow.next!=null){
                slow = slow.next.next;
            }
            else{
                break;
            }
        }
        while(fast!=null){
            list.add(fast.data);
            if(fast.next!=null){
                fast = fast.next.next;
            }
            else{
                break;
            }
        }
        
        slow = head;
        int i=0;
        while(slow!=null){
            slow.data=list.get(i);
            i++;
            slow = slow.next;
        }
        
        return head;        
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        Node head = createLL(arr);
        head = oddEvenLL(head);
        printLL(head);
    }
}
