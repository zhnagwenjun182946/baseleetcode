
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        String s = "(((){}))[";
        StopWatch watch = new StopWatch("time consuming statistics");
        watch.start("isValid");
        solution.isValid(s);
        watch.stop();
        System.out.println(watch.prettyPrint());


    }

    /**
     * 有效的括号
     * valid-parentheses
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public boolean isValid(String s) {
            Map<Character, Character> map = new HashMap<>();
            map.put('}', '{');
            map.put(']', '[');
            map.put(')', '(');
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                Character c = s.charAt(i);
                if (stack.isEmpty() || !stack.peek().equals(map.get(c))) {
                    stack.add(c);
                } else {
                    stack.pop();
                }

            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}