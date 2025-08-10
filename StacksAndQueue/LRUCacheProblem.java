import java.util.*;

class Node{
    int key;
    int data;
    Node next;
    Node back;

    Node(int key1, int data1, Node next1 , Node back1){
        this.key = key1;
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node (int key2, int data2){
        this.key = key2;
        this.data = data2;
        this.next = null;
        this.back = null;
    }
}

public class LRUCacheProblem {
    private Map<Integer,Node> map;
    private Node head;
    private Node tail;
    private int n;

    LRUCacheProblem(int capacity){
        n = capacity;
        map = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.back = head;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.data = value;
            DeleteNode(node);
            insertAfterHead(node);
        }
        else{
            
            if(map.size()==n){
                Node node = tail.back;
                map.remove(node.key);
                DeleteNode(node);
            }
            Node node = new Node(key, value);
            map.put(key, node);
            insertAfterHead(node);
            
        }
    }

    public void DeleteNode(Node node){
        node.back.next = node.next;
        node.next.back = node.back;
    }

    public void insertAfterHead(Node node){
        node.next = head.next;
        head.next.back = node;
        head.next = node;
        node.back = head;
    }

    public int get(int key){
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);

        DeleteNode(node);
        insertAfterHead(node);

        return node.data;
    }

    public static void main(String[] args) {

        LRUCacheProblem cach = new LRUCacheProblem(4);

        cach.put(2,6);
        cach.put(4,7);
        cach.put(8,11);
        cach.put(7,10);
        
        System.out.println(cach.get(2));
        System.out.println(cach.get(8));

        cach.put(5,6);
        System.out.println(cach.get(7));
        cach.put(5,7);

        System.out.println(cach.map);

    }
}
