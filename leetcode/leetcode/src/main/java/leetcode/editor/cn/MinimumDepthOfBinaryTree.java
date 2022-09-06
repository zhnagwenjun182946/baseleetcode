
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

public class MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MinimumDepthOfBinaryTree().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("二叉树的最小深度");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
    }
    /**
     * 二叉树的最小深度
     * minimum-depth-of-binary-tree
     */
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int minDepth(TreeNode root) {
            if (null == root) {
                return 0;
            }
            if (null == root.left && null != root.right) {
                return minDepth(root.right) + 1;
            }
            if (null == root.right && null != root.left) {
                return minDepth(root.left) + 1;
            }
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}