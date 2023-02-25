//给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即 B[
//i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。 
//
// 
//
// 示例: 
//
// 
//输入: [1,2,3,4,5]
//输出: [120,60,40,30,24] 
//
// 
//
// 提示： 
//
// 
// 所有元素乘积之和不会溢出 32 位整数 
// a.length <= 100000 
// 
//
// Related Topics 数组 前缀和 👍 274 👎 0

package leetcode.editor.cn;

class gouJianChengJiShuZuLcof {
    //2022-11-19 09:09:03
    //构建乘积数组
    //编号：[剑指 Offer 66]

    public static void main(String[] args) {
        Solution solution = new gouJianChengJiShuZuLcof().new Solution();
        int[] x = {1, 2, 3, 4, 5};
        int[] ints = solution.constructArr(x);
        System.out.println(ints.toString());
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] constructArr(int[] a) {
            int[] arr = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                int tt = 1;
                for (int j = 0; j < a.length; j++) {
                    if (i == j) {
                        continue;
                    }
                    tt = tt * a[j];
                }
                arr[i] = tt;
            }
            return arr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}