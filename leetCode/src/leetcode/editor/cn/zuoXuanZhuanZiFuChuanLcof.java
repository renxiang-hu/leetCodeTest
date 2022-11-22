//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数
//将返回左旋转两位得到的结果"cdefgab"。 
//
// 
//
// 示例 1： 
//
// 输入: s = "abcdefg", k = 2
//输出: "cdefgab"
// 
//
// 示例 2： 
//
// 输入: s = "lrloseumgh", k = 6
//输出: "umghlrlose"
// 
//
// 
//
// 限制： 
//
// 
// 1 <= k < s.length <= 10000 
// 
//
// Related Topics 数学 双指针 字符串 👍 319 👎 0

package leetcode.editor.cn;
class zuoXuanZhuanZiFuChuanLcof{
    //2022-11-18 23:23:04
    //左旋转字符串
    //编号：[剑指 Offer 58 - II]
    
    public static void main(String[] args) {
        Solution solution = new zuoXuanZhuanZiFuChuanLcof().new Solution();
        String abcdefg = solution.reverseLeftWords("abcdefg", 2);
        System.out.println(abcdefg);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {
        String substring = s.substring(0, n);
        String substring1 = s.substring(n , s.length());
        StringBuffer stringBuffer = new StringBuffer();
        String s1 = stringBuffer.append(substring1).append(substring).toString();
    return s1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}