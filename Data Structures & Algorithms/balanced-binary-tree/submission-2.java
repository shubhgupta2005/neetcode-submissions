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
    public boolean isBalanced(TreeNode root) {
        int res[]=new int[1];
        check(root,res);
        if(res[0]==1){
            return false;
        }else{
            return true;
        }
        
        
    }
    private int check(TreeNode node,int[] res){
        if(node==null) return 0;
        int left=check(node.left,res);
        int right=check(node.right,res);
        if(Math.abs(right-left)>1){
            res[0]=1;
        }
        return 1+Math.max(left,right);
    }
}
