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
class Solution {
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight , rightheight) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if( root == null){
            return 0;
        }
        
        int leftdiam = diameterOfBinaryTree(root.left);
        int rightdiam = diameterOfBinaryTree(root.right);
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int curr_diam = leftheight + rightheight;
        
        return Math.max(Math.max(leftdiam, rightdiam), curr_diam);
    }
}