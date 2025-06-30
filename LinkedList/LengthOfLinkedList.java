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

public class LengthOfLinkedList {
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

    public static int lengthOfLL(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        //head of LinkedList : 
        Node head = createLL(arr);
        System.out.println("head : " + head.data);

        //length of linked list : 
        System.out.println("count : " + lengthOfLL(head));

    }
}
