
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.List;

//回溯
public class Combinations {
    //    回溯
    public static void main(String[] args) {
        Solution solution = new Combinations().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("组合");
        List<List<Integer>> combine = solution.combine(4, 2);
        watch.stop();
        System.out.println("combine = " + combine);
        System.out.println(watch.prettyPrint());
    }

    /**
     * 组合
     * combinations
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            back(n, k, 1, new ArrayList<>());
            return result;
        }

        private void back(int n, int k, int i, ArrayList<Integer> ret) {
            if (ret.size() == k) {
                result.add(new ArrayList<>(ret));
                return;
            }
            // 剪枝
            if (n - i + 1 + ret.size() < k) {
                return;
            }
//            遍历元素
            for (int j = i; j <= n; j++) {
                ret.add(j);
                back(n, k, j + 1, ret);
                // 回溯
                ret.remove(ret.size() - 1);

            }
        }


    }
//leetcode submit region end(Prohibit modification and deletion)

}