/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;

class BSTIterator {

    private Deque<Integer> li = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {
        in(root);
    }
    
    private void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.left);
        li.add(root.val);
        in(root.right);
    }

    public int next() {
        return li.pop();
    }
    
    public boolean hasNext() {
        return !li.isEmpty();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */