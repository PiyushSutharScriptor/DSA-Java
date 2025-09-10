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

public class DeleteNodeInBinarySearchTreeOptimized {

    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        
        //root is key
        if(root.val==key){
            return helper(root);
        }
        
        TreeNode temp = root;
        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left = helper(root.left);
                    break;
                }
                else{
                    root = root.left;
                }
            }   
            else{
                if(root.right!=null && root.right.val==key){
                    root.right = helper(root.right);
                    break;
                }
                else{
                    root = root.right;
                }
            }
        }
        
        return temp;    
    }
    
    public static TreeNode helper(TreeNode root){
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        else{
            TreeNode right = root.right;
            TreeNode rightmost = findRight(root.left);
            rightmost.right = right;
            return root.left;
        }
        
    }
    
    public static TreeNode findRight(TreeNode root){
        if(root.right==null) return root;
        return findRight(root.right);
        
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

