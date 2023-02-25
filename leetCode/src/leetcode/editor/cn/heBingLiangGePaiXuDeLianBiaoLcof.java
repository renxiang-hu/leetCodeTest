//输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。 
//
// 示例1： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4 
//
// 限制： 
//
// 0 <= 链表长度 <= 1000 
//
// 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/ 
//
// Related Topics 递归 链表 👍 319 👎 0

package leetcode.editor.cn;

class heBingLiangGePaiXuDeLianBiaoLcof {
    //2023-02-24 10:06:13
    //合并两个排序的链表
    //编号：[剑指 Offer 25]

    public static void main(String[] args) {
        Solution solution = new heBingLiangGePaiXuDeLianBiaoLcof().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(new int[]{1, 2, 4});
        ListNode linkedList1 = CreateLink.createLinkedList(new int[]{1, 3, 4});
        ListNode listNode = solution.mergeTwoLists(linkedList, linkedList1);
        PrintLink.printLinkedList(listNode);
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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummyNode = new ListNode(0);
            ListNode cur = dummyNode;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else if (l1.val > l2.val) {
                    cur.next = l2;
                    l2 = l2.next;
                }
                cur = cur.next;
            }
            cur.next = l1 == null ? l2 : l1;
            return dummyNode.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}