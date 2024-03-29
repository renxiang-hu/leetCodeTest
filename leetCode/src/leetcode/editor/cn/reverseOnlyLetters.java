//给你一个字符串 s ，根据下述规则反转字符串： 
//
// 
// 所有非英文字母保留在原有位置。 
// 所有英文字母（小写或大写）位置反转。 
// 
//
// 返回反转后的 s 。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 
//输入：s = "ab-cd"
//输出："dc-ba"
// 
//
// 
// 
//
// 示例 2： 
//
// 
//输入：s = "a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 
// 
//
// 示例 3： 
//
// 
//输入：s = "Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示 
//
// 
// 1 <= s.length <= 100 
// s 仅由 ASCII 值在范围 [33, 122] 的字符组成 
// s 不含 '\"' 或 '\\' 
// 
//
// Related Topics 双指针 字符串 👍 189 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

class reverseOnlyLetters{
    //2023-02-28 09:12:11
    //仅仅反转字母
    //编号：[917]
    
    public static void main(String[] args) {
        Solution solution = new reverseOnlyLetters().new Solution();
        String s = solution.reverseOnlyLetters("7_28");
        System.out.println(s);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
           if (!Character.isLetter(s.charAt(left))){
               left++;
           }
           if (!Character.isLetter(s.charAt(right))){
               right--;
           }
           if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])){
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