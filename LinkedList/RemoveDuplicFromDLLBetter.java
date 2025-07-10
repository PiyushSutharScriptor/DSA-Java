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

public class RemoveDuplicFromDLLBetter{

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

    public static Node removeDuplicates(Node head){
        if (head == null) return null;

        Node t1 = head;
        
        while(t1!=null && t1.next!=null){
            
            Node t2 = t1.next;
            
            if(t1.data == t2.data){
                
                t1.next = t2.next;
                
                if(t2.next!=null){
                    t2.next.back = t1;
                }
                
                t2.next = null;
                t2.back = null;
                
            }
            else{
                t1 = t1.next;
            }
            
        }
        

        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,4,5};

        Node head = createDLL(arr);
        head = removeDuplicates(head);
        printDLL(head);

    }
}