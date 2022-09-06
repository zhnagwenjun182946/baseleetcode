
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ValidateBinarySearchTree().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("验证二叉搜索树");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
    }
    /**
     * 验证二叉搜索树
     * validate-binary-search-tree
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
        public boolean isValidBST0(TreeNode root) {
            if (null == root) {
                return true;
            }
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (null != left && left.val >= root.val) {
                return false;
            }
            if (null != right && right.val <= root.val) {
                return false;
            }
            return isValidBST0(left) && isValidBST0(right);
        }
        private Integer pre;
        public boolean isValidBST(TreeNode root) {
            if (null == root) {
                return true;
            }
            if (!isValidBST(root.left)) {
                return false;
            }
            if (null != pre && pre >= root.val) {
                return false;
            }
            pre = root.val;
            return isValidBST(root.right);
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