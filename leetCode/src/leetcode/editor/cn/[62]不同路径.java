//一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。 
//
// 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。 
//
// 问总共有多少条不同的路径？ 
//
// 
//
// 示例 1： 
// 
// 
//输入：m = 3, n = 7
//输出：28 
//
// 示例 2： 
//
// 
//输入：m = 3, n = 2
//输出：3
//解释：
//从左上角开始，总共有 3 条路径可以到达右下角。
//1. 向右 -> 向下 -> 向下
//2. 向下 -> 向下 -> 向右
//3. 向下 -> 向右 -> 向下
// 
//
// 示例 3： 
//
// 
//输入：m = 7, n = 3
//输出：28
// 
//
// 示例 4： 
//
// 
//输入：m = 3, n = 3
//输出：6 
//
// 
//
// 提示： 
//
// 
// 1 <= m, n <= 100 
// 题目数据保证答案小于等于 2 * 10⁹ 
// 
//
// Related Topics数学 | 动态规划 | 组合数学 
//
// 👍 1825, 👎 0 
//
//
//
//


package leetcode.editor.cn;
//Java：不同路径
class T62_UniquePaths{
    public static void main(String[] args) {
        Solution solution = new T62_UniquePaths().new Solution();
        int i = solution.uniquePaths(3, 7);
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    //确定dp数组及下标的含义：dp[i][j]   从（0，,0）到（i，j）有多少条不同的路径
    //确定递推公式：dp[i][j] = dp[i-1][j] + dp[i][j-1]
    //dp数组初始化：dp[m][0] = 1 ; dp[0][n] = 1;
    //确定遍历顺序：m行，n列，双层遍历即可
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] tns = new int[m][n];
       for (int i = 0 ; i < m ; i++) {
           tns[i][0] = 1;
       }
       for (int j = 0 ; j < n ; j++) {
           tns[0][j] = 1;
       }
       for (int p = 1 ;  p < m ; p++) {
           for (int q = 1 ; q < n ; q++) {
               tns[p][q] = tns[p-1][q] + tns[p][q-1];
           }
       }
       return tns[m-1][n-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
