//给你一个整数 num ，返回 num 中能整除 num 的数位的数目。 
//
// 如果满足 nums % val == 0 ，则认为整数 val 可以整除 nums 。 
//
// 
//
// 示例 1： 
//
// 输入：num = 7
//输出：1
//解释：7 被自己整除，因此答案是 1 。
// 
//
// 示例 2： 
//
// 输入：num = 121
//输出：2
//解释：121 可以被 1 整除，但无法被 2 整除。由于 1 出现两次，所以返回 2 。
// 
//
// 示例 3： 
//
// 输入：num = 1248
//输出：4
//解释：1248 可以被它每一位上的数字整除，因此答案是 4 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= num <= 10⁹ 
// num 的数位中不含 0 
// 
//
// Related Topics 数学 👍 3 👎 0

package leetcode.editor.cn;
class countTheDigitsThatDivideANumber{
    //2023-03-15 22:07:34
    //统计能整除数字的位数
    //编号：[2520]
    
    public static void main(String[] args) {
        Solution solution = new countTheDigitsThatDivideANumber().new Solution();
        int i = solution.countDigits(1248);
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countDigits(int num) {
        int count = 0;
        String tns = num + "";
        for (int i = 0 ; i < tns.length() ; i++){
            if (num % (Character.getNumericValue(tns.charAt(i))) == 0){
                count++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}