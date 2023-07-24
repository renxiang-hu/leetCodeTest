//给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。 
//
//
// 
//
// 
// 
// 示例 1： 
// 
// 
//
// 
//输入：n = 2
//输出：[0,1,1]
//解释：
//0 --> 0
//1 --> 1
//2 --> 10
// 
//
// 示例 2： 
//
// 
//输入：n = 5
//输出：[0,1,1,2,1,2]
//解释：
//0 --> 0
//1 --> 1
//2 --> 10
//3 --> 11
//4 --> 100
//5 --> 101
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 10⁵ 
// 
//
// 
//
// 进阶： 
//
// 
// 很容易就能实现时间复杂度为 O(n log n) 的解决方案，你可以在线性时间复杂度 O(n) 内用一趟扫描解决此问题吗？ 
// 你能不使用任何内置函数解决此问题吗？（如，C++ 中的 __builtin_popcount ） 
// 
//
// Related Topics位运算 | 动态规划 
//
// 👍 1220, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Java：比特位计数
class T338_CountingBits{
    public static void main(String[] args) {
        Solution solution = new T338_CountingBits().new Solution();
        int[] ints = solution.countBits(5);
        System.out.println(Arrays.toString(ints));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] countBits(int num) {
        int[] count = new int[num+1];
        for (int i = 1; i <= num; i++) {
            //判断是否是奇数
            if((i&1) == 1) {
                // 奇数与比它小1的偶数相比，二进制中1的个数多一个
                count[i] = count[i-1] + 1;
            } else {
                // 偶数的话，最低二进制位一定是0，因此右移一位，其中1的个数不变
                count[i] = count[i/2];
            }
        }
        return count;
        }


}
//leetcode submit region end(Prohibit modification and deletion)

}
