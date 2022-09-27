/**
  * 题目Id：104
  * 题目：二叉树的最大深度
  * 日期：2022-07-01 14:42:06
*/
//给定一个二叉树，找出其最大深度。
//
// 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//
// 说明: 叶子节点是指没有子节点的节点。
//
// 示例：
//给定二叉树 [3,9,20,null,null,15,7]，
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
// 返回它的最大深度 3 。
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 1279 👎 0

package leetcode.editor.cn;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Solution solution = new MaximumDepthOfBinaryTree().new Solution();
        Integer[] arr = {3,9,20,null,null,15,7};
        int i = solution.maxDepth(TreeUtil.createTree(arr));
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

    /**
     * 思路：对树结构进行遍历，一个节点取左右节点的最大值
     */
    class Solution {
    public int maxDepth(TreeNode root) {
       if (root == null){
           return 0;
       }
        int i = maxDepth(root.left);
        int i1 = maxDepth(root.right);
        return Math.max(i,i1) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
