
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.ArrayList;

public class LowestCommonAncestorOfABinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new LowestCommonAncestorOfABinarySearchTree().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("二叉搜索树的最近公共祖先");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
    }
    /**
     * 二叉搜索树的最近公共祖先
     * lowest-common-ancestor-of-a-binary-search-tree
     */
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            return findPOrQ(root, p, q);
        }

        /**
         * 查找p或q
         * @param root
         * @param p
         * @param q
         * @return 查到到的节点
         */
        private TreeNode findPOrQ(TreeNode root, TreeNode p, TreeNode q) {
            if (root==null){
                return null;
            }
            if (root.val>p.val&&root.val>q.val){
                return findPOrQ(root.left, p, q);
            }
            if (root.val < p.val && root.val < q.val) {
                return findPOrQ(root.right, p, q);
            }
            return root;
        }

    }

    //leetcode submit region end(Prohibit modification and deletion)
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}