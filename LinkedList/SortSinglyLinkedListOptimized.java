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

public class SortSinglyLinkedListOptimized {

	public static Node createLL(int arr[]) {
		Node head = new Node(arr[0]);
		Node mover = head;

		for(int i=1 ; i<arr.length ; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}

		return head;
	}

	public static void printLL(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp= temp.next;
		}
	}

	public static Node mergeSort(Node head) {
	    if(head==null || head.next==null) return head;
	    
	     Node middle = findMiddle(head);
	     
	     Node left = head;
	     Node right = middle.next;
	     
	     middle.next = null;
	     
	     left = mergeSort(left);
	     right = mergeSort(right);
		
		return merge(left,right);
	}
	
	public static Node findMiddle(Node head){
	    Node slow = head;
	    Node fast = head.next;
	    
	    while(fast!=null && fast.next!=null){
	        slow = slow.next;
	        fast = fast.next.next;
	    }
	    
	    return slow;
	}
	
	public static Node merge(Node left, Node right){
	    Node dummy = new Node(-1);
	    Node temp = dummy;
	    
	    while(left!=null && right!=null){
	        if(left.data<right.data){
	            temp.next = left;
	            temp = left;
	            left = left.next;
	        }
	        else{
	            temp.next = right;
	            temp = right;
	            right = right.next;
	        }
	    }
	    
	    if(left!=null) temp.next = left;
	    else temp.next = right;
	    
	    return dummy.next;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,2,6};

		Node head = createLL(arr);
		head = mergeSort(head);

		printLL(head);
	}
}