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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;

        if(key==root.val){
            if(root.right!=null){
            root.val=root.right.val;
            root.right=null;
            }else if(root.left!=null){
                root.val=root.left.val;
                root.left=null;
            }else{
                root.val=root.val;
            }


        }else if(key>root.val){
            deleteNode(root.right,key);
        }else{
            deleteNode(root.left,key);
        }
        return root;
        
    }
}