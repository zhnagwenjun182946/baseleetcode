
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

/**
 *
 */
public class TwoSum {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        Solution solution = twoSum.new Solution();
        System.out.println("solution = " + solution);
        System.out.println("twoSum = " + twoSum);
    }

    /**
     * 两数之和
     * two-sum
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
             if(Objects.isNull(nums) || nums.length < 2) {
                 return new int[]{};
             }
            final HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                final int curTarget = target - nums[i];
                if (map.containsKey(curTarget)) {
                    return new int[]{map.get(curTarget), i};
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}