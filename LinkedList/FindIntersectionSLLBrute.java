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

public class FindIntersectionSLLBrute{
    
	public static void printLL(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp= temp.next;
		}
	}

	public static Node findIntersection(Node head1 , Node head2) {
	    Node temp1 = head1;
	    Node temp2 = head2;
	    
	    Set <Node> set = new HashSet<>();
	    
	    while(temp1!=null){
	        set.add(temp1);
	        temp1 = temp1.next;
	    }
	    
	    while(temp2!=null){
	        if(set.contains(temp2)){
	            return temp2;
	        }
	        set.add(temp2);
	        temp2 = temp2.next;
	    }
	    
	    return null;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,2,2,1,1};
        
        Node head1 = new Node(1);
        head1.next = new Node(2);
        
        Node head2 = new Node(10);
        head2.next = new Node(20);
        
        Node inter = new Node(100);
        inter.next = new Node(200);
        
        head1.next.next = inter;
        head2.next.next = inter;
        
        Node i = findIntersection(head1,head2);
        System.out.println(i.data);
		
	}
}