import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void func(TreeNode root, List<Integer> temp) {
        if (root != null) {
            temp.add(root.val);
            func(root.left, temp);
            func(root.right, temp);
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        func(root, result);
        return result;
    }
}
