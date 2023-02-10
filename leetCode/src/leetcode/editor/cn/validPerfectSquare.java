//给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。 
//
// 完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。 
//
// 不能使用任何内置的库函数，如 sqrt 。 
//
// 
//
// 示例 1： 
//
// 
//输入：num = 16
//输出：true
//解释：返回 true ，因为 4 * 4 = 16 且 4 是一个整数。
// 
//
// 示例 2： 
//
// 
//输入：num = 14
//输出：false
//解释：返回 false ，因为 3.742 * 3.742 = 14 但 3.742 不是一个整数。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 2³¹ - 1 
// 
//
// Related Topics 数学 二分查找 👍 467 👎 0

package leetcode.editor.cn;
class validPerfectSquare{
    //2023-02-10 15:12:38
    //有效的完全平方数
    //编号：[367]
    
    public static void main(String[] args) {
        Solution solution = new validPerfectSquare().new Solution();
        boolean perfectSquare = solution.isPerfectSquare(14);
        System.out.println(perfectSquare);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right){
            int middle = left + (right - left) / 2;
            if ((long)middle * middle < num){
                left = middle + 1;
            } else if ((long)middle * middle > num){
                right = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}