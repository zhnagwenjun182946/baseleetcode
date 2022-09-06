
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("括号生成");
        //
        List<String> list = solution.generateParenthesis(5);
        watch.stop();
        System.out.println(watch.prettyPrint());
        System.out.println(list);
    }

    /**
     * 括号生成
     * generate-parentheses
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private static final String LEFT = "(";
        private static final String RIGHT = ")";
        private final List<String> result = new ArrayList<>();
        private Integer n = null;

        public List<String> generateParenthesis(int n) {
            if (n <= 0) {
                return result;
            }
            this.n = n;
            generateParenthesis(0, 0, "");
            return result;
        }

        private void generateParenthesis(int left, int right, String str) {
            if (left >= n && right >= n) {
                result.add(str);
            }
            if (left < n) {
                generateParenthesis(left + 1, right, str + LEFT);
            }
            if (right < left) {
                generateParenthesis(left, right + 1, str + RIGHT);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}