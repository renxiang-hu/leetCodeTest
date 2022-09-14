/**
  * 题目Id：169
  * 题目：多数元素
  * 日期：2022-06-28 15:57:39
*/
//给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
// 示例 1：
//
//
//输入：nums = [3,2,3]
//输出：3
//
// 示例 2：
//
//
//输入：nums = [2,2,1,1,1,2,2]
//输出：2
//
//
//
//提示：
//
//
// n == nums.length
// 1 <= n <= 5 * 10⁴
// -10⁹ <= nums[i] <= 10⁹
//
//
//
//
// 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
// Related Topics 数组 哈希表 分治 计数 排序 👍 1474 👎 0

package leetcode.editor.cn;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new MajorityElement().new Solution();
        int i = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        List<Integer> list = new ArrayList<>();
        map.entrySet().stream().forEach(e->{
            list.add(e.getValue());
        });
        Collections.sort(list);
        //3,4
        int ss = 0;
        for (Integer key : map.keySet()){
           if(map.get(key) == list.get(list.size()-1)){
               ss = key;
           }
        }
        return ss;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
