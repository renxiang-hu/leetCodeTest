//给定两个字符串 s 和 t ，它们只包含小写字母。 
//
// 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。 
//
// 请找出在 t 中被添加的字母。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "abcd", t = "abcde"
//输出："e"
//解释：'e' 是那个被添加的字母。
// 
//
// 示例 2： 
//
// 
//输入：s = "", t = "y"
//输出："y"
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 1000 
// t.length == s.length + 1 
// s 和 t 只包含小写字母 
// 
//
// Related Topics 位运算 哈希表 字符串 排序 👍 372 👎 0

package leetcode.editor.cn;
class findTheDifference{
    //2023-01-09 23:17:29
    //找不同
    //编号：[389]
    
    public static void main(String[] args) {
        Solution solution = new findTheDifference().new Solution();
        char theDifference = solution.findTheDifference("abcd", "abcde");
        System.out.println(theDifference);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char findTheDifference(String s, String t) {
        int ret = 0;
        for (int i = 0 ; i < s.length() ; i++){
            ret ^= s.charAt(i);
        }
        for (int j = 0 ; j < t.length() ; j++){
            ret ^= t.charAt(j);
        }
        return (char) ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}