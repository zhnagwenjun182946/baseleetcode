
package leetcode.editor.cn;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        Solution solution = new SwapNodesInPairs().new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;
        listNode4.next = new ListNode(5);

        ListNode listNode = solution.swapPairs(listNode1);
        while (listNode != null) {
            System.out.println("listNode = " + listNode.val);
            listNode = listNode.next;
        }
    }
    /**
     * 两两交换链表中的节点
     * swap-nodes-in-pairs
     */
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (null==head||null==head.next){
                return head;
            }
            ListNode virtualNode = new ListNode(0);
            virtualNode.next = head;
            //记录已经交换完成的节点
            ListNode cur = virtualNode;
            while (null!=cur.next&&null!=cur.next.next){
                ListNode left = cur.next;
                ListNode right = cur.next.next;

                //交换
                left.next = right.next;
                right.next = left;
                //remove index
                cur.next = right;
                cur = left;

            }

            return virtualNode.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}