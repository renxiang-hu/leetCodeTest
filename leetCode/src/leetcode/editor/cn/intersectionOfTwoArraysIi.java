//给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现
//次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
// 
//
// 示例 2: 
//
// 
//输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9] 
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
// 
//
// 进阶： 
//
// 
// 如果给定的数组已经排好序呢？你将如何优化你的算法？ 
// 如果 nums1 的大小比 nums2 小，哪种方法更优？ 
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？ 
// 
//
// Related Topics 数组 哈希表 双指针 二分查找 排序 👍 905 👎 0

package leetcode.editor.cn;

import java.util.*;

class intersectionOfTwoArraysIi {
    //2023-02-24 14:32:13
    //两个数组的交集 II
    //编号：[350]

    public static void main(String[] args) {
        Solution solution = new intersectionOfTwoArraysIi().new Solution();
        int[] intersect = solution.intersect(new int[]{1,2,2,1}, new int[]{2,2});
        System.out.println(intersect.toString());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer,Integer> map = new HashMap<>();
            for (Integer num : nums1) {
                map.put(num,map.getOrDefault(num,0)+1);
            }
            Map<Integer,Integer> map1 = new HashMap<>();
            for (Integer num : nums2) {
                map1.put(num,map1.getOrDefault(num,0)+1);
            }
            List<Integer> list = new ArrayList<>();
            Set<Integer> integers = map.keySet();
            for (Integer tns : integers) {
                if (map.get(tns)!=null && map1.get(tns)!=null) {
                    list.add(tns);
                }
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}