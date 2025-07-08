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

public class SortSLL0s1s2sBetter{

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

	public static Node sortSLL(Node head) {
	     Node d0 = new Node(-1);
	     Node d1 = new Node(-1);
	     Node d2 = new Node(-1);
	     
	     Node temp0 = d0;
	     Node temp1 = d1;
	     Node temp2 = d2;
	     
	     Node temp = head;
	     
	     while(temp!=null){
	         if(temp.data==0){
	             temp0.next = temp;
	             temp0 = temp;
	         }
	         else if(temp.data==1){
	             temp1.next = temp;
	             temp1 = temp;
	         }
	         else{
	             temp2.next = temp;
	             temp2 = temp;
	         }
	         
	         temp = temp.next;
	     }
	     
	     temp0.next = d1.next;
	     temp1.next = d2.next;
	     temp2.next = null;
	     
	     return d0.next;
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,1,2,0,1,2};

		Node head = createLL(arr);
		head = sortSLL(head);

		printLL(head);
	}
}