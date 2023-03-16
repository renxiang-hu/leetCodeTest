//全字母句 指包含英语字母表中每个字母至少一次的句子。 
//
// 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。 
//
// 如果是，返回 true ；否则，返回 false 。 
//
// 
//
// 示例 1： 
//
// 
//输入：sentence = "thequickbrownfoxjumpsoverthelazydog"
//输出：true
//解释：sentence 包含英语字母表中每个字母至少一次。
// 
//
// 示例 2： 
//
// 
//输入：sentence = "leetcode"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= sentence.length <= 1000 
// sentence 由小写英语字母组成 
// 
//
// Related Topics 哈希表 字符串 👍 72 👎 0

package leetcode.editor.cn;

import java.util.*;

class checkIfTheSentenceIsPangram{
    //2023-03-16 17:01:17
    //判断句子是否为全字母句
    //编号：[1832]
    
    public static void main(String[] args) {
        Solution solution = new checkIfTheSentenceIsPangram().new Solution();
        boolean ttl = solution.checkIfPangram("jwtucoucmdfwxxqnxzkaxoglszmfrcvjoiunqqausaxxaaijyqdqgvdnqcaihwilqkpivenpnekioyqujrdrovqrlxovcucjqzjsxmllfgndfprctxvxwlzjtciqxgsxfwhmuzqvlksyuztoetyjugmswfjtawwaqmwyxmvo");
        System.out.println(ttl);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkIfPangram(String sentence) {
        List<Character> all = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        if (sentence.length() < 26){
            return false;
        } else {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0 ; i < sentence.length() ; i++){
                map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
            }
            if (map.size() < 26){
                return false;
            }
            Set<Character> characters = map.keySet();
            for (Character character : characters){
                if (!all.contains(character)){
                    return false;
                }
            }

        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}