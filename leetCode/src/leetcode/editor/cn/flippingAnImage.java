//给定一个
// n x n 的二进制矩阵 image ，先 水平 翻转图像，然后 反转 图像并返回 结果 。 
//
// 水平翻转图片就是将图片的每一行都进行翻转，即逆序。 
//
// 
// 例如，水平翻转 [1,1,0] 的结果是 [0,1,1]。 
// 
//
// 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。 
//
// 
// 例如，反转 [0,1,1] 的结果是 [1,0,0]。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：image = [[1,1,0],[1,0,1],[0,0,0]]
//输出：[[1,0,0],[0,1,0],[1,1,1]]
//解释：首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
//     然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
// 
//
// 示例 2： 
//
// 
//输入：image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
//输出：[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
//解释：首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
//     然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// 
//
// 
//
// 提示： 
//
// 
// 
//
// 
// n == image.length 
// n == image[i].length 
// 1 <= n <= 20 
// images[i][j] == 0 或 1. 
// 
//
// Related Topics数组 | 双指针 | 矩阵 | 模拟 
//
// 👍 298, 👎 0bug 反馈 | 使用指南 | 更多配套插件 
//
//
//
//

package leetcode.editor.cn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class flippingAnImage{
    //2023-04-17 16:34:21
    //翻转图像
    //编号：[832]
    
    public static void main(String[] args) {
        Solution solution = new flippingAnImage().new Solution();
        int[][] ints = solution.flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}});
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println(); // 换行
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0 ; i < image.length ; i++){
            int[] tns = image[i];
            int[] temp = new int[tns.length];
            int ns = 0;
            for (int j = tns.length - 1 ; j >= 0 ; j--){
               temp[ns] = tns[j];
               ns++;
            }
            for (int m = 0 ; m < temp.length ; m++){
                if (temp[m] == 0){
                    temp[m] = 1;
                } else {
                    temp[m] = 0;
                }
            }
            image[i] = temp;
        }
        return image;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}