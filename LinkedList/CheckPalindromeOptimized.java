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

public class CheckPalindromeOptimized{
    
    public static Node createLL(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static Boolean checkPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node newHead = reverse(slow.next);
        
        Node first = head;
        Node second = newHead;
        
        while(second!=null){
            if(first.data!=second.data){
                reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        
        reverse(newHead);
        return true;
	}
	
	public static Node reverse(Node head){
	    Node temp = head;
        Node prev = null;
        Node front = null;
        
        //main logic 
        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        
        return prev;
	    
	}

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,1};
        Node head = createLL(arr);
        System.out.println(checkPalindrome(head));
    }
}
