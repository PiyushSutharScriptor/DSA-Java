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

public class OddEvenLinkedListOptimized {

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
        
        Node odd = head;
        Node even = head.next;
        Node oldEven = head.next;
        
        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd = even.next;
            
            even.next = odd.next;
            even = odd.next;
        }
        
        odd.next = oldEven;
        
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5};
        Node head = createLL(arr);
        head = oddEvenLL(head);
        printLL(head);
    }
}
