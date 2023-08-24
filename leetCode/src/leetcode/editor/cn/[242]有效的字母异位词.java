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
// Related Topics哈希表 | 字符串 | 排序 
//
// 👍 799, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

//Java：有效的字母异位词
class T242_ValidAnagram{
    public static void main(String[] args) {
        Solution solution = new T242_ValidAnagram().new Solution();
        boolean anagram = solution.isAnagram("a","ab");
        System.out.println(anagram);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        for (int i = 0 ; i < chars.length ; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        for (int j = 0 ; j < chars1.length ; j++) {
            map1.put(chars1[j],map1.getOrDefault(chars1[j],0)+1);
        }
        int size1 = map.size();
        int size2 = map1.size();
        Set<Character> characters = new HashSet<>();
        if (size1>size2) {
            characters = map.keySet();
        } else {
            characters = map1.keySet();
        }
        for (Character character : characters) {
            if (!map1.getOrDefault(character,0).equals(map.getOrDefault(character,0))) {
                return false;
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
