//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 2
//输出：2
//解释：有两种方法可以爬到楼顶。
//1. 1 阶 + 1 阶
//2. 2 阶 
//
// 示例 2： 
//
// 
//输入：n = 3
//输出：3
//解释：有三种方法可以爬到楼顶。
//1. 1 阶 + 1 阶 + 1 阶
//2. 1 阶 + 2 阶
//3. 2 阶 + 1 阶
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 45 
// 
//
// Related Topics 记忆化搜索 数学 动态规划 👍 2979 👎 0

package leetcode.editor.cn;
class climbingStairs{
    //2023-04-13 09:23:11
    //爬楼梯
    //编号：[70]
    
    public static void main(String[] args) {
        Solution solution = new climbingStairs().new Solution();
        int i = solution.climbStairs(3);
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    //1  1   2  2   3   3  4
class Solution {
    public int climbStairs(int n) {
        return 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}