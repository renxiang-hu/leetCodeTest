//给你一个字符串 s ，如果 s 是一个 好 字符串，请你返回 true ，否则请返回 false 。 
//
// 如果 s 中出现过的 所有 字符的出现次数 相同 ，那么我们称字符串 s 是 好 字符串。 
//
// 
//
// 示例 1： 
//
// 输入：s = "abacbc"
//输出：true
//解释：s 中出现过的字符为 'a'，'b' 和 'c' 。s 中所有字符均出现 2 次。
// 
//
// 示例 2： 
//
// 输入：s = "aaabb"
//输出：false
//解释：s 中出现过的字符为 'a' 和 'b' 。
//'a' 出现了 3 次，'b' 出现了 2 次，两者出现次数不同。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 只包含小写英文字母。 
// 
//
// Related Topics 哈希表 字符串 计数 👍 18 👎 0

package leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

class checkIfAllCharactersHaveEqualNumberOfOccurrences{
    //2023-03-27 09:11:04
    //检查是否所有字符出现次数相同
    //编号：[1941]
    
    public static void main(String[] args) {
        Solution solution = new checkIfAllCharactersHaveEqualNumberOfOccurrences().new Solution();
        boolean abacbc = solution.areOccurrencesEqual("abacbc");
        System.out.println(abacbc);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Integer> list = new ArrayList<>();
        Set<Character> characters = map.keySet();
        for (Character character : characters){
            list.add(map.get(character));
        }
        int size = list.stream().distinct().collect(Collectors.toList()).size();
        if (size != 1){
            return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}