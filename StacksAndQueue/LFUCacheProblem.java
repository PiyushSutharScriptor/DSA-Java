import java.util.*;

class Node {
    int key, value, freq;
    Node next, back;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.freq = 1;
        this.next = null;
        this.back = null;
    }
}

class DoublyLinkedList {
    Node head, tail;
    int size;

    DoublyLinkedList() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.back = head;
        size = 0;
    }

    void addNode(Node node) {
        node.next = head.next;
        node.back = head;
        head.next.back = node;
        head.next = node;
        size++;
    }

    void removeNode(Node node) {
        node.back.next = node.next;
        node.next.back = node.back;
        size--;
    }

    Node removeLast() {
        if (size > 0) {
            Node last = tail.back;
            removeNode(last);
            return last;
        }
        return null;
    }
}

public class LFUCacheProblem {
    private Map<Integer, Node> nodeMap;
    private Map<Integer, DoublyLinkedList> freqMap;
    private int capacity, minFreq;

    LFUCacheProblem(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
        nodeMap = new HashMap<>();
        freqMap = new HashMap<>();
    }

    public int get(int key) {
        if (!nodeMap.containsKey(key)) return -1;

        Node node = nodeMap.get(key);
        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (nodeMap.containsKey(key)) {
            Node node = nodeMap.get(key);
            node.value = value;
            updateFrequency(node);
        } else {
            if (nodeMap.size() == capacity) {
                DoublyLinkedList minFreqList = freqMap.get(minFreq);
                Node toRemove = minFreqList.removeLast();
                nodeMap.remove(toRemove.key);
            }
            Node newNode = new Node(key, value);
            nodeMap.put(key, newNode);
            minFreq = 1;
            freqMap.putIfAbsent(1, new DoublyLinkedList());
            freqMap.get(1).addNode(newNode);
        }
    }

    private void updateFrequency(Node node) {
        int oldFreq = node.freq;
        freqMap.get(oldFreq).removeNode(node);

        if (oldFreq == minFreq && freqMap.get(oldFreq).size == 0) {
            minFreq++;
        }

        node.freq++;
        freqMap.putIfAbsent(node.freq, new DoublyLinkedList());
        freqMap.get(node.freq).addNode(node);
    }

    public static void main(String[] args) {
        LFUCacheProblem cache = new LFUCacheProblem(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3); 
        System.out.println(cache.get(2)); 
        System.out.println(cache.get(3));
        cache.put(4, 4); 
        System.out.println(cache.get(1)); 
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
