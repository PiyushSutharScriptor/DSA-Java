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

public class CloneLLWithRandomPointerBetter {

    public static Node copyLL(Node head){
        if(head==null) return null;
        
        Node temp = head;
        Map<Node,Node> map = new HashMap<>();
        
        while (temp!=null){
            Node newNode = new Node(temp.data);
            map.put(temp,newNode);
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
            Node copyNode = map.get(temp);
            copyNode.next = map.get(temp.next);
            copyNode.random = map.get(temp.random);
            temp = temp.next;
        }
        
        return map.get(head);
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
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
        n1.random = n5; 
        n2.random = n1; 
        n3.random = n3; 
        n4.random = n2; 
        n5.random = n4; 
        
        Node head = copyLL(n1);
        printLL(head);
        
    }
}
