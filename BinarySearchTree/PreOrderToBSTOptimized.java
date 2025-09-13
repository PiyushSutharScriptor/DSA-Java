class Node {
    int data;
    Node left;
    Node right;

    Node(int data1) {
        this.data = data1;
        this.left = null;
        this.right = null;
    }
}

public class PreOrderToBSTOptimized {
    private static int idx = 0;

    public static Node preorderToBst(int arr[], int ub){
        if(idx==arr.length || arr[idx]>ub) return null;

        Node root = new Node(arr[idx++]);

        root.left = preorderToBst(arr, root.data);
        root.right = preorderToBst(arr, ub);
        
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {8,5,1,7,10,12};

        Node root = preorderToBst(arr,Integer.MAX_VALUE);

        System.out.println(root.data);
    }
}

