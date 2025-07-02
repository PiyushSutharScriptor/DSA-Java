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

public class DeleteHeadDoublyLinkedList{

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

    public static Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }

        Node prev = head;
        
        head = head.next;

        //closing back connection 
        head.back = null;

        //closing next connection
        prev.next = null;

        return head;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        Node head = createDLL(arr);
        head = deleteHead(head);
        printDLL(head);

    }
}