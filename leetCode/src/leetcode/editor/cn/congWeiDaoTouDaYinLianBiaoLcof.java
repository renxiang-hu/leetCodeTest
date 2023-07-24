//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
//
// Related Topics 栈 递归 链表 双指针 👍 351 👎 0

package leetcode.editor.cn;

import java.io.InputStream;
import java.util.*;

class congWeiDaoTouDaYinLianBiaoLcof {
    //2022-11-19 13:24:50
    //从尾到头打印链表
    //编号：[剑指 Offer 06]

    public static void main(String[] args) {
        Solution solution = new congWeiDaoTouDaYinLianBiaoLcof().new Solution();
        int[] x = {1, 3, 2};
        ListNode linkedList = CreateLink.createLinkedList(x);
        int[] ints = solution.reversePrint(linkedList);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
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
        public int[] reversePrint(ListNode head) {
            List<Integer> list = new ArrayList<>();
            ListNode cur = head;
            while(cur != null){
                list.add(cur.val);
                cur = cur.next;
            }
            int[] tmp = new int[list.size()];
            Collections.reverse(list);
            for(int i = 0 ; i < list.size() ; i++){
                tmp[i] = list.get(i);
            }
            return tmp;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}