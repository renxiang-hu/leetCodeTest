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
// Related Topics双指针 | 字符串 
//
// 👍 315, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import sun.invoke.empty.Empty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：反转字符串中的元音字母
class T345_ReverseVowelsOfAString{
    public static void main(String[] args) {
        Solution solution = new T345_ReverseVowelsOfAString().new Solution();
        String hello = solution.reverseVowels(" ");
        System.out.println(hello);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseVowels(String s) {
        String felStr = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left<right) {
           while (left < s.length() && felStr.indexOf(s.charAt(left)) < 0) {
               left++;
           }
           while (right > 0 && felStr.indexOf(s.charAt(right)) < 0) {
               right--;
           }
           if (left < right) {
              reverseArr(chars,left,right);
              left++;
              right--;
           }
        }
        return new String(chars);
    }

    public void reverseArr(char[] chars,int left, int right){
        char tl = chars[left];
        chars[left] = chars[right];
        chars[right] = tl;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
