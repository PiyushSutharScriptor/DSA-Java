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

public class InsertElementBeforeKthNodeDLL{

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

    public static Node insertElBeforeK(Node head , int val , int k){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp = temp.next;
        }
        Node prev = temp.back;
        
        if(k>count){
            return null;
        }
        //case : k is head
        else if(prev==null){
            Node newNode = new Node(val,head,null);
            head.back = newNode;
            return newNode;
        }
        //case : remaining 
        else{
            Node newNode  = new Node(val,temp,prev);
            prev.next = newNode;
            temp.back = newNode;
        }
        
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int k = 5;
        int val = 100;

        Node head = createDLL(arr);
        head = insertElBeforeK(head,val,k);
        printDLL(head);
    }
}