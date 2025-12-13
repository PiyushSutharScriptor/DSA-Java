
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

public class RotateListByK {

    public static void print(Node root){
        while(root!=null){
            System.out.print(root.data + " ");
            root = root.next;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        root.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        int k = 2;
        
        // ======Sol :
        int count = 0;
        Node temp = root;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        if(k>count) k=k%count;

        // if(k==0) return root;
        int target = count-k;
        // if(target==0) return root;

        Node second = root;
        while(target-1!=0){
            second = second.next;
            target--;
        }

        Node newHead = second.next;
        second.next = null;

        Node tail = newHead;
        while(tail.next!=null){
            tail = tail.next;
        }

        tail.next = root;

        print(newHead);
    }
}
