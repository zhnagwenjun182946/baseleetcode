
package leetcode.editor.cn;

import org.springframework.util.StopWatch;

import java.util.PriorityQueue;

public class KthLargestElementInAStream {
    public static void main(String[] args) {
//        KthLargest solution = new KthLargestElementInAStream().new KthLargest(3, new int[]{4, 5, 8, 2});
//        StopWatch watch = new StopWatch("总共耗时");
//        watch.start("数据流中的第 K 大元素");
//        //
//        watch.stop();
//        System.out.println(watch.prettyPrint());

        PriorityQueue<Integer> queue = new PriorityQueue<>(2);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    /**
     * 数据流中的第 K 大元素
     * kth-largest-element-in-a-stream
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    class KthLargest {
        int k;
        PriorityQueue<Integer> pq;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            pq = new PriorityQueue<>();
            for (int num : nums)
                add(num);
        }

        public int add(int val) {
            pq.offer(val);
            if (pq.size() > k)
                pq.poll();
            return pq.peek();
        }
    }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
//leetcode submit region end(Prohibit modification and deletion)

}