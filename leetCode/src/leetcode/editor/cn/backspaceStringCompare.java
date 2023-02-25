//给定 s 和 t 两个字符串，当它们分别被输入到空白的文本编辑器后，如果两者相等，返回 true 。# 代表退格字符。 
//
// 注意：如果对空文本输入退格字符，文本继续为空。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "ab#c", t = "ad#c"
//输出：true
//解释：s 和 t 都会变成 "ac"。
// 
//
// 示例 2： 
//
// 
//输入：s = "ab##", t = "c#d#"
//输出：true
//解释：s 和 t 都会变成 ""。
// 
//
// 示例 3： 
//
// 
//输入：s = "a#c", t = "b"
//输出：false
//解释：s 会变成 "c"，但 t 仍然是 "b"。 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length, t.length <= 200 
// s 和 t 只含有小写字母以及字符 '#' 
// 
//
// 
//
// 进阶： 
//
// 
// 你可以用 O(n) 的时间复杂度和 O(1) 的空间复杂度解决该问题吗？ 
// 
//
// Related Topics 栈 双指针 字符串 模拟 👍 582 👎 0

package leetcode.editor.cn;

class backspaceStringCompare {
    //2023-02-13 09:57:55
    //比较含退格的字符串
    //编号：[844]

    public static void main(String[] args) {
        Solution solution = new backspaceStringCompare().new Solution();
        boolean b = solution.backspaceCompare("ab#c", "ad#c");
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            return build(s).equals(build(t));
        }

        public String build(String ans) {
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i < ans.length(); i++) {
                char tl = ans.charAt(i);
                if (tl != '#') {
                    buffer.append(tl);
                } else {
                    if (buffer.length() > 0) {
                        buffer.deleteCharAt(buffer.length() - 1);
                    }
                }
            }
            return buffer.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}