
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.Stack;

public class ImplementQueueUsingStacks{
  public static void main(String[] args) {
      MyQueue solution = new ImplementQueueUsingStacks().new MyQueue();
        StopWatch watch = new StopWatch("总共耗时");
        watch.start("用栈实现队列");
        // 
        watch.stop();
        System.out.println(watch.prettyPrint());
  }
  /**
  * 用栈实现队列
  * implement-queue-using-stacks
  */
  //leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {

    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        if (!s2.isEmpty()){
            return s2.pop();
        }
        while (!s1.isEmpty()){
            s2.add(s1.pop());
        }
        return s2.pop();
    }
    
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        while (!s1.isEmpty()){
            s2.add(s1.pop());
        }
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

}