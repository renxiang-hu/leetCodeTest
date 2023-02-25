/**
 * 题目Id：257
 * 题目：二叉树的所有路径
 * 日期：2022-09-26 18:04:05
 */
//给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
//
// 叶子节点 是指没有子节点的节点。
//
// 示例 1：
//
//
//输入：root = [1,2,3,null,5]
//输出：["1->2->5","1->3"]
//
//
// 示例 2：
//
//
//输入：root = [1]
//输出：["1"]
//
//
//
//
// 提示：
//
//
// 树中节点的数目在范围 [1, 100] 内
// -100 <= Node.val <= 100
//
//
// Related Topics 树 深度优先搜索 字符串 回溯 二叉树 👍 822 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePaths().new Solution();
        Integer[] arr = {1, 2, 3, null, 5};
        List<String> list = solution.binaryTreePaths(TreeUtil.createTree(arr));
        System.out.println(list.toString());
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> list = new ArrayList<>();
            binaryPath(root, "", list);
            return list;
        }

        /**
         *  思路：如果当前节点是叶子节点(节点的左节点和右节点都为空)，那么直接把结果加入到list中
         *       如果当前节点不是叶子节点，遍历，遍历的过程中用“->”连接
         */
        public void binaryPath(TreeNode root, String path, List<String> list) {
            if (root != null) {
                StringBuilder stringBuilder = new StringBuilder(path);
                stringBuilder.append(root.val);
                if (root.left == null && root.right == null) {
                    list.add(stringBuilder.toString());
                } else {
                    stringBuilder.append("->");
                    binaryPath(root.left, stringBuilder.toString(), list);
                    binaryPath(root.right, stringBuilder.toString(), list);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
