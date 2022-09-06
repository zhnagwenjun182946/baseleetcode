
package leetcode.editor.cn;
import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ValidAnagram{
  public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("有效的字母异位词");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
  }
  /**
  * 有效的字母异位词
  * valid-anagram
  */
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put( c,1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (!map.containsKey(c)){
                return false;
            }
            Integer num = map.get(c);
            if (num==1){
                map.remove(c);
            }else {
                map.put(c,map.get(c)-1);
            }
        }
        return map.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}