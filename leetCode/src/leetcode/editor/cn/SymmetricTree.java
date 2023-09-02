//给你一个二叉树的根节点 root ， 检查它是否轴对称。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,2,2,3,4,4,3]
//输出：true
// 
//
// 示例 2： 
// 
// 
//输入：root = [1,2,2,null,3,null,3]
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [1, 1000] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：你可以运用递归和迭代两种方法解决这个问题吗？ 
//
// Related Topics树 | 深度优先搜索 | 广度优先搜索 | 二叉树 
//
// 👍 2521, 👎 0 
//
//
//
//


package leetcode.editor.cn;
//Java：对称二叉树
public class SymmetricTree{
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
        TreeNode tree = TreeUtil.createTree(new Integer[]{1,2,2,2,null,2});
        boolean symmetric = solution.isSymmetric(tree);
        System.out.println(symmetric);
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
class Solution {
    /**
     *     第一步骤：左 ，右比较  boolean compare(TreeNode left,TreeNode right)
     *     第二步骤：left.val!=right.val || left==null || right==null
     *     第三步骤：compare(left.left,right.right) && compare(left.right,right.left)
     */


    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode left,TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null && right != null) {
            return false;
        }
        if (left != null && right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return compare(left.left,right.right) && compare(left.right,right.left);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}