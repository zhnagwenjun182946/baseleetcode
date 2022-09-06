
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack solution = new ImplementStackUsingQueues().new MyStack();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("用队列实现栈");
        solution.push(1);
        solution.push(2);
        System.out.println("solution.top() = " + solution.top());
        System.out.println("solution.pop() = " + solution.pop());
        System.out.println("solution.empty() = " + solution.empty());
        watch.stop();
        System.out.println(watch.prettyPrint());
    }

    /**
     * 用队列实现栈
     * implement-stack-using-queues
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class MyStack {

        private Queue<Integer> q1;
//        private Queue<Integer> q2;

        public MyStack() {
            q1 = new LinkedList<>();
        }

        public void push(int x) {
            int size = q1.size();
            q1.add(x);
            for (int i = 0; i < size; i++) {
                q1.add(q1.poll());
            }

        }

        public int pop() {
            return q1.poll();
        }

        public int top() {
            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}