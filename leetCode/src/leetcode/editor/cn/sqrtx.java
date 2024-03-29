//给你一个非负整数 x ，计算并返回 x 的 算术平方根 。 
//
// 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。 
//
// 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。 
//
// 
//
// 示例 1： 
//
// 
//输入：x = 4
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：x = 8
//输出：2
//解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
// 
//
// 
//
// 提示： 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
//
// Related Topics 数学 二分查找 👍 1251 👎 0

package leetcode.editor.cn;

class sqrtx {
    //2023-02-09 09:12:02
    //x 的平方根 
    //编号：[69]

    public static void main(String[] args) {
        Solution solution = new sqrtx().new Solution();
        int i = solution.mySqrt(4);
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            int left = 0;
            int right = x;
            while (left <= right) {
                int middle = left + (right - left) / 2;
                if ((long) middle * middle > x) {
                    right = middle - 1;
                } else if (middle * middle < x) {
                    left = left + 1;
                } else {
                    return middle;
                }
            }
            return right;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}