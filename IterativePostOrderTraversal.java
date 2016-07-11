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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList <Integer> result = new ArrayList<Integer>();
        Traversal (root, result);
        return result;
    }
        private void Traversal (TreeNode root, ArrayList<Integer> result){
        if (root == null){
            return;
        }
        Traversal (root.left, result);
        Traversal (root.right, result);
        result.add(root.val);
        }
}