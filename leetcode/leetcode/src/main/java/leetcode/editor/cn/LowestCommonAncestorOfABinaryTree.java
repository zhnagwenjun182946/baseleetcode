
package leetcode.editor.cn;
import org.springframework.util.StopWatch;

public class LowestCommonAncestorOfABinaryTree{
  public static void main(String[] args) {
        Solution solution = new LowestCommonAncestorOfABinaryTree().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("二叉树的最近公共祖先");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
  }
  /**
  * 二叉树的最近公共祖先
  * lowest-common-ancestor-of-a-binary-tree
  */
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (null == root || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (null == left) {
            return right;
        }
        if (null == right) {
            return left;
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

}