
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("组合总和");
        //
        List<List<Integer>> lists = solution.combinationSum(new int[]{2, 3, 6, 7}, 7);
        watch.stop();
        System.out.println("lists = " + lists);
        System.out.println(watch.prettyPrint());
    }

    /**
     * 组合总和
     * combination-sum
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private final List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            back(candidates, target, 0, new ArrayList<>(), 0);
            return result;
        }

        private void back(int[] candidates, int target, int i, List<Integer> ret, int sum) {
            if (target == sum) {
                result.add(new ArrayList<>(ret));
                return;
            }
            for (int j = i; j < candidates.length; j++) {
                int candidate = candidates[j];
//                剪纸
                if (sum + candidate > target) {
                    return;
                }
                sum += candidate;
                ret.add(candidate);
                back(candidates, target, j, ret, sum);
//                回溯
                sum -= candidate;
                ret.remove(ret.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}