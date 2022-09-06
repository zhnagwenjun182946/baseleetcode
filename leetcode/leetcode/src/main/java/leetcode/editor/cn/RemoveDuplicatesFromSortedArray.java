
package leetcode.editor.cn;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();
    }

    /**
     * 删除有序数组中的重复项
     * remove-duplicates-from-sorted-array
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            int index = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[index] != nums[i]) {
                    nums[++index] = nums[i];
                }

            }
            return index + 1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}