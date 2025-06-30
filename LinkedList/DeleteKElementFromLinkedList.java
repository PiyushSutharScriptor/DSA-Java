
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

public class DeleteKElementFromLinkedList {
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

    public static Node deleteKPosition(Node head , int target){

        //case : LL is empty
        if(head==null) return null;

        //case : target is 1st element
        if(target == 1){
            head = head.next;
            return head;
        }

        //case : target not 1st position
        Node temp = head;
        int count = 0;
        Node prev = null;
        while(temp!=null){
            count++;

            if(count==target){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 2;

        Node head = createLL(arr);
        System.out.println(head.data);
        printLL(head);

        System.out.println();

        head = deleteKPosition(head,target);
        printLL(head);
    }
}
