
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("三数之和");
        List<List<Integer>> list = solution.threeSum(new int[]{-1, 0, 1, 2, 2, -1, -4});
        watch.stop();
        System.out.println(watch.prettyPrint());
        for (List<Integer> ret : list) {
            System.out.println(ret.toString());
        }
    }

    /**
     * 三数之和
     * 3sum
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            if (nums.length < 3) {
                Collections.emptyList();
            }
            Arrays.sort(nums);
            HashSet<List<Integer>> rets = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                int target = -nums[i];
                HashSet<Integer> set = new HashSet<>();
                int j = i + 1;
                for (; j < nums.length; j++) {
                    if (set.contains(target - nums[j])) {
                        rets.add(Arrays.asList(nums[i], target - nums[j], nums[j]));
                        continue;
                    }
                    set.add(nums[j]);
                }
            }
            return new ArrayList<>(rets);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}