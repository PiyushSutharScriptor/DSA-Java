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

public class DeleteMiddleElSLLOptimized {

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

	public static Node deleteMiddleEl(Node head) {
		if(head==null || head.next==null) return null;

		Node fast = head;
		Node slow = head;
		Node prev = null;

		while(fast.next!=null && fast.next.next!=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		if(fast.next!=null) {
			prev = slow;
			slow = slow.next;
		}

		prev.next = prev.next.next;

		return head;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,4,1,2,6};

		Node head = createLL(arr);
		head = deleteMiddleEl(head);

		printLL(head);
	}
}