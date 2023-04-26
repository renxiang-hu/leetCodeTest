//给你一个 正 整数 n 。 
//
// 用 even 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的偶数下标的个数。 
//
// 用 odd 表示在 n 的二进制形式（下标从 0 开始）中值为 1 的奇数下标的个数。 
//
// 返回整数数组 answer ，其中 answer = [even, odd] 。 
//
// 
//
// 示例 1： 
//
// 输入：n = 17
//输出：[2,0]
//解释：17 的二进制形式是 10001 。 
//下标 0 和 下标 4 对应的值为 1 。 
//共有 2 个偶数下标，0 个奇数下标。
// 
//
// 示例 2： 
//
// 输入：n = 2
//输出：[0,1]
//解释：2 的二进制形式是 10 。 
//下标 1 对应的值为 1 。 
//共有 0 个偶数下标，1 个奇数下标。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 
//
// Related Topics位运算 
//
// 👍 4, 👎 0 
//
//
//
//

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class numberOfEvenAndOddBits{
    //2023-04-26 10:18:20
    //奇偶位数
    //编号：[2595]
    
    public static void main(String[] args) {
        Solution solution = new numberOfEvenAndOddBits().new Solution();
        int[] ints = solution.evenOddBit(17);
        System.out.println(Arrays.toString(ints));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] evenOddBit(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            int tl = n % 2;
            n = n / 2;
            list.add(tl);
        }
        int left = 0;
        int right = 0;
        for (int i = 0 ; i < list.size() ; i++){
            if (i % 2 == 0 && list.get(i) == 1){
                left++;
            } else if (i % 2 == 1 && list.get(i) == 1){
                right++;
            }
        }
        return new int[]{left,right};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}