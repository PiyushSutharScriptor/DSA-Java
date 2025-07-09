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

public class AddTwoLinkedListElementsBetter {

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
    
    public static Node addOneLL(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        
        Node d = new Node(-1);
        Node temp3 = d;
        
        int carry = 0;
        
        while(temp1!=null || temp2!=null || carry!=0){
            int total = 0;
            
            int v1 = temp1!=null ? temp1.data : 0;
            int v2 = temp2!=null ? temp2.data : 0;
            
            total = v1+v2+carry;
            
            if(total>=10){
                carry = total/10;
                temp3.next = new Node(total%10);
            }
            else{
                carry = 0;
                temp3.next = new Node(total);
            }
            temp3 = temp3.next;
            
            if(temp1!=null) temp1=temp1.next;
            if(temp2!=null) temp2=temp2.next;
            
        }
        
        if(carry>0){
            temp3.next = new Node(carry);
            temp3 = temp3.next;
        }
        
        return d.next;
    }

    

    public static void main(String[] args) {
        int arr[] = {9,9,9,9};
        int arr2[] = {9,9};

        Node head1 = createLL(arr);
        Node head2 = createLL(arr2);

        Node head = addOneLL(head1,head2);

        printLL(head);
    }
}
