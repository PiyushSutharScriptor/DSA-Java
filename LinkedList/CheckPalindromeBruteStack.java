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

public class CheckPalindromeBruteStack{
    
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
        Deque<Integer> stack = new ArrayDeque<>();
        Node temp = head;
        
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
            if(temp.data!=stack.peek()){
                return false;
            }
            temp = temp.next;
            stack.pop();
        }
        
        return true;
        
	}

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,1};
        Node head = createLL(arr);
        System.out.println(checkPalindrome(head));
    }
}
