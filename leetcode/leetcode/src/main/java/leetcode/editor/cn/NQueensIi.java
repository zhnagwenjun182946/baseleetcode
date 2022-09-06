
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.Arrays;

public class NQueensIi {
    public static void main(String[] args) {
        Solution solution = new NQueensIi().new Solution();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("N皇后 II");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
    }

    /**
     * N皇后 II
     * n-queens-ii
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int ans=0;
        public int totalNQueens(int n) {
            int[] cur=new int[n];
            //cur数组表示0到 n-1行 中每行'Q'所处的列数
            //例如：cur[i]=j表示第i行的'Q'在第j列
            Arrays.fill(cur,-1);

            //三行，分别表示列冲突，左、右斜对角线冲突
            //因为是逐行放置的，没有行冲突了
            int[][] res=new int[3][2*n+1];

            dfs(res,0,cur,n);
            return ans;
        }
        public void dfs(int[][] res,int row,int[] cur,int n){
            //row表示行，row==n表示逐行放置全部放完，没有冲突即满足题目要求
            if(row==n){
                ans++;
                return ;
            }

            //这里可以用树来理解，一层一层的，n个分支
            for(int i=0;i<n;i++){
                //这里res[2][i-row+n]之所以加n是防止出现负数，不好判断
                if(res[0][i]==0&&res[1][i+row]==0&&res[2][i-row+n]==0){

                    //修改辅助变量
                    cur[row]=i;
                    res[0][i] = res[1][i+row] = res[2][i-row+n]=1;

                    //向下递归
                    dfs(res,row+1,cur,n);

                    //将修改过的辅助变量更改回去
                    cur[row]=-1;
                    res[0][i] = res[1][i+row] = res[2][i-row+n]=0;
                }

            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}