//在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。 
//
// 示例 1: 
//
// 
//输入：s = "abaccdeff"
//输出：'b'
// 
//
// 示例 2: 
//
// 
//输入：s = "" 
//输出：' '
// 
//
// 
//
// 限制： 
//
// 0 <= s 的长度 <= 50000 
//
// Related Topics 队列 哈希表 字符串 计数 👍 272 👎 0

package leetcode.editor.cn;

import java.util.*;

class diYiGeZhiChuXianYiCiDeZiFuLcof{
    //2022-11-21 08:39:57
    //第一个只出现一次的字符
    //编号：[剑指 Offer 50]
    
    public static void main(String[] args) {
        Solution solution = new diYiGeZhiChuXianYiCiDeZiFuLcof().new Solution();
        char abaccdeff = solution.firstUniqChar("leetcode");
        System.out.println(abaccdeff);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0 ; i < chars.length ; i++){
            if (hashMap.containsKey(chars[i])){
               hashMap.put(chars[i],hashMap.get(chars[i])+1);
            } else {
               hashMap.put(chars[i],1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            System.out.println(next.getKey());
            System.out.println(next.getValue());
            if (next.getValue() == 1){
                return next.getKey();
            }
        }
        return ' ';
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}