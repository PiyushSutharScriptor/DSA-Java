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

class Pair{
    
    Node el;
    int num;

    Pair(Node el , int num){
        this.el = el;
        this.num = num;
    }
}


public class AllTraversalInOneTraversal{

    public static void preInPostIter(Node root, List<Integer>pre,List<Integer>in,List<Integer>post){

        Stack<Pair> st = new Stack<>();

        st.add(new Pair(root,1));

        while(!st.isEmpty()){
            Pair node = st.pop();

            if(node.num==1){
                pre.add(node.el.data);
                
                node.num++;
                st.add(node);

                if(node.el.left!=null){
                    st.add(new Pair(node.el.left,1));
                }
            }
            else if(node.num==2){
                in.add(node.el.data);

                node.num++;
                st.add(node);

                if(node.el.right!=null){
                    st.add(new Pair(node.el.right,1));
                }
            }
            else{
                post.add(node.el.data);
            }
        }

    }
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        preInPostIter(root, pre,in,post);

        System.out.println("PreOrder : " + pre);
        System.out.println("InOrder : " + in);
        System.out.println("PostOrder : " + post);
    }
}