//给你单链表的头结点 head ，请你找出并返回链表的中间结点。 
//
// 如果有两个中间结点，则返回第二个中间结点。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5]
//输出：[3,4,5]
//解释：链表只有一个中间结点，值为 3 。
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2,3,4,5,6]
//输出：[4,5,6]
//解释：该链表有两个中间结点，值分别为 3 和 4 ，返回第二个结点。
// 
//
// 
//
// 提示： 
//
// 
// 链表的结点数范围是 [1, 100] 
// 1 <= Node.val <= 100 
// 
//
// Related Topics 链表 双指针 👍 852 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class middleOfTheLinkedList{
    //2023-04-08 16:59:34
    //链表的中间结点
    //编号：[876]
    
    public static void main(String[] args) {
        Solution solution = new middleOfTheLinkedList().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        ListNode listNode = solution.middleNode(linkedList);
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
    public ListNode middleNode(ListNode head) {
        ListNode[] tns = new ListNode[100];
        int t = 0;
        while (head != null) {
            tns[t++] = head;
            head = head.next;
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}