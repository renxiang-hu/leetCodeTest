/**
 * 题目Id：283
 * 题目：移动零
 * 日期：2022-09-13 19:09:54
 */
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
//
//
//
// 示例 1:
//
//
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
//
// 示例 2:
//
//
//输入: nums = [0]
//输出: [0]
//
//
//
// 提示:
//
//
//
// 1 <= nums.length <= 10⁴
// -2³¹ <= nums[i] <= 2³¹ - 1
//
//
//
//
// 进阶：你能尽量减少完成的操作次数吗？
//
// Related Topics 数组 双指针 👍 1737 👎 0

package leetcode.editor.cn;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] x = {0, 1, 0, 3, 12};
        Solution solution = new MoveZeroes().new Solution();
        solution.moveZeroes(x);
        System.out.println(x);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[ans] = nums[i];
                    ans++;
                }
            }
            for (int j = ans; j < nums.length; j++) {
                nums[j] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
