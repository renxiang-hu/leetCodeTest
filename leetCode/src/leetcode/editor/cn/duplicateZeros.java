//给你一个长度固定的整数数组 arr ，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。 
//
// 注意：请不要在超过该数组长度的位置写入元素。请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [1,0,2,3,0,4,5,0]
//输出：[1,0,0,2,3,0,0,4]
//解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4] 
//
// 示例 2： 
//
// 
//输入：arr = [1,2,3]
//输出：[1,2,3]
//解释：调用函数后，输入的数组将被修改为：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10⁴ 
// 0 <= arr[i] <= 9 
// 
//
// Related Topics数组 | 双指针 
//
// 👍 241, 👎 0 
//
//
//
//

package leetcode.editor.cn;

import java.util.Arrays;

class duplicateZeros{
    //2023-04-21 16:48:49
    //复写零
    //编号：[1089]
    
    public static void main(String[] args) {
        Solution solution = new duplicateZeros().new Solution();
        int[] ints = solution.duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
        System.out.println(Arrays.toString(ints));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] duplicateZeros(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++){
            //碰到0，先把0后面的右移一位
            if (arr[i] == 0 ){
               for (int j = arr.length - 1 ; j > i ; j--){
                   arr[j] = arr[j-1];
               }
               i++;
            }
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}