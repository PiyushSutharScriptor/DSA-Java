import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data1){
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

class Temp{
    int idx;
    int level;
    Node node;

    Temp(int idx1, int level1, Node node1){
        this.idx = idx1;
        this.level = level1;
        this.node = node1;
    }
}


public class RightViewLevelOrder {

    public static List<Integer> rightView(Node node){

        Queue<Temp> que = new LinkedList<>();
        que.add(new Temp(0, 0, node));

        Map<Integer,List<Integer>> mp = new TreeMap<>();

        while(!que.isEmpty()){
            int size = que.size();

            while(size!=0){
                Temp el = que.poll();
                int ind = el.idx;
                int lvl = el.level;
                Node nod = el.node;
                
                mp.computeIfAbsent(ind,k->new ArrayList<>()).add(nod.data);

                if(nod.left!=null){
                    que.add(new Temp(ind-1, lvl+1, nod.left));
                }
                if(nod.right!=null){
                    que.add(new Temp(ind+1, lvl+1, nod.right));
                }
                size--;
            }
        }

        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer,List<Integer>> entry : mp.entrySet()){
            if(entry.getKey()>=0){
                res.add(entry.getValue().get(0));
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(15);

        List<Integer> view = rightView(root);

        System.out.println("Right View : ");
        System.out.println(view);
    }
}
