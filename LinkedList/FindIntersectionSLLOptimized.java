import java.util.*;
class Node {
	int data;
	Node next;
	Node back;

	Node(int data1, Node next1) {
		this.data = data1;
		this.next = next1;
	}

	Node (int data2) {
		this.data = data2;
		this.next = null;
	}
}

public class FindIntersectionSLLOptimized{
    
	public static void printLL(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp= temp.next;
		}
	}

	public static Node findIntersection(Node head1 , Node head2) {
	    
	    if(head1==null || head2==null) return null;
	    
	    Node temp1 = head1;
	    Node temp2 = head2;
	    
	    while(temp1!=temp2){
	        temp1 = temp1!=null ? temp1.next : head2;
	        temp2 = temp2!=null ? temp2.next : head1; 
	    }
	    return temp1;
	    
	    /*
	    Basic Syntax : (same logic)
	    while(temp1!=null && temp2!=null){
	        if(temp1==temp2){
	            return temp1;
	        }
	        
	        if(temp1.next==null){
	            temp1 = head2;
	        }
	        else if(temp2.next==null){
	            temp2 = head1
	        }
	        
	        temp1 = temp1.next;
	        temp2 = temp2.next;
	    }
	    return null;
	    */
	}
	
	public static void main(String[] args) {
		int arr[] = {2,2,2,1,1};
        
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(5);
        
        Node head2 = new Node(10);
        head2.next = new Node(20);
        
        Node inter = new Node(100);
        inter.next = new Node(200);
        
        head1.next.next.next = inter;
        head2.next.next = inter;
        
        // findIntersection(head1,head2);
        Node i = findIntersection(head1,head2);
        System.out.println(i.data);
		
	}
}