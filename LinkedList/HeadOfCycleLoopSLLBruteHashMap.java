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

public class HeadOfCycleLoopSLLBruteHashMap {
    
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

    public static Node retrunHeadOfLoop(Node head) {
		Map <Node, Integer> map = new HashMap<>();
		Node temp = head;
		while(temp!=null) {
			map.put(temp, map.getOrDefault(temp, 0)+1);
            if(map.get(temp)==2) {
    			return temp;
    		}
    		temp = temp.next;
		}
		
		return null;
	}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        Node head = createLL(arr);
        head = retrunHeadOfLoop(head);
        System.out.println(head.data);
    }
}
