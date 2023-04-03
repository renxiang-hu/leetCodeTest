//找出数组中重复的数字。 
//
// 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
//请找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
//
// Related Topics 数组 哈希表 排序 👍 1132 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class shuZuZhongZhongFuDeShuZiLcof{
    //2023-04-01 13:23:58
    //数组中重复的数字
    //编号：[剑指 Offer 03]
    
    public static void main(String[] args) {
        Solution solution = new shuZuZhongZhongFuDeShuZiLcof().new Solution();
        int repeatNumber = solution.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(repeatNumber);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> integers = map.keySet();
        for (Integer integer : integers){
            if (map.get(integer) >= 2){
                return integer;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}