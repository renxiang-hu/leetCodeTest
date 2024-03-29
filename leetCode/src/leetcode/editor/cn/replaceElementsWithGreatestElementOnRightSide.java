//给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。 
//
// 完成所有替换操作后，请你返回这个数组。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr = [17,18,5,4,6,1]
//输出：[18,6,6,6,1,-1]
//解释：
//- 下标 0 的元素 --> 右侧最大元素是下标 1 的元素 (18)
//- 下标 1 的元素 --> 右侧最大元素是下标 4 的元素 (6)
//- 下标 2 的元素 --> 右侧最大元素是下标 4 的元素 (6)
//- 下标 3 的元素 --> 右侧最大元素是下标 4 的元素 (6)
//- 下标 4 的元素 --> 右侧最大元素是下标 5 的元素 (1)
//- 下标 5 的元素 --> 右侧没有其他元素，替换为 -1
// 
//
// 示例 2： 
//
// 
//输入：arr = [400]
//输出：[-1]
//解释：下标 0 的元素右侧没有其他元素。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr.length <= 10⁴ 
// 1 <= arr[i] <= 10⁵ 
// 
//
// Related Topics 数组 👍 87 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

class replaceElementsWithGreatestElementOnRightSide{
    //2023-03-15 21:34:53
    //将每个元素替换为右侧最大元素
    //编号：[1299]
    
    public static void main(String[] args) {
        Solution solution = new replaceElementsWithGreatestElementOnRightSide().new Solution();
        int[] ints = solution.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        System.out.println(Arrays.toString(ints));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1, max1;
        for (int i = arr.length - 1; i >= 0; i--) {
            max1 = Math.max(max, arr[i]);
            arr[i] = max;
            max = max1;
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}