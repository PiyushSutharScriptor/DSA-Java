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

public class SortSLL0s1s2sBrute{

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
	     int count0 = 0;
	     int count1 = 0;
	     int count2 = 0;
	     
	     Node temp = head;
	     
	     while(temp!=null){
	         if(temp.data==0) count0++;
	         else if(temp.data==1) count1++;
	         else count2++;
	         
	         temp = temp.next;
	     }
	     
	     temp = head;
	     for(int i=0 ; i<count0 ; i++){
	         temp.data = 0;
	         temp = temp.next;
	     }
	     for(int i=0 ; i<count1 ; i++){
	         temp.data = 1;
	         temp = temp.next;
	     }
	     for(int i=0 ; i<count2 ; i++){
	         temp.data = 2;
	         temp = temp.next;
	     }
	     
	     return head;
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,2,0,1,2,0,1,2};

		Node head = createLL(arr);
		head = sortSLL(head);

		printLL(head);
	}
}