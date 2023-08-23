//给定一个包含大写字母和小写字母的字符串
// s ，返回 通过这些字母构造成的 最长的回文串 。 
//
// 在构造过程中，请注意 区分大小写 。比如 "Aa" 不能当做一个回文字符串。 
//
// 
//
// 示例 1: 
//
// 
//输入:s = "abccccdd"
//输出:7
//解释:
//我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
// 
//
// 示例 2: 
//
// 
//输入:s = "a"
//输出:1
// 
//
// 示例 3： 
//
// 
//输入:s = "aaaaaccc"
//输出:7 
//
// 
//
// 提示: 
//
// 
// 1 <= s.length <= 2000 
// s 只由小写 和/或 大写英文字母组成 
// 
//
// Related Topics贪心 | 哈希表 | 字符串 
//
// 👍 548, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import java.util.*;

//Java：最长回文串
class T409_LongestPalindrome{
    public static void main(String[] args) {
        Solution solution = new T409_LongestPalindrome().new Solution();
        int aaaaaccc = solution.longestPalindrome("aaaaaccc");
        System.out.println(aaaaaccc);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    //只能存在一个奇数
class Solution {
    public int longestPalindrome(String s) {
        if (s.length()==1){
            return 1;
        }
        Set<Character> list = new HashSet<>();
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0 ; i < chars.length ; i++) {
            map.put(chars[i],map.getOrDefault(chars[i],0)+1);
        }
        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            if (map.get(character) % 2 == 1) {
                list.add(character);
            }
        }
        return list.size()>0?(s.length()-list.size()+1):(s.length());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
