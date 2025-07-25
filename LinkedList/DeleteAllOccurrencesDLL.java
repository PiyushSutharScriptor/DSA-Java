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

public class DeleteAllOccurrencesDLL{

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

    public static Node deleteEl(Node head , int k){
        Node temp = head;
        
        while(temp.next!=null){
            
            Node newNode = temp.next;
            
            if(temp.data == k){
                Node prev = temp.back;
                Node front = temp.next;   
                
                //case : single element 
                if(prev==null && front==null){
                    return null;
                }
                //case : first element
                else if(prev==null){
                    head = head.next;
                    head.back = null;
                    temp.next = null;
                }
                //case : last element 
                else if(front==null){
                    prev.next = null;
                    temp.back = null;
                }
                else{
                    prev.next = front;
                    front.back = prev;
                    temp.next = null;
                    temp.back = null;
                }
                
            }
            
            temp = newNode;
        }

        

        return head;
    }
    public static void main(String[] args) {
        int arr[] = {30,10,20,30,30,40};
        int k = 30;

        Node head = createDLL(arr);
        head = deleteEl(head,k);
        printDLL(head);

    }
}