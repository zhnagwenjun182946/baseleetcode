
package leetcode.editor.cn;
import org.springframework.util.StopWatch;

import java.util.Arrays;

public class MajorityElement{
  public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("多数元素");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
  }
  /**
  * 多数元素
  * majority-element
  */
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return nums[length/2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}