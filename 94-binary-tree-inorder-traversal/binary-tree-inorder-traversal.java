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
    public static void func(TreeNode root, List<Integer> temp){
        if(root==null){
            return;
        }
        func(root.left, temp);
        temp.add(root.val);
        func(root.right, temp);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<Integer>();
        func(root, li);
        return li;
    }
}