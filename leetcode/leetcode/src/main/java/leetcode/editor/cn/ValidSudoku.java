
package leetcode.editor.cn;
import org.springframework.util.StopWatch;

public class ValidSudoku{
  public static void main(String[] args) {
        Solution solution = new ValidSudoku().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("有效的数独");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
  }
  /**
  * 有效的数独
  * valid-sudoku
  */
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValidSudoku(char[][] board) {

        return false;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}