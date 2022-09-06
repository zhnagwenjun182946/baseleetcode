
package leetcode.editor.cn;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        Solution solution = new SortColors().new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] nums1 = {1,0,1, 1, 1, 0};
        System.out.println("nums1 = " + Arrays.toString(nums1));
        new SortColors().sortTow(nums1);
        System.out.println("nums2 = " + Arrays.toString(nums1));

    }

    /**
     * 颜色分类
     * sort-colors
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void sortColors(int[] nums) {
            if (nums.length <= 1) {
                return;
            }
            int l = 0;
            int r = nums.length - 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < 1) {
                    int cur = nums[i];
                    nums[i] = nums[l];
                    nums[l++] = cur;
                } else if (nums[i] > 1) {
                    int cur = nums[i];
                    nums[i] = nums[r];
                    nums[r--] = cur;
                }
            }


        }
    }

    public void sortTow(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[j]) {
                int cur = nums[i];
                nums[i] = nums[j];
                nums[j++] = cur;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}