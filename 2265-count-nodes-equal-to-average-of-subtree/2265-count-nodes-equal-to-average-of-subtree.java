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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        help(root);
        return ans;
    }
    int[] help(TreeNode node)
    {
        if(null == node)
        {
            return new int[]{0,0};
        }
        int left[]=help(node.left);
        int right[]=help(node.right);
        
        int currsum=left[0]+right[0]+node.val;
        int currcount=left[1]+right[1]+1;
        
        if((currsum / currcount) == node.val)
        {
            ans++;
        }
        
        return new int[]{currsum, currcount};
    }
}