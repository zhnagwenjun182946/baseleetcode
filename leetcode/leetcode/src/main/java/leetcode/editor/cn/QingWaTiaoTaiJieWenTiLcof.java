
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

public class QingWaTiaoTaiJieWenTiLcof {
    public static void main(String[] args) {
        Solution solution = new QingWaTiaoTaiJieWenTiLcof().new Solution();
        /*final int i = solution.numWays(3);
        System.out.println(i);*/
        final int[][] nums = {

                {13},
                {11, 8},
                {12, 7, 26},
                {6, 14, 15, 8},
                {12, 7, 13, 24, 11}
        };
        final int digitalPyramid = solution.digitalPyramid(nums);
        System.out.println(digitalPyramid);
    }

    /**
     * 青蛙跳台阶问题
     * qing-wa-tiao-tai-jie-wen-ti-lcof
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private final Map<Integer, Integer> map = new HashMap<>();

        public int numWays(int n) {
            if (n == 0) return 1;
            if (n <= 2) return n;
            if (map.containsKey(n)) return map.get(n);
            int res = (numWays(n - 1) + numWays(n - 2)) % 1000000007;
            map.put(n, res);
            return res;
        }

        //数字金字塔
        //f(nums[i][j]) = nums[i][j]+max(f(nums[i+1][j+1],f(nums[i+1][j]))
        public int digitalPyramid(int[][] nums) {
            if (nums == null || nums.length == 0) return 0;
            int[][] dp = new int[nums.length][nums[0].length];
            return digitalPyramid(nums, dp, 0, 0);
        }

        private int digitalPyramid(int[][] nums, int[][] dp, int i, int j) {
            if (i > nums.length - 1 || j > nums[0].length - 1) return 0;
            if (dp[i][j] != 0) return dp[i][j];
            if (i == nums.length - 1) {
                dp[i][j] = nums[i][j];
                return dp[i][j];
            }
            final int left = digitalPyramid(nums, dp, i + 1, j);
            final int right = digitalPyramid(nums, dp, i + 1, j + 1);
            dp[i][j] = nums[i][j] + Math.max(left, right);
            return dp[i][j];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}