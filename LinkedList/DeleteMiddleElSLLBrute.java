class Node{
    int data;
    Node next;
    Node back;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }

    Node (int data2){
        this.data = data2;
        this.next = null;
    }
}

public class DeleteMiddleElSLLBrute{

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
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
    }

    public static Node deleteMiddleEl(Node head){
        if(head==null || head.next==null) return head;
        Node temp = head;
        int count=0;
        
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        int n = (count/2)+1;
        
        count = 1;
        temp = head;
        while(count!=n-1){
            count++;
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,3,4,7,1,2,6};

        Node head = createLL(arr);
        head = deleteMiddleEl(head);
        
        printLL(head);
    }
}