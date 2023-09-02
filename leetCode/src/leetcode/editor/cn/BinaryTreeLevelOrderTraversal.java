//给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [3,9,20,null,null,15,7]
//输出：[[3],[9,20],[15,7]]
// 
//
// 示例 2： 
//
// 
//输入：root = [1]
//输出：[[1]]
// 
//
// 示例 3： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 2000] 内 
// -1000 <= Node.val <= 1000 
// 
//
// Related Topics树 | 广度优先搜索 | 二叉树 
//
// 👍 1782, 👎 0 
//
//
//
//


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Java：二叉树的层序遍历
public class BinaryTreeLevelOrderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
        List<List<Integer>> lists = solution.levelOrder(TreeUtil.createTree(new Integer[]{3,9,20,null,null,15,7}));
        System.out.println(lists);
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        checkFun(root,list);
        return list;
    }

    public void checkFun(TreeNode root , List<List<Integer>> list) {
        if (root==null) {
            return;
        }
        //创建一个队列
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //往队列里面添加元素
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> itemList = new ArrayList<>();
            int len = queue.size();
            while (len > 0) {
                 TreeNode poll = queue.poll();
                itemList.add(poll.val);
                if (poll.left!=null) {
                    queue.offer(poll.left);
                }
                if (poll.right!=null) {
                    queue.offer(poll.right);
                }
                len--;
            }
            list.add(itemList);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}