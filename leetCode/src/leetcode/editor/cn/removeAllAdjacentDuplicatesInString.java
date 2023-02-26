//给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。 
//
// 在 S 上反复执行重复项删除操作，直到无法继续删除。 
//
// 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。 
//
// 
//
// 示例： 
//
// 输入："abbaca"
//输出："ca"
//解释：
//例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又
//只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= S.length <= 20000 
// S 仅由小写英文字母组成。 
// 
//
// Related Topics 栈 字符串 👍 494 👎 0

package leetcode.editor.cn;

import java.util.Stack;

class removeAllAdjacentDuplicatesInString{
    //2023-02-25 11:20:14
    //删除字符串中的所有相邻重复项
    //编号：[1047]
    
    public static void main(String[] args) {
        Solution solution = new removeAllAdjacentDuplicatesInString().new Solution();
        String abbaca = solution.removeDuplicates("abbaca");
        System.out.println(abbaca);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++){
            char tns = s.charAt(i);
            if (!stack.empty() && stack.peek() == tns){
                stack.pop();
            } else {
                stack.push(tns);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.insert(0,stack.pop());
        }
        return stringBuilder.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}