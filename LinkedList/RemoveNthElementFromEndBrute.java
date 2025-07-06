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

public class RemoveNthElementFromEndBrute {

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
        
        if(n==1){
            if(head==null || head.next==null) return null;
        }
        
        Node temp = head;
        int count = 0;
        
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        if(count==n){
            return head.next;
        }
        
        int d = count-n;
        
        temp = head;
        count = 1;
        
        while(temp!=null){
            count++;
            if(count==d){
                break;
            }
            temp = temp.next;
        }

        temp.next = temp.next.next;
        
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,};
        int n = 2;
        
        Node head = createLL(arr);
        head = removeNthNode(head,n);
        
        printLL(head);
    }
}
