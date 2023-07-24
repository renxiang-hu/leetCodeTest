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
//
// Related Topics数组 | 哈希表 | 双指针 | 二分查找 | 排序 
//
// 👍 787, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

//Java：两个数组的交集
class T349_IntersectionOfTwoArrays{
    public static void main(String[] args) {
        Solution solution = new T349_IntersectionOfTwoArrays().new Solution();
        int[] intersection = solution.intersection(new int[]{4,9,5}, new int[]{9, 4, 9, 8, 4});
        System.out.println(Arrays.toString(intersection));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0 ; i < nums1.length ; i++) {
            list.add(nums1[i]);
        }
        for (int j = 0 ; j < nums2.length ; j++) {
            list1.add(nums2[j]);
        }
        for (int t = 0 ; t < list.size() ; t++) {
            for (int m = 0 ; m < list1.size() ; m++) {
                if (list.get(t).equals(list1.get(m))) {
                    set.add(list.get(t));
                }
            }
        }
        int[] tn = new int[set.size()];
        int l = 0;
        for (Integer sl : set) {
            tn[l] = sl;
            l++;
        }
        return tn;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
