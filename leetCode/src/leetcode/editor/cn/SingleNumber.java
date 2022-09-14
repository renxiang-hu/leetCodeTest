/**
  * 题目Id：136
  * 题目：只出现一次的数字
  * 日期：2022-06-21 14:23:04
*/
//给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
// 说明：
//
// 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
// 示例 1:
//
// 输入: [2,2,1]
//输出: 1
//
//
// 示例 2:
//
// 输入: [4,1,2,1,2]
//输出: 4
// Related Topics 位运算 数组 👍 2454 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        Solution solution = new SingleNumber().new Solution();
        int i = solution.singleNumber(new int[]{4, 1, 2, 1, 2});
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        //第一种Map方法，复杂度较高，不推荐使用
//        Map<Integer,Integer> map = new HashMap<>();
//        int total = 0;
//        for (int i = 0 ; i < nums.length ; i++){
//            if (!map.containsKey(nums[i])){
//                map.put(nums[i],1);
//            }else{
//                map.put(nums[i],map.get(nums[i])+1);
//            }
//        }
//        int key = 0;
//        //map数据已加载完成，现在进行输出
//        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        for (Map.Entry<Integer,Integer> entry : entries){
//           if (entry.getValue() == 1){
//              key = entry.getKey();
//           }
//        }
//        return key;

        //第二种方法，位运算，异或
        /**知识点：
         * 任何数和 0 做异或运算，结果仍然是原来的数，即 a \oplus 0=aa⊕0=a。
         * 任何数和其自身做异或运算，结果是 0，即 a \oplus a=0a⊕a=0。
         */
        int angle = 0;
        for (int num : nums){
            angle = angle ^ num;
        }
        return angle;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
