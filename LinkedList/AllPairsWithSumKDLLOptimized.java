import java.util.*;
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

class Pair{
    int first;
    int second;
    
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
    
}

public class AllPairsWithSumKDLLOptimized{

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

    public static void findPairLL(Node head , int k){
        
        List<Pair> list = new ArrayList<>();
        
        Node left = head;
        Node right = head;
        
        while(right.next!=null){
            right = right.next;
        }
        
        while(left!=right){
            int total = left.data+right.data;
            
            if(total == k){
                list.add(new Pair(left.data, right.data));
                left = left.next;
            }
            else if(total<k){
                right = right.next;
            }
            else{
                right = right.back;
            }
        }
        
        for(Pair p : list){
            System.out.println(p.first + " " + p.second);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,9};
        int k = 5;
        
        Node head = createDLL(arr);
        
        findPairLL(head, k);

    }
}