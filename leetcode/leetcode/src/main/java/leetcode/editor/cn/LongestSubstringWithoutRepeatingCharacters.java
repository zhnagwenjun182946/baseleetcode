
package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LongestSubstringWithoutRepeatingCharacters{
  public static void main(String[] args) {
       Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
      final int i = solution.lengthOfLongestSubstring(" ");
      System.out.println("i = " + i);
  }
  /**
  * 无重复字符的最长子串
  * longest-substring-without-repeating-characters
  */
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
//        if (Objects.isNull(s) || s.length() == 0) {
//            return 0;
//        }
        int maxLength = 0;
        final Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            if (map.containsKey(c)) {
                maxLength = Math.max(maxLength, map.size());
                i = map.get(c);
                map.clear();
            }else {
                map.put(c, i);
            }
        }
        maxLength = Math.max(maxLength, map.size());

        return maxLength;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}