//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。 
//
// 示例 1： 
//
// 
//输入: s = "leetcode"
//输出: false 
// 
//
// 示例 2： 
//
// 
//输入: s = "abc"
//输出: true
// 
//
// 限制： 
//
// 
// 0 <= len(s) <= 100 
// s[i]仅包含小写字母 
// 如果你不使用额外的数据结构，会很加分。 
// 
//
// Related Topics位运算 | 哈希表 | 字符串 | 排序 
//
// 👍 285, 👎 0 
//
//
//
//

package leetcode.editor.cn;

import java.util.HashSet;
import java.util.Set;

class isUniqueLcci{
    //2023-04-28 09:16:42
    //判定字符是否唯一
    //编号：[面试题 01.01]
    
    public static void main(String[] args) {
        Solution solution = new isUniqueLcci().new Solution();
        boolean leetcode = solution.isUnique("abc");
        System.out.println(leetcode);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0 ; i < astr.length() ; i++){
            if (!set.add(astr.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}