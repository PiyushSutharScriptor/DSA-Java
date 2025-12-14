
class Node{
    Node next;
    int data;

    Node(int data1, Node node1){
        this.next = node1;
        this.data = data1;
    }

    Node(int data2){
        this.data = data2;
        this.next = null;
    }
}

public class SwapNodesInLinkedList {

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int k = 2;

        Node temp = head;
        int count = 0;
        
        while(temp!=null){
            count++;
            temp = temp.next;
        }

        int t1 = k-1;
        int t2 = count-k;

        Node prev1 = null;
        Node curr1 = head;

        while(t1!=0){
            prev1 = curr1;
            curr1 = curr1.next;
            t1--;
        }

        //----------

        Node prev2 = null;
        Node curr2 = head;

        while(t2!=0){
            prev2 = curr2;
            curr2 = curr2.next;
            t2--;
        }

        // if(curr1==curr2) return head;

        if(prev1!=null)
            prev1.next = curr2;
        else 
            head = curr2;

        if(prev2!=null)
            prev2.next = curr1;
        else
            head = curr1;
        
        Node nextNode = curr1.next;
        curr1.next = curr2.next;
        curr2.next = nextNode;

        print(curr1);
        print(curr2);
        print(head);
    }
}
