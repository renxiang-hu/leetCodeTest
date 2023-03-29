//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字典树 字符串 👍 2704 👎 0

package leetcode.editor.cn;

import java.util.*;

class longestCommonPrefix{
    //2023-03-29 11:11:50
    //最长公共前缀
    //编号：[14]
    
    public static void main(String[] args) {
        Solution solution = new longestCommonPrefix().new Solution();
        String s = solution.longestCommonPrefix(new String[]{"flower","flower","flower","flower"});
        System.out.println(s);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<Integer> list = new ArrayList<>();
        for (String ttn : strs){
            list.add(ttn.length());
        }
        Collections.sort(list);
        Integer integer = list.get(0);
        List<Character> list1 = new ArrayList<>();
        for (int i = 0 ; i < integer ; i++){
            Set<Character> set = new HashSet<>();
            for (int j = 0 ; j < strs.length ; j++){
               set.add(strs[j].charAt(i));
               if (set.size() > 1){
                   return convertToString(list1);
               } else {
                  set.add(strs[j].charAt(i));
               }
           }
            list1.addAll(set);
        }
        return convertToString(list1);
    }

    public String convertToString(List<Character> set){
        StringBuffer stringBuffer = new StringBuffer(set.size());
        for (Character character : set){
            stringBuffer.append(character);
        }
        return stringBuffer.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}