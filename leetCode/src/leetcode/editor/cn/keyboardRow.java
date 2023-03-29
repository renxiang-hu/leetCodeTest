//给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。 
//
// 美式键盘 中： 
//
// 
// 第一行由字符 "qwertyuiop" 组成。 
// 第二行由字符 "asdfghjkl" 组成。 
// 第三行由字符 "zxcvbnm" 组成。 
// 
//
// 
//
// 
//
// 示例 1： 
//
// 
//输入：words = ["Hello","Alaska","Dad","Peace"]
//输出：["Alaska","Dad"]
// 
//
// 示例 2： 
//
// 
//输入：words = ["omk"]
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：words = ["adsdf","sfd"]
//输出：["adsdf","sfd"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= words.length <= 20 
// 1 <= words[i].length <= 100 
// words[i] 由英文字母（小写和大写字母）组成 
// 
//
// Related Topics 数组 哈希表 字符串 👍 227 👎 0

package leetcode.editor.cn;

import com.sun.tools.javac.util.List;

import java.util.stream.Collectors;

class keyboardRow {
    //2022-12-18 13:19:18
    //键盘行
    //编号：[500]

    public static void main(String[] args) {
        Solution solution = new keyboardRow().new Solution();
        String[] word = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words = solution.findWords(word);
        for (String wo : words) {
            System.out.println(wo);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findWords(String[] words) {

            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}