class Node{
    int data;
    Node next;
    Node back;

    Node(int data1 , Node next1 , Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node (int data2){
        this.data = data2;
        this.next = null;
        this.back = null;
    }
}

public class DeleteKthElDoublyLinkedList{

    public static Node createDLL(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1 ; i<arr.length ; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    public static void printDLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp= temp.next;
        }
    }

    public static Node deleteKthEl(Node head , int k){
        Node temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp = temp.next;
        }
        
        Node prev = temp.back;
        Node front = temp.next;

        //case : single element
        if(prev==null && front==null){
            return null;
        }
        //case : last element 
        else if(front==null){
            prev.next = null;
            temp.back = null;
        }
        //case : first element
        else if(prev==null){
            front.back = null;
            temp.next = null;
            return front;
        }
        //case : remaining elements
        else{
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
        }

        return head;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int k = 2;

        Node head = createDLL(arr);
        head = deleteKthEl(head,k);
        printDLL(head);

    }
}