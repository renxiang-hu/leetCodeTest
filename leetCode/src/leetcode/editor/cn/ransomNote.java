//给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。 
//
// 如果可以，返回 true ；否则返回 false 。 
//
// magazine 中的每个字符只能在 ransomNote 中使用一次。 
//
// 
//
// 示例 1： 
//
// 
//输入：ransomNote = "a", magazine = "b"
//输出：false
// 
//
// 示例 2： 
//
// 
//输入：ransomNote = "aa", magazine = "ab"
//输出：false
// 
//
// 示例 3： 
//
// 
//输入：ransomNote = "aa", magazine = "aab"
//输出：true
// 
//
// 
//
// 提示： 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote 和 magazine 由小写英文字母组成 
// 
//
// Related Topics 哈希表 字符串 计数 👍 619 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class ransomNote {
    //2023-01-15 18:37:54
    //赎金信
    //编号：[383]

    public static void main(String[] args) {
        Solution solution = new ransomNote().new Solution();
        boolean b = solution.canConstruct("a", "b");
        System.out.println(b);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> ranHashMap = new HashMap<>();
            for (int i = 0; i < ransomNote.length(); i++) {
                ranHashMap.put(ransomNote.charAt(i), ranHashMap.getOrDefault(ransomNote.charAt(i), 0) + 1);
            }
            Map<Character, Integer> magHashMap = new HashMap<>();
            for (int j = 0; j < magazine.length(); j++) {
                magHashMap.put(magazine.charAt(j), magHashMap.getOrDefault(magazine.charAt(j), 0) + 1);
            }
            for (Character ch : ranHashMap.keySet()) {
                if (ranHashMap.getOrDefault(ch, 0) > magHashMap.getOrDefault(ch, 0)) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}