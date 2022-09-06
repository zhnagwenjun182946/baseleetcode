
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("二叉树的层序遍历");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
    }
    /**
     * 二叉树的层序遍历
     * binary-tree-level-order-traversal
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ret = new ArrayList<>();
            if (null == root) {
                return ret;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                ArrayList<Integer> curList = new ArrayList<>();
                while (size-- > 0) {
                    TreeNode cur = queue.poll();
                    curList.add(cur.val);
                    if (null != cur.left) {
                        queue.add(cur.left);
                    }
                    if (null != cur.right) {
                        queue.add(cur.right);
                    }
                }
                ret.add(curList);
            }
            return ret;
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