/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sumNumbers(TreeNode root) {
        int result = 0;
        return DFSsumNumbers (root, result);
    }
    private int DFSsumNumbers (TreeNode root, int result){
        if (root == null){
            return 0;
        }
        result = result * 10 + root.val;
        if (root.left == null && root.right == null){
            return result;
        }
        return DFSsumNumbers(root.left, result) + DFSsumNumbers(root.right, result);
    }
}