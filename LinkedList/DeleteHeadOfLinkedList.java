class Node{
    int data;
    Node next;

    Node(int data1 , Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data2){
        this.data = data2;
        this.next = null;
    }
}
public class DeleteHeadOfLinkedList {

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
            temp = temp.next;
        }
    }

    public static Node deleteHead(Node head){
        if(head == null) return head;
        head = head.next;

        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        
        //head before delete
        System.out.println("Before delete : ");
        Node head = createLL(arr);
        System.out.println(head.data);
        printLL(head);

        System.out.println();

        //head after delete
        System.out.println("After delete : ");
        head = deleteHead(head);
        System.out.println(head.data);
        printLL(head);

        

    }
}
