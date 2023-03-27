//给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。 
//
// 请你找到并返回这个整数 
//
// 
//
// 示例： 
//
// 
//输入：arr = [1,2,2,6,6,6,6,7,10]
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10^4 
// 0 <= arr[i] <= 10^5 
// 
//
// Related Topics 数组 👍 71 👎 0

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class elementAppearingMoreThan25InSortedArray{
    //2023-03-24 09:09:21
    //有序数组中出现次数超过25%的元素
    //编号：[1287]
    
    public static void main(String[] args) {
        Solution solution = new elementAppearingMoreThan25InSortedArray().new Solution();
        int specialInteger = solution.findSpecialInteger(new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10});
        System.out.println(specialInteger);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findSpecialInteger(int[] arr) {
        if (arr.length == 1){
            return arr[0];
        }
        Arrays.sort(arr);
        int len = arr.length;
        int count = 1;
        for (int i = 0 ; i < arr.length ; i++){
           if (arr[i+1] - arr[i] == 0){
               count++;
               if (count > len/4){
                   return arr[i];
               }
           } else {
               count = 1;
           }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}