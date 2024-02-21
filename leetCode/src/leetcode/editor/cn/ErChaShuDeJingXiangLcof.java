/**
 * 题目Id：剑指 Offer 27
 * 题目：二叉树的镜像
 * 日期：2022-07-11 13:51:18
 */
//请完成一个函数，输入一个二叉树，该函数输出它的镜像。
//
// 例如输入：
//
// 4
// / \
// 2 7
// / \ / \
//1 3 6 9
//镜像输出：
//
// 4
// / \
// 7 2
// / \ / \
//9 6 3 1
//
//
//
// 示例 1：
//
// 输入：root = [4,2,7,1,3,6,9]
//输出：[4,7,2,9,6,3,1]
//
//
//
//
// 限制：
//
// 0 <= 节点个数 <= 1000
//
// 注意：本题与主站 226 题相同：https://leetcode-cn.com/problems/invert-binary-tree/
// Related Topics 树 深度优先搜索 广度优先搜索 二叉树 👍 279 👎 0

package leetcode.editor.cn;

import java.util.Stack;

public class ErChaShuDeJingXiangLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaShuDeJingXiangLcof().new Solution();
        Integer[] arr = {4, 2, 7, 1, 3, 6, 9};
        TreeNode i = solution.mirrorTree(TreeUtil.createTree(arr));
        System.out.println(i);
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    class Solution {
        public TreeNode mirrorTree(TreeNode root) {
            Stack<TreeNode> stack = new Stack<>();
            if (root==null) {
                return root;
            }
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode pop = stack.pop();
                TreeNode temp = pop.left;
                pop.left = pop.right;
                pop.right = temp;
                if (pop.left!=null) {
                   stack.push(pop.left);
                }
                if (pop.right!=null) {
                   stack.push(pop.right);
                }
            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
