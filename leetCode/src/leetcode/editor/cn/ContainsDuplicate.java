/**
  * 题目Id：217
  * 题目：存在重复元素
  * 日期：2022-06-30 17:49:44
*/
//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
//
//
// 示例 1：
//
//
//输入：nums = [1,2,3,1]
//输出：true
//
// 示例 2：
//
//
//输入：nums = [1,2,3,4]
//输出：false
//
// 示例 3：
//
//
//输入：nums = [1,1,1,3,3,4,3,2,4,2]
//输出：true
//
//
//
// 提示：
//
//
// 1 <= nums.length <= 10⁵
// -10⁹ <= nums[i] <= 10⁹
//
// Related Topics 数组 哈希表 排序 👍 763 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution solution = new ContainsDuplicate().new Solution();
        boolean b = solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2});
        System.out.println(b);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1 );
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer,Integer> entry : entries){
            if (entry.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
