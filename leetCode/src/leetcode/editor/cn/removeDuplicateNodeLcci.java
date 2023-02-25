//编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。 
//
// 示例1: 
//
// 
// 输入：[1, 2, 3, 3, 2, 1]
// 输出：[1, 2, 3]
// 
//
// 示例2: 
//
// 
// 输入：[1, 1, 1, 1, 2]
// 输出：[1, 2]
// 
//
// 提示： 
//
// 
// 链表长度在[0, 20000]范围内。 
// 链表元素在[0, 20000]范围内。 
// 
//
// 进阶： 
//
// 如果不得使用临时缓冲区，该怎么解决？ 
//
// Related Topics 哈希表 链表 双指针 👍 176 👎 0

package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

class removeDuplicateNodeLcci {
    //2023-02-22 13:44:29
    //移除重复节点
    //编号：[面试题 02.01]

    public static void main(String[] args) {
        Solution solution = new removeDuplicateNodeLcci().new Solution();
        ListNode linkedList = CreateLink.createLinkedList(new int[]{1, 2, 3, 3, 2, 1});
        ListNode listNode = solution.removeDuplicateNodes(linkedList);
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
// 1 2 3 3 2 1
    class Solution {
        public ListNode removeDuplicateNodes(ListNode head) {
            if (head == null) {
                return null;
            }
            Set<Integer> mySet = new HashSet<>();
            mySet.add(head.val);
            ListNode cur = head;
            while (cur.next != null) {
                ListNode pos = cur.next;
                if (mySet.add(pos.val)) {
                    cur = cur.next;
                } else {
                    cur.next = cur.next.next;
                }
            }
            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}