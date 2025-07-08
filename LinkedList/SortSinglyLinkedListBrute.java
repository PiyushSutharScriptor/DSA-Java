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

public class SortSinglyLinkedListBrute {

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

	public static Node sortLinkedList(Node head) {
		if(head==null || head.next==null) return head;
        ArrayList <Integer> list = new ArrayList<>();
        
        Node temp = head;
        while(temp!=null){
            list.add(temp.data); 
            temp = temp.next;
        }
        
        for(int i=0 ; i<list.size() ; i++){
            for(int j=i+1 ; j<list.size() ; j++){
                if(list.get(j) < list.get(i)){
                    int temper = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temper);
                }
            }
        }
		
		temp = head;
		
		for(int i=0 ; i<list.size() ; i++){
		    temp.data = list.get(i);
		    temp = temp.next;
		}
		
		return head;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,2,6};

		Node head = createLL(arr);
		head = sortLinkedList(head);

		printLL(head);
	}
}