//给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数
//字，并以数组的形式返回结果。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [4,3,2,7,8,2,3,1]
//输出：[5,6]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,1]
//输出：[2]
// 
//
// 
//
// 提示： 
//
// 
// n == nums.length 
// 1 <= n <= 10⁵ 
// 1 <= nums[i] <= n 
// 
//
// 进阶：你能在不使用额外空间且时间复杂度为 O(n) 的情况下解决这个问题吗? 你可以假定返回的数组不算在额外空间内。 
//
// Related Topics 数组 哈希表 👍 1128 👎 0

package leetcode.editor.cn;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class findAllNumbersDisappearedInAnArray{
    //2022-12-17 13:28:30
    //找到所有数组中消失的数字
    //编号：[448]
    
    public static void main(String[] args) {
        Solution solution = new findAllNumbersDisappearedInAnArray().new Solution();
        int[] x = {1,1};
        List<Integer> disappearedNumbers = solution.findDisappearedNumbers(x);
        for (Integer num : disappearedNumbers){
            System.out.println(num);
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0 ; i < nums.length ; i++) {
            numSet.add(nums[i]);
        }
        for (int i = 1 ; i <= nums.length ; i++){
            if (!numSet.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}