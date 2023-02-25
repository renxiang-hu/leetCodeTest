//给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Hello"
//输出："hello"
// 
//
// 示例 2： 
//
// 
//输入：s = "here"
//输出："here"
// 
//
// 示例 3： 
//
// 
//输入：s = "LOVELY"
//输出："lovely"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 由 ASCII 字符集中的可打印字符组成 
// 
//
// Related Topics 字符串 👍 223 👎 0

package leetcode.editor.cn;

class toLowerCase {
    //2023-01-11 10:09:51
    //转换成小写字母
    //编号：[709]

    public static void main(String[] args) {
        Solution solution = new toLowerCase().new Solution();
        String hello = solution.toLowerCase("Hello");
        System.out.println(hello);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String toLowerCase(String s) {
            StringBuffer stringBuffer = new StringBuffer();
            for (char ch : s.toCharArray()) {
                char c = Character.toLowerCase(ch);
                stringBuffer.append(c);
            }
            return stringBuffer.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}