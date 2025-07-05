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

public class LengthOfCycleLoopSLLBetter{
    
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
    
    public static int lengthOfCycleLoop(Node head) {
        Node temp = head;
        int count = 1;
        
        Map <Node, Integer> map = new HashMap<>();
        
        while(temp!=null){
            
            if(map.containsKey(temp)){
                int value = map.get(temp);
                return count-value; 
            }
            else{
                map.put(temp,count);
                count++;
            }
            
            temp = temp.next;
        }
        return -1;
	}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node head = createLL(arr);
        int ans = lengthOfCycleLoop(head);
        System.out.println(ans);
    }
}
