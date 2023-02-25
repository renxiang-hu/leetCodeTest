//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 
//输入: s = "rat", t = "car"
//输出: false 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s 和 t 仅包含小写字母 
// 
//
// 
//
// 进阶: 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
//
// Related Topics 哈希表 字符串 排序 👍 716 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

class validAnagram {
    //2023-01-15 18:07:50
    //有效的字母异位词
    //编号：[242]

    public static void main(String[] args) {
        Solution solution = new validAnagram().new Solution();
        boolean anagram = solution.isAnagram("rat", "car");
        System.out.println(anagram);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            } else {
                Map<Character, Integer> sMap = new HashMap<>();
                for (int i = 0; i < s.length(); i++) {
                    sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
                }
                Map<Character, Integer> tMap = new HashMap<>();
                for (int j = 0; j < t.length(); j++) {
                    tMap.put(t.charAt(j), tMap.getOrDefault(t.charAt(j), 0) + 1);
                }
                if (!sMap.equals(tMap)) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}