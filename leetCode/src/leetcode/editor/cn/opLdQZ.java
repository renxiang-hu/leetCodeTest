//给定一个二叉搜索树的 根节点 root 和一个整数 k , 请判断该二叉搜索树中是否存在两个节点它们的值之和等于 k 。假设二叉搜索树中节点的值均唯一。 
//
// 
//
// 示例 1： 
//
// 
//输入: root = [8,6,10,5,7,9,11], k = 12
//输出: true
//解释: 节点 5 和节点 7 之和等于 12
// 
//
// 示例 2： 
//
// 
//输入: root = [8,6,10,5,7,9,11], k = 22
//输出: false
//解释: 不存在两个节点值之和为 22 的节点
// 
//
// 
//
// 提示： 
//
// 
// 二叉树的节点个数的范围是 [1, 10⁴]. 
// -10⁴ <= Node.val <= 10⁴ 
// root 为二叉搜索树 
// -10⁵ <= k <= 10⁵ 
// 
//
// 
//
// 注意：本题与主站 653 题相同： https://leetcode-cn.com/problems/two-sum-iv-input-is-a-bst/
// 
//
// Related Topics 树 深度优先搜索 广度优先搜索 二叉搜索树 哈希表 双指针 二叉树 👍 58 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

class opLdQZ{
    //2023-03-30 13:14:41
    //二叉搜索树中两个节点之和
    //编号：[剑指 Offer II 056]
    
    public static void main(String[] args) {
        Solution solution = new opLdQZ().new Solution();
        TreeNode tree = TreeUtil.createTree(new Integer[]{8, 6, 10, 5, 7, 9, 11});
        boolean target = solution.findTarget(tree, 12);
        System.out.println(target);
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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        queryVal(root,list);
        for (int i = 0 ; i < list.size() ; i++){
            for (int j = i + 1 ; j < list.size() ; j++){
                if (list.get(i) + list.get(j) == k){
                    return true;
                }
            }
        }
        return false;
    }

    public void queryVal(TreeNode root , List<Integer> list){
        if (root == null){
            return;
        }
        list.add(root.val);
        queryVal(root.left,list);
        queryVal(root.right,list);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}