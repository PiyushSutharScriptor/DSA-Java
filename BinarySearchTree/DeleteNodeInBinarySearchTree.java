class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data1) {
        this.val = data1;
        this.left = null;
        this.right = null;
    }
}

public class DeleteNodeInBinarySearchTree {

    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;

        TreeNode find = root;
        TreeNode prev = null;

        while(find!=null && find.val!=key){
            prev = find;

            if(find.val>key){
                find = find.left;
            }
            else{
                find = find.right;
            }
        }

        //no key found
        if(find==null) return root;

        //if key has atmost one child
        if(find.left==null || find.right==null){
            TreeNode child = (find.left!=null) ? find.left : find.right;

            if(prev==null){
                return child;
            }

            if(prev.left==find){
                prev.left = child;
            }
            else{
                prev.right = child;
            }
        }
        else{
            TreeNode temp = find.right;
            TreeNode tempPrev = find;

            while(temp.left != null){
                tempPrev = temp;
                temp = temp.left;
            }

            find.val = temp.val;

            if(tempPrev.left == temp){
                tempPrev.left = temp.right;
            } else {
                tempPrev.right = temp.right;
            }

        }

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(20);
        root.right = new TreeNode(60);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(30);
        root.right.left = new TreeNode(50);
        root.right.right = new TreeNode(70);

        int key = 50;

        TreeNode res = deleteNode(root , key);
        System.out.println(res.val);
    }
}

