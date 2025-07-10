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

public class AllPairsWithSumKDLLBetter{

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
        Node t1 = head;
        Node t2 = head.next;
        
        List <Pair> list = new ArrayList<>();
        while(t1.next.next!=null){
            t2 = t1.next;
            
            while(t2.next!=null){
                
                if(t1.data+t2.data==k){
                    list.add(new Pair(t1.data , t2.data));
                }
                
                t2 = t2.next;
            }
            
            t1 = t1.next;
        }
        
        for(Pair p : list){
            System.out.println(p.first + " " + p.second);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,9};
        int k = 5;
        
        Node head = createDLL(arr);
        
        findPairLL(head, k);

    }
}