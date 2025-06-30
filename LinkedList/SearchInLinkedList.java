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
public class SearchInLinkedList {
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

    public static boolean searchValue(Node head , int target){
        Node temp = head;
        while(temp!=null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,6,7,8};
        int value = 6;
        int value2 = 116;

        //head
        Node head = createLL(arr);

        //search element
        System.out.println(searchValue(head,value));
        System.out.println(searchValue(head,value2));

    }
}
