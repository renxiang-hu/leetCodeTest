//给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,1,0,1,1,1]
//输出：3
//解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
// 
//
// 示例 2: 
//
// 
//输入：nums = [1,0,1,1,0,1]
//输出：2
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 10⁵ 
// nums[i] 不是 0 就是 1. 
// 
//
// Related Topics 数组 👍 360 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class maxConsecutiveOnes {
    //2022-12-15 07:58:24
    //最大连续 1 的个数
    //编号：[485]

    public static void main(String[] args) {
        Solution solution = new maxConsecutiveOnes().new Solution();
        int[] t = {1, 1, 0, 1, 1, 1};
        int maxConsecutiveOnes = solution.findMaxConsecutiveOnes(t);
        System.out.println(maxConsecutiveOnes);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
           int value = 0;
           int maxValue = 0;
           for (int i  = 0 ; i < nums.length ; i++){
              if (nums[i] == 1){
                  value++;
              } else {
                  maxValue = Math.max(value, maxValue);
                  value = 0;
              }
           }
           maxValue = Math.max(value,maxValue);
           return maxValue;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}