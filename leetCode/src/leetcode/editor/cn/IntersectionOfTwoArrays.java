/**
 * 题目Id：349
 * 题目：两个数组的交集
 * 日期：2022-07-21 09:50:33
 */
//给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
//
//
//
// 示例 1：
//
//
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2]
//
//
// 示例 2：
//
//
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[9,4]
//解释：[4,9] 也是可通过的
//
//
//
//
// 提示：
//
//
// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000
//
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 575 👎 0

package leetcode.editor.cn;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new IntersectionOfTwoArrays().new Solution();
        int[] intersection = solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(intersection);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set = new HashSet<>();
            for (Integer t : nums1) {
                set.add(t);
            }
            Set<Integer> set1 = new HashSet<>();
            for (Integer n : nums2) {
                set1.add(n);
            }
            List<Integer> list = new ArrayList<>();
            for (Integer tt : set) {
                if (set1.contains(tt)) {
                    list.add(tt);
                }
            }
            int[] ttt = new int[list.size()];
            for (int i = 0 ; i < ttt.length ; i++) {
                ttt[i] = list.get(i);
            }
            return ttt;

        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
