//给定一个字符串
// s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "Let's take LeetCode contest"
//输出："s'teL ekat edoCteeL tsetnoc"
// 
//
// 示例 2: 
//
// 
//输入： s = "God Ding"
//输出："doG gniD"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// 
// s 包含可打印的 ASCII 字符。 
// 
// s 不包含任何开头或结尾空格。 
// 
// s 里 至少 有一个词。 
// 
// s 中的所有单词都用一个空格隔开。 
// 
//
// Related Topics 双指针 字符串 👍 520 👎 0

package leetcode.editor.cn;

import com.sun.deploy.util.StringUtils;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

class reverseWordsInAStringIii {
    //2023-02-17 09:10:30
    //反转字符串中的单词 III
    //编号：[557]

    public static void main(String[] args) {
        Solution solution = new reverseWordsInAStringIii().new Solution();
        String s = solution.reverseWords("Let's take LeetCode contest");
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            String[] s1 = s.split(" ");
            StringBuffer stringBuffer = new StringBuffer();
            String ttl = null;
            String trim = null;
            StringBuffer innerBuffer = new StringBuffer();
            for (int i = 0; i < s1.length; i++) {
                String[] split = s1[i].split("");
                int left = 0;
                int right = split.length - 1;
                while (left <= right) {
                    String temp = split[left];
                    split[left] = split[right];
                    split[right] = temp;
                    left++;
                    right--;
                }
                ttl = Arrays.stream(split).collect(Collectors.joining());
                trim = innerBuffer.append(ttl).append(" ").toString().trim();
            }
            return trim;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}