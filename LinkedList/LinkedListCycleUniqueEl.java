import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node(int data2){
        this.data = data2;
        this.next = null;
    }
}

public class LinkedListCycleUniqueEl {
    
    public static Node createLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        
        mover.next = head;

        return head;
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static Boolean findLoop(Node head) {
		Map <Node, Integer> map = new HashMap<>();
		Node temp = head;
		while(temp!=null) {
			map.put(temp, map.getOrDefault(temp, 0)+1);
            if(map.get(temp)==2) {
    			return true;
    		}
    		temp = temp.next;
		}
		
		return false;
	}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        Node head = createLL(arr);
        System.out.println(findLoop(head));
    }
}
