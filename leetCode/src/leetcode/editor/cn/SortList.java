/**
  * 题目Id：148
  * 题目：排序链表
  * 日期：2022-09-13 18:25:20
*/
//给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
//
//
//
//
//
//
// 示例 1：
//
//
//输入：head = [4,2,1,3]
//输出：[1,2,3,4]
//
//
// 示例 2：
//
//
//输入：head = [-1,5,3,4,0]
//输出：[-1,0,3,4,5]
//
//
// 示例 3：
//
//
//输入：head = []
//输出：[]
//
//
//
//
// 提示：
//
//
// 链表中节点的数目在范围 [0, 5 * 10⁴] 内
// -10⁵ <= Node.val <= 10⁵
//
//
//
//
// 进阶：你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
//
// Related Topics 链表 双指针 分治 排序 归并排序 👍 1779 👎 0

package leetcode.editor.cn;
public class SortList {
    public static void main(String[] args) {
        int[] x = {4,2,1,3};
        Solution solution = new SortList().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(x);
        ListNode listNode = solution.sortList(linkedList);
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
    public ListNode sortList(ListNode head) {
       if (head == null){
           return null;
       }
       ListNode cur = head;
       while (cur != null){
          if (cur.val > cur.next.val){
            exchangeVal(cur.val,cur.next.val);
          }
          cur = cur.next;

       }
       return null;
    }

    public void exchangeVal(Integer x , Integer y){
        Integer a = x;
        x = y;
        y = a;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
