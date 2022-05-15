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
    int maxdepth=0;
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        depth(root,0);
        sum(root,0);
        return sum;
    }
    public void depth(TreeNode root,int d){
        if(root==null){
            return;
        }
        maxdepth=Math.max(maxdepth,d);
        depth(root.left,d+1);
        depth(root.right,d+1);
    }
    public void sum(TreeNode root,int d){
        if(root==null){
            return;
        }
        if(maxdepth==d){
            sum=sum+root.val;
            return;
        }
        sum(root.left,d+1);
        sum(root.right,d+1);
    }
    
}