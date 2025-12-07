class Node {
    Node next;
    int data;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    public static Node reverse(Node root){
        Node prev = null;
        Node curr = root;

        while(curr!=null){
            Node nxt = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nxt;
        }

        return prev;
    }

    public static boolean isPalindrome(Node root){
        Node slow = root;
        Node fast = root;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = reverse(slow);

        while (second!=null) {
            if(root.data!=second.data) return false;
            root = root.next;
            second = second.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(5);
        Node n5 = new Node(2);
        Node n6 = new Node(1);

        root.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        System.out.println(isPalindrome(root));
    }
}
