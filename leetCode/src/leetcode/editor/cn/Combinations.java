//给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。 
//
// 你可以按 任何顺序 返回答案。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 4, k = 2
//输出：
//[
//  [2,4],
//  [3,4],
//  [2,3],
//  [1,2],
//  [1,3],
//  [1,4],
//] 
//
// 示例 2： 
//
// 
//输入：n = 1, k = 1
//输出：[[1]] 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
//
// Related Topics回溯 
//
// 👍 1489, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Java：组合
public class Combinations{
    public static void main(String[] args) {
        Solution solution = new Combinations().new Solution();
        List<List<Integer>> combine = solution.combine(4, 2);
        System.out.println(combine);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> listTotal = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backtrack(n, k, list, 1,listTotal);
        return listTotal;
    }

        private void backtrack(int n, int k, List<Integer> list, int index, List<List<Integer>> listTotal) {
            if (list.size() == k) {
                listTotal.add(list);
                return;
            }
            for (int i = index; i <= n; i++) {
                // 经典回溯模板
                list.add(i);
                // 以 i + 1进行递归
                backtrack(n , k, list, i + 1, listTotal);
                list.remove(list.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}