/**
 * 题目Id：剑指 Offer 56 - II
 * 题目：数组中数字出现的次数 II
 * 日期：2022-09-15 10:50:19
 */
//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
//
//
//
// 示例 1：
//
// 输入：nums = [3,4,3,3]
//输出：4
//
//
// 示例 2：
//
// 输入：nums = [9,1,7,9,7,9,7]
//输出：1
//
//
//
// 限制：
//
//
// 1 <= nums.length <= 10000
// 1 <= nums[i] < 2^31
//
//
//
//
// Related Topics 位运算 数组 👍 387 👎 0

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ShuZuZhongShuZiChuXianDeCiShuIiLcof {
    public static void main(String[] args) {
        int[] x = {9, 1, 7, 9, 7, 9, 7};
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuIiLcof().new Solution();
        int i = solution.singleNumber(x);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int singleNumber(int[] nums) {
            Arrays.sort(nums);  //1,7,7,7,9,9,9
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(nums[i])) {
                    map.put(nums[i], 1);
                } else {
                    map.put(nums[i], map.get(nums[i]) + 1);
                }
            }
            int key = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 1) {
                    key = entry.getKey();
                }
            }
            return key;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
