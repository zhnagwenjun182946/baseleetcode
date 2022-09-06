
package leetcode.editor.cn;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
    }

    /**
     * 寻找两个正序数组的中位数
     * median-of-two-sorted-arrays
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            if (nums1.length > nums2.length) {
                return findMedianSortedArrays(nums2, nums1);
            }
            final int[] ret = new int[nums1.length + nums2.length];
            int i = 0, j = 0, k = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    ret[k++] = nums1[i++];
                } else {
                    ret[k++] = nums2[j++];
                }
            }
            while (i < nums1.length) {
                ret[k++] = nums1[i++];
            }
            while (j < nums2.length) {
                ret[k++] = nums2[j++];
            }
            if (ret.length % 2 == 0) {
                return (ret[ret.length / 2] + ret[ret.length / 2 - 1]) / 2.0;
            }
            return ret[ret.length / 2];

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}