//输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。 
//
// 例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。 
//
// 
//
// 示例： 
//
// 
//给定一个链表: 1->2->3->4->5, 和 k = 2.
//
//返回链表 4->5. 
//
// Related Topics 链表 双指针 👍 432 👎 0

package leetcode.editor.cn;

class lianBiaoZhongDaoShuDiKgeJieDianLcof {
    //2023-02-23 22:43:48
    //链表中倒数第k个节点
    //编号：[剑指 Offer 22]

    public static void main(String[] args) {
        Solution solution = new lianBiaoZhongDaoShuDiKgeJieDianLcof().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode kthFromEnd = solution.getKthFromEnd(linkedList, 2);
        PrintLink.printLinkedList(kthFromEnd);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode getKthFromEnd(ListNode head, int k) {
            ListNode left = head;
            ListNode right = head;
            for (int i = 1; i <= k; i++) {
                right = right.next;
            }
            while (right != null) {
                left = left.next;
                right = right.next;
            }
            return left;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}