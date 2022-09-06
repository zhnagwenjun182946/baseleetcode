
package leetcode.editor.cn;

public class LinkedListCycle {
    public static void main(String[] args) {
        Solution solution = new LinkedListCycle().new Solution();
    }
    /**
     * 环形链表
     * linked-list-cycle
     */
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {

            if (null == head || null == head.next) {
                return false;
            }

            ListNode pre = head;
            ListNode tail = head.next.next;
            while (null != tail && null != tail.next) {
                if (pre == tail) {
                    return true;
                }
                pre = pre.next;
                tail = tail.next.next;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}