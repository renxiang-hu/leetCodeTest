//如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。 
//
// 字母和数字都属于字母数字字符。 
//
// 给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入: s = "A man, a plan, a canal: Panama"
//输出：true
//解释："amanaplanacanalpanama" 是回文串。
// 
//
// 示例 2： 
//
// 
//输入：s = "race a car"
//输出：false
//解释："raceacar" 不是回文串。
// 
//
// 示例 3： 
//
// 
//输入：s = " "
//输出：true
//解释：在移除非字母数字字符之后，s 是一个空字符串 "" 。
//由于空字符串正着反着读都一样，所以是回文串。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// s 仅由可打印的 ASCII 字符组成 
// 
//
// Related Topics 双指针 字符串 👍 610 👎 0

package leetcode.editor.cn;
class validPalindrome{
    //2023-02-16 15:35:20
    //验证回文串
    //编号：[125]
    
    public static void main(String[] args) {
        Solution solution = new validPalindrome().new Solution();
        boolean palindrome = solution.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(palindrome);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
       if (" ".equals(s)){
           return true;
       }
       StringBuffer stringBuffer = new StringBuffer();
       String replaceString = s.replace(" ", "");
       for (int i = 0 ; i < replaceString.length() ; i++){
           char c = replaceString.charAt(i);
           if (Character.isLetterOrDigit(c)){
               char c1 = Character.toLowerCase(c);
               stringBuffer.append(c1);
           }
       }
        String s1 = stringBuffer.toString();
        int left = 0;
        int right = s1.length() - 1;
        while (left <= right){
            if (s1.charAt(left)==s1.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}