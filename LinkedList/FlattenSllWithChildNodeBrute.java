import java.util.*;
class Node{
    int data;
    Node next;
    Node child;

    Node(int data1){
        this.data = data1;
        this.next = null;
        this.child = null;
    }
}

public class FlattenSllWithChildNodeBrute {

    public static Node flattenLL(Node head){
        ArrayList <Integer> list = new ArrayList<>();
        
        Node temp = head;
        
        while(temp!=null){
            Node t1 = temp;
            while(t1!=null){
                list.add(t1.data);
                t1 = t1.child;
            }
            temp = temp.next;
        }
        
        Collections.sort(list);
        
        if(list.size()==0) return null;
        
        Node newList = new Node(list.get(0));
        Node t2 = newList;
        
        for(int i=1 ; i<list.size() ; i++){
            Node newChild = new Node(list.get(i));
            t2.child = newChild;
            t2 = newChild;
        }
        
        return newList;
    }
    
    public static void printLL(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.child;
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
        
        n2.child = new Node(10);
        
        n3.child = new Node(7);
        n3.child.child = new Node(11);
        n3.child.child.child = new Node(12);
        
        n4.child = new Node(9);
        
        n5.child = new Node(6);
        n5.child.child = new Node(8);
        
        Node head = flattenLL(n1);
        printLL(head);
        
    }
}
