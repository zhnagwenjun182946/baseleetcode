
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

public class PowxN {
    public static void main(String[] args) {
        Solution solution = new PowxN().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("Pow(x, n)");
        double pow = solution.myPow(2, -2);
        watch.stop();
        System.out.println("pow = " + pow);
        System.out.println(watch.prettyPrint());
    }

    /**
     * Pow(x, n)
     * powx-n
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double myPow(double x, int n) {
            int c = Math.abs(n);
            return n > 0 ? pow(x, c) : 1 / pow(x, c);
        }

        public double pow(double x, int n) {
            if (n == 0) {
                return 1;
            }
            if (n == 1) {
                return x;
            }

            double pow = pow(x, n / 2);
            if (n % 2 == 0) {
                return pow * pow;
            } else {
                return pow * pow * x;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}