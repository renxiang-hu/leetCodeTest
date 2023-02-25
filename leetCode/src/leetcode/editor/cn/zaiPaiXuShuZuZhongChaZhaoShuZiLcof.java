//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 
//输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 提示： 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums 是一个非递减数组 
// -10⁹ <= target <= 10⁹ 
// 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
//
// Related Topics 数组 二分查找 👍 395 👎 0

package leetcode.editor.cn;

class zaiPaiXuShuZuZhongChaZhaoShuZiLcof {
    //2023-02-08 11:41:56
    //在排序数组中查找数字 I
    //编号：[剑指 Offer 53 - I]

    public static void main(String[] args) {
        Solution solution = new zaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        int search = solution.search(new int[]{2, 2}, 2);
        System.out.println(search);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            return 0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}