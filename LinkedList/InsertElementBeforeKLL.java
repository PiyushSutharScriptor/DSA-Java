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

public class InsertElementBeforeKLL {

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

    public static Node insertBeforeK(Node head, int val , int k){

        Node temp = head;
        Node prev = null;

        //case : when the position is first
        if(head==null || head.data == k){
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }

        // if position is from second to last and 
        // if the element is not present 
        while(temp!=null && temp.next != null){
            if(temp.next.data==k){
                Node newNode = new Node(val);
                newNode.next = temp.next;
                temp.next = newNode;    
                break;
            }
            temp = temp.next;
        }

        return head;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 4;
        int val = 10;

        Node head = createLL(arr);

        head = insertBeforeK(head,val,k);
        System.out.println(head.data);

        printLL(head);
    }
}
