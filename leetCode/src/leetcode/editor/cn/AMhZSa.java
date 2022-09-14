/**
  * 题目Id：剑指 Offer II 027
  * 题目：回文链表
  * 日期：2022-09-13 18:00:44
*/
//给定一个链表的 头节点 head ，请判断其是否为回文链表。
//
// 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
//
//
//
// 示例 1：
//
//
//
//
//输入: head = [1,2,3,3,2,1]
//输出: true
//
// 示例 2：
//
//
//
//
//输入: head = [1,2]
//输出: false
//
//
//
//
// 提示：
//
//
// 链表 L 的长度范围为 [1, 10⁵]
// 0 <= node.val <= 9
//
//
//
//
// 进阶：能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
//
//
//
//
// 注意：本题与主站 234 题相同：https://leetcode-cn.com/problems/palindrome-linked-list/
//
// Related Topics 栈 递归 链表 双指针 👍 71 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class AMhZSa {
    public static void main(String[] args) {
        int[] x = {1,2,3,3,2,1};
        Solution solution = new AMhZSa().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(x);
        boolean palindrome = solution.isPalindrome(linkedList);
        System.out.println(palindrome);
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
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode cur = head;
        List<Integer> list = new ArrayList<>();
        while (cur != null){
            list.add(cur.val);
            cur = cur.next;
        }
        if (list.size() == 0){

        }
        int begin = 0;
        int end = list.size() - 1;
        while (begin <= end){
            if (list.get(begin).equals(list.get(end))){
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
