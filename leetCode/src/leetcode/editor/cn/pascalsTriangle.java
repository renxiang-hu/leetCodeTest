//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。 
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。 
//
// 
//
// 
//
// 示例 1: 
//
// 
//输入: numRows = 5
//输出: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// 
//
// 示例 2: 
//
// 
//输入: numRows = 1
//输出: [[1]]
// 
//
// 
//
// 提示: 
//
// 
// 1 <= numRows <= 30 
// 
//
// Related Topics 数组 动态规划 👍 888 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class pascalsTriangle{
    //2023-01-03 13:07:55
    //杨辉三角
    //编号：[118]
    
    public static void main(String[] args) {
        Solution solution = new pascalsTriangle().new Solution();
        List<List<Integer>> generate = solution.generate(5);
        System.out.println(generate);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> list = new ArrayList<>();
       for (int i = 0 ; i < numRows ; i++){
           List<Integer> nt = new ArrayList<>();
           for (int j = 0 ; j <= i ; j++){
               if (j == 0 || j == i){
                   nt.add(1);
               } else {
                   nt.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
               }
           }
           list.add(nt);
       }
       return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}