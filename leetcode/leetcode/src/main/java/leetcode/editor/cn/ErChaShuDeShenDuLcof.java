
package leetcode.editor.cn;
import org.springframework.util.StopWatch;

import java.util.LinkedList;
import java.util.Queue;

public class ErChaShuDeShenDuLcof{
  public static void main(String[] args) {
        Solution solution = new ErChaShuDeShenDuLcof().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("二叉树的深度");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
  }
  /**
  * 二叉树的深度
  * er-cha-shu-de-shen-du-lcof
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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int maxDepth = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-->0){
                TreeNode treeNode = queue.poll();
//                System.out.println("treeNode = " + treeNode.val);
                if (null!=treeNode.left){
                    queue.add(treeNode.left);
                }
                if (null != treeNode.right) {
                    queue.add(treeNode.right);
                }
            }
            maxDepth+=1;
        }
        return maxDepth;
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