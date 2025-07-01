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

public class InsertElementAtKPlaceLL {

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

    public static Node insertAtKPlace(Node head, int val , int position){

        Node temp = head;
        int count = 0;
        Node prev = null;

        //case : when the position is first
        if(head==null || position == 1){
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        // if position is from second to last
        while(temp!=null){
            count++;
            if(count==position-1){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;    
                return head;
            }

            temp = temp.next;
        }

        //case : when the position is beyond the range
        if(position>count+1){
            return head;
        }

        return head;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int position = 4;
        int val = 10;

        Node head = createLL(arr);

        head = insertAtKPlace(head,val,position);
        System.out.println(head.data);

        printLL(head);
    }
}
