//给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。 
//
// 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。 
//
// 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。 
//
// 返回词汇表 words 中你掌握的所有单词的 长度之和。 
//
// 
//
// 示例 1： 
//
// 输入：words = ["cat","bt","hat","tree"], chars = "atach"
//输出：6
//解释： 
//可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
// 
//
// 示例 2： 
//
// 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
//输出：10
//解释：
//可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 1000 
// 1 <= words[i].length, chars.length <= 100 
// 所有字符串中都仅包含小写英文字母 
// 
//
// Related Topics 数组 哈希表 字符串 👍 170 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class findWordsThatCanBeFormedByCharacters {
    //2023-01-12 18:01:35
    //拼写单词
    //编号：[1160]

    public static void main(String[] args) {
        Solution solution = new findWordsThatCanBeFormedByCharacters().new Solution();
        int atach = solution.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach");
        System.out.println(atach);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public int countCharacters(String[] words, String chars) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0 ; i < chars.length() ; i++){
                map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
            }
            boolean tns = true;
            int sum = 0;
            for (int j = 0 ; j < words.length ; j++){
                String word = words[j];
                Map<Character, Integer> map1 = new HashMap<>();
                for (int m = 0 ; m < word.length() ; m++) {
                    map1.put(word.charAt(m),map1.getOrDefault(word.charAt(m),0)+1);
                }
                Set<Character> characters = map1.keySet();
                for (Character val : characters){
                    if (map1.getOrDefault(val,0) > map.getOrDefault(val,0)){
                        tns = false;
                        break;
                    } else {
                        tns = true;
                    }
                }
                if (tns){
                    sum += word.length();
                }
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}