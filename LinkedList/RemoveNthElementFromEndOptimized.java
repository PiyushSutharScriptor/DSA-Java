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

public class RemoveNthElementFromEndOptimized {

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

    public static Node removeNthNode(Node head , int n) {
        
        if(head==null || (n==1 && head.next==null)) return null;
        
        Node fast = head;
        for(int i=0 ; i<n ; i++){
            fast = fast.next;
        }
        
        if(fast==null) return head.next;
        
        Node slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int n = 3;
        
        Node head = createLL(arr);
        head = removeNthNode(head,n);
        
        printLL(head);
    }
}
