//给你一个整数数组 nums 。 
//
// 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。 
//
// 返回好数对的数目。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [1,2,3,1,1,3]
//输出：4
//解释：有 4 组好数对，分别是 (0,3), (0,4), (3,4), (2,5) ，下标从 0 开始
// 
//
// 示例 2： 
//
// 输入：nums = [1,1,1,1]
//输出：6
//解释：数组中的每组数字都是好数对 
//
// 示例 3： 
//
// 输入：nums = [1,2,3]
//输出：0
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
// Related Topics 数组 哈希表 数学 计数 👍 108 👎 0

package leetcode.editor.cn;
class numberOfGoodPairs{
    //2023-03-13 19:57:53
    //好数对的数目
    //编号：[1512]
    
    public static void main(String[] args) {
        Solution solution = new numberOfGoodPairs().new Solution();
        int i = solution.numIdenticalPairs(new int[]{1, 1 , 1 , 1});
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int tns = 0;
        for (int i = 0 ; i < nums.length - 1; i++){
            for (int j = i + 1 ; j < nums.length ; j++){
                if (i < j && nums[i] == nums[j]){
                    tns++;
                }
            }
        }
        return tns;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}