<p>给定一个二叉树的根节点 <code>root</code> ，返回 <em>它的 <strong>中序</strong>&nbsp;遍历</em> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg" style="height: 200px; width: 125px;" />
<pre>
<strong>输入：</strong>root = [1,null,2,3]
<strong>输出：</strong>[1,3,2]
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>root = []
<strong>输出：</strong>[]
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>root = [1]
<strong>输出：</strong>[1]
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul>
	<li>树中节点数目在范围 <code>[0, 100]</code> 内</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>

<p>&nbsp;</p>

<p><strong>进阶:</strong>&nbsp;递归算法很简单，你可以通过迭代算法完成吗？</p>
<div><div>Related Topics</div><div><li>栈</li><li>树</li><li>深度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 1476</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 和 [递归算法专题课](https://aep.xet.tech/s/3YGcq3) 限时附赠网站会员，全新纸质书[《labuladong 的算法笔记》](https://labuladong.gitee.io/algo/images/book/book_intro_qrcode.jpg) 出版，签名版限时半价！**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

不要瞧不起二叉树的遍历问题，前文 [我的刷题经验总结](https://labuladong.github.io/article/fname.html?fname=算法心得) 说过，二叉树的遍历代码是动态规划和回溯算法的祖宗。

动态规划思路的核心在于明确并利用函数的定义分解问题，中序遍历结果的特点是 `root.val` 在中间，左右子树在两侧：

![](https://labuladong.github.io/pictures/二叉树系列2/1.jpeg)

回溯算法的核心很简单，就是 `traverse` 函数遍历二叉树。

本题就分别用两种不同的思路来写代码，注意体会两种思路的区别所在。

**标签：[二叉树](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2121994699837177859)**

## 解法代码

提示：🟢 标记的是我写的解法代码，🤖 标记的是 chatGPT 翻译的多语言解法代码。如有错误，可以 [点这里](https://github.com/labuladong/fucking-algorithm/issues/1113) 反馈和修正。

<div class="tab-panel"><div class="tab-nav">
<button data-tab-item="cpp" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">cpp🤖</button>

<button data-tab-item="python" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">python🤖</button>

<button data-tab-item="java" class="tab-nav-button btn active" data-tab-group="default" onclick="switchTab(this)">java🟢</button>

<button data-tab-item="go" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">go🤖</button>

<button data-tab-item="javascript" class="tab-nav-button btn " data-tab-group="default" onclick="switchTab(this)">javascript🤖</button>
</div><div class="tab-content">
<div data-tab-item="cpp" class="tab-item " data-tab-group="default"><div class="highlight">

```cpp
// 注意：cpp 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution {
public:
    /* 动态规划思路 */
    // 定义：输入一个节点，返回以该节点为根的二叉树的中序遍历结果
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> res;
        if (root == NULL) {
            return res;
        }
        vector<int> left = inorderTraversal(root->left);
        res.insert(res.end(), left.begin(), left.end());
        res.push_back(root->val);
        vector<int> right = inorderTraversal(root->right);
        res.insert(res.end(), right.begin(), right.end());
        return res;
    }

    /* 回溯算法思路 */
    vector<int> res;

    // 返回前序遍历结果
    vector<int> inorderTraversal2(TreeNode* root) {
        traverse(root);
        return res;
    }

    // 二叉树遍历函数
    void traverse(TreeNode* root) {
        if (root == NULL) {
            return;
        }
        traverse(root->left);
        // 中序遍历位置
        res.push_back(root->val);
        traverse(root->right);
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        """动态规划思路
        定义：输入一个节点，返回以该节点为根的二叉树的中序遍历结果
        """
        res = []
        if not root:
            return res
        res += self.inorderTraversal(root.left)
        res.append(root.val)
        res += self.inorderTraversal(root.right)
        return res
    
    def inorderTraversal2(self, root: TreeNode) -> List[int]:
        """回溯算法思路"""
        self.res = []
        self.traverse(root)
        return self.res
    
    def traverse(self, root: TreeNode):
        """二叉树遍历函数"""
        if not root:
            return
        self.traverse(root.left)
        # 中序遍历位置
        self.res.append(root.val)
        self.traverse(root.right)
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    /* 动态规划思路 */
    // 定义：输入一个节点，返回以该节点为根的二叉树的中序遍历结果
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));
        return res;
    }

    /* 回溯算法思路 */
    LinkedList<Integer> res = new LinkedList<>();

    // 返回前序遍历结果
    public List<Integer> inorderTraversal2(TreeNode root) {
        traverse(root);
        return res;
    }

    // 二叉树遍历函数
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        // 中序遍历位置
        res.add(root.val);
        traverse(root.right);
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

// 动态规划思路
// 定义：输入一个节点，返回以该节点为根的二叉树的中序遍历结果
func inorderTraversal(root *TreeNode) []int {
    res := []int{}
    if root == nil {
        return res
    }
    res = append(res, inorderTraversal(root.Left)...)
    res = append(res, root.Val)
    res = append(res, inorderTraversal(root.Right)...)
    return res
}

// 回溯算法思路
func inorderTraversal2(root *TreeNode) []int {
    res := []int{}
    // 二叉树遍历函数
    var traverse func(node *TreeNode)
    traverse = func(node *TreeNode) {
        if node == nil {
            return
        }
        traverse(node.Left)
        // 中序遍历位置
        res = append(res, node.Val)
        traverse(node.Right)
    }

    traverse(root)
    return res
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码不保证正确性，仅供参考。如有疑惑，可以参照我写的 java 代码对比查看。

var inorderTraversal = function(root) {
    let res = new LinkedList();
    if (root === null) {
        return res;
    }
    res.addAll(inorderTraversal(root.left));
    res.add(root.val);
    res.addAll(inorderTraversal(root.right));
    return res;
};

var inorderTraversal2 = function(root) {
    let res = new LinkedList();
    if (root === null) {
        return res;
    }
    
    traverse(root);
    return res;
};

const traverse = function(root, res) {
    if (root === null) {
        return;
    }
    traverse(root.left, res);
    // 中序遍历位置
    res.add(root.val);
    traverse(root.right, res);
}
```

</div></div>
</div></div>

<details open><summary><strong>🍭🍭 算法可视化 🍭🍭</strong></summary><div id="data_binary-tree-inorder-traversal" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_binary-tree-inorder-traversal"></div></div>
</details><hr /><br />

</details>
</div>



