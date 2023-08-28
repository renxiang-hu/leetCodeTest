/**
 * 题目Id：83
 * 题目：删除排序链表中的重复元素
 * 日期：2022-09-13 15:19:48
 */
//给定一个已排序的链表的头
// head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
//
//
//
// 示例 1：
//
//
//输入：head = [1,1,2]
//输出：[1,2]
//
//
// 示例 2：
//
//
//输入：head = [1,1,2,3,3]
//输出：[1,2,3]
//
//
//
//
// 提示：
//
//
// 链表中节点数目在范围 [0, 300] 内
// -100 <= Node.val <= 100
// 题目数据保证链表已经按升序 排列
//
//
// Related Topics 链表 👍 850 👎 0

package leetcode.editor.cn;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int[] x = {1, 1, 2, 3, 3};
        Solution solution = new RemoveDuplicatesFromSortedList().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(x);
        ListNode listNode = solution.deleteDuplicates(linkedList);
        PrintLink.printLinkedList(listNode);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while (cur != null && cur.next != null) {
               if (cur.val==cur.next.val) {
                   cur.next = cur.next.next;
               } else {
                   cur = cur.next;
               }
            }
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
