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

public class FlattenSllWithChildNodeOptimized {

    public static Node flattenLL(Node head){
    
        if (head == null || (head.next == null && head.child == null)) return head;

        //Option : 01
        Node temp = head;
        Node mover = head.next;
        
        while(mover!=null){
            temp = flattenTwo(temp,mover);
            mover = mover.next;
        }
        
        return temp;


        // Option : 02
        /* 
        head.next = flattenLL(head.next);
        return flattenTwo(head,head.next);
        */ 
    }
    
    public static Node flattenTwo(Node list1 , Node list2){
        Node newList = new Node(-1);
        Node temp = newList;
        
        while(list1!=null && list2!=null){
            if(list1.data<list2.data){
                temp.child = list1;
                temp = temp.child;
                list1 = list1.child;
            }
            else{
                temp.child = list2;
                temp = temp.child;
                list2 = list2.child;
            }
        }
        
        if(list1!=null){
            temp.child = list1;
        }
        else{
            temp.child = list2;
        }
        
        return newList.child;
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
