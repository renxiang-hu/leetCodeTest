//给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。 
//
// 请你返回 nums 中唯一元素的 和 。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [1,2,3,2]
//输出：4
//解释：唯一元素为 [1,3] ，和为 4 。
// 
//
// 示例 2： 
//
// 输入：nums = [1,1,1,1,1]
//输出：0
//解释：没有唯一元素，和为 0 。
// 
//
// 示例 3 ： 
//
// 输入：nums = [1,2,3,4,5]
//输出：15
//解释：唯一元素为 [1,2,3,4,5] ，和为 15 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 1 <= nums[i] <= 100 
// 
//
// Related Topics 数组 哈希表 计数 👍 77 👎 0

package leetcode.editor.cn;

import java.util.*;

class sumOfUniqueElements{
    //2023-03-14 13:41:50
    //唯一元素的和
    //编号：[1748]
    
    public static void main(String[] args) {
        Solution solution = new sumOfUniqueElements().new Solution();
        int i = solution.sumOfUnique(new int[]{1,2,3,4,5});
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumOfUnique(int[] nums) {
        if (nums == null){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int tns : nums){
            hashMap.put(tns,hashMap.getOrDefault(tns,0)+1);
        }
        Set<Map.Entry<Integer, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Integer,Integer> ttl : entries) {
            if (hashMap.get(ttl.getKey()) == 1){
                list.add(ttl.getKey());
            }
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}