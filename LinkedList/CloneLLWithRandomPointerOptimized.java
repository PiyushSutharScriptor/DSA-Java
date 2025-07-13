import java.util.*;
class Node{
    int data;
    Node next;
    Node random;

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.random = null;
    }
}

public class CloneLLWithRandomPointerOptimized {

    public static Node copyLL(Node head){
        if(head==null) return null;
        
        Node temp = head;

        //copy nodes
        while(temp!=null){
            Node copyNode = new Node(temp.data);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }

        temp = head;
        while(temp!=null){
            if(temp.random!=null) temp.next.random = temp.random.next;
            temp = temp.next.next;
        }

        
        temp = head;
        Node newList = new Node(-1);
        Node res = newList;

        while(temp!=null && temp.next!=null){
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return newList.next;
    }
    
    
    public static void printLL(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(3);
        Node n2 = new Node(2);
        Node n3 = new Node(1);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        
        // next pointers
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
        // random pointers (example setup)
        n1.random = n5; // 3 → 5
        n2.random = n1; // 2 → 3
        n3.random = n3; // 1 → 1 (self)
        n4.random = n2; // 4 → 2
        n5.random = n4; // 5 → 4
        
        Node head = copyLL(n1);
        printLL(head);
        
    }
}
