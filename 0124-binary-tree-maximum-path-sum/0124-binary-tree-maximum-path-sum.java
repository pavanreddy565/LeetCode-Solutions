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
    int findH(TreeNode node, int[] maxi){
        if(node==null) return 0;
        int lh = Math.max(0,findH(node.left,maxi));
        int rh = Math.max(0,findH(node.right,maxi));
        maxi[0]=Math.max(maxi[0],node.val+lh+rh);
        //System.out.println(node.val+" "+ lh+" "+rh+" "+maxi[0]);
        return node.val+Math.max(lh,rh);
    }
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        int maxi[]= new int[1];
        maxi[0] = Integer.MIN_VALUE;
        findH(root, maxi);
        return maxi[0];
    }
}