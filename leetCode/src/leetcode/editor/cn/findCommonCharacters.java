//给你一个字符串数组 words ，请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），并以数组形式返回。你可以按 任意顺序 返回答
//案。
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["bella","label","roller"]
//输出：["e","l","l"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["cool","lock","cook"]
//输出：["c","o"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 100 
// words[i] 由小写英文字母组成 
// 
//
// Related Topics 数组 哈希表 字符串 👍 309 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class findCommonCharacters {
    //2023-01-15 16:28:14
    //查找共用字符
    //编号：[1002]

    public static void main(String[] args) {
        Solution solution = new findCommonCharacters().new Solution();
        List<String> strings = solution.commonChars(new String[]{"cool","lock","cook"});
        System.out.println(strings.toString());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> commonChars(String[] words) {
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}