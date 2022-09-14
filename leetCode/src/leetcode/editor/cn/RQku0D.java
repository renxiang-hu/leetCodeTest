/**
  * 题目Id：剑指 Offer II 019
  * 题目：最多删除一个字符得到回文
  * 日期：2022-06-30 19:43:59
*/
//给定一个非空字符串 s，请判断如果 最多 从字符串中删除一个字符能否得到一个回文字符串。
//
//
//
// 示例 1:
//
//
//输入: s = "aba"
//输出: true
//
//
// 示例 2:
//
//
//输入: s = "abca"
//输出: true
//解释: 可以删除 "c" 字符 或者 "b" 字符
//
//
// 示例 3:
//
//
//输入: s = "abc"
//输出: false
//
//
//
// 提示:
//
//
// 1 <= s.length <= 10⁵
// s 由小写英文字母组成
//
//
//
//
// 注意：本题与主站 680 题相同： https://leetcode-cn.com/problems/valid-palindrome-ii/
// Related Topics 贪心 双指针 字符串 👍 38 👎 0

package leetcode.editor.cn;
public class RQku0D {
    public static void main(String[] args) {
        Solution solution = new RQku0D().new Solution();
        boolean abca = solution.validPalindrome("abc");
        System.out.println(abca);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean validPalindrome(String s) {
        // 这题答案有问题，后面再处理，不是简单题
        StringBuffer stringBuffer = new StringBuffer(s);
        StringBuffer reverse = new StringBuffer(stringBuffer).reverse();
        int i = 0 ;
        int j = stringBuffer.toString().length()-1;
        int k = 0 ;
        for(int m = 0 ; m <stringBuffer.toString().length() ; m++){
            if (stringBuffer.toString().charAt(m) != reverse.toString().charAt(m)){
               k++;
            }
        }
        if (k > 2){
            return false;
        }else{
            return true;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
