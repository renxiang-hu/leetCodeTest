//给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。 
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
//输入: rowIndex = 3
//输出: [1,3,3,1]
// 
//
// 示例 2: 
//
// 
//输入: rowIndex = 0
//输出: [1]
// 
//
// 示例 3: 
//
// 
//输入: rowIndex = 1
//输出: [1,1]
// 
//
// 
//
// 提示: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
//
// 进阶： 
//
// 你可以优化你的算法到 O(rowIndex) 空间复杂度吗？ 
//
// Related Topics 数组 动态规划 👍 445 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class pascalsTriangleIi {
    //2023-01-03 13:36:31
    //杨辉三角 II
    //编号：[119]

    public static void main(String[] args) {
        Solution solution = new pascalsTriangleIi().new Solution();
        List<Integer> row = solution.getRow(3);
        System.out.println(row);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> getRow(int rowIndex) {
           List<List<Integer>> list = new ArrayList<>();
           for (int i = 0 ; i < rowIndex + 1; i++){
               List<Integer> newList = new ArrayList<>();
               for (int j = 0 ; j <= i ; j++){
                  if (j == 0 || j == i){
                      newList.add(1);
                  } else {
                      newList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                  }
               }
               list.add(newList);
           }
           return list.get(rowIndex);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}