//给你一个字符串 s ，仅反转字符串中的所有元音字母，并返回结果字符串。 
//
// 元音字母包括 'a'、'e'、'i'、'o'、'u'，且可能以大小写两种形式出现不止一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "hello"
//输出："holle"
// 
//
// 示例 2： 
//
// 
//输入：s = "leetcode"
//输出："leotcede" 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 3 * 10⁵ 
// s 由 可打印的 ASCII 字符组成 
// 
//
// Related Topics 双指针 字符串 👍 284 👎 0

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.List;

class reverseVowelsOfAString{
    //2023-02-28 10:27:20
    //反转字符串中的元音字母
    //编号：[345]
    
    public static void main(String[] args) {
        Solution solution = new reverseVowelsOfAString().new Solution();
        String leetcode = solution.reverseVowels(".,");
        System.out.println(leetcode);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        char[] tns = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        String s1 = String.valueOf(tns);
        int left = 0 ;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
           while (left < chars.length && s1.indexOf(chars[left]) < 0){
               left++;
           }
           while (right >= 0 && s1.indexOf(chars[right]) < 0){
               right--;
           }
           if (left < right){
               char temp = chars[left];
               chars[left] = chars[right];
               chars[right] = temp;
               left++;
               right--;
           }
        }
        return String.valueOf(chars);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}