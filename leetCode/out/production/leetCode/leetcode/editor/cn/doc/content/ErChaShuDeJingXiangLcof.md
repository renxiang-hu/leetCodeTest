<p>请完成一个函数，输入一个二叉树，该函数输出它的镜像。</p>

<p>例如输入：</p>

<p><code>&nbsp; &nbsp; &nbsp;4<br>
&nbsp; &nbsp;/ &nbsp; \<br>
&nbsp; 2 &nbsp; &nbsp; 7<br>
&nbsp;/ \ &nbsp; / \<br>
1 &nbsp; 3 6 &nbsp; 9</code><br>
镜像输出：</p>

<p><code>&nbsp; &nbsp; &nbsp;4<br>
&nbsp; &nbsp;/ &nbsp; \<br>
&nbsp; 7 &nbsp; &nbsp; 2<br>
&nbsp;/ \ &nbsp; / \<br>
9 &nbsp; 6 3&nbsp; &nbsp;1</code></p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>root = [4,2,7,1,3,6,9]
<strong>输出：</strong>[4,7,2,9,6,3,1]
</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<p><code>0 &lt;= 节点个数 &lt;= 1000</code></p>

<p>注意：本题与主站 226 题相同：<a href="https://leetcode-cn.com/problems/invert-binary-tree/">https://leetcode-cn.com/problems/invert-binary-tree/</a></p>
<div><div>Related Topics</div><div><li>树</li><li>深度优先搜索</li><li>广度优先搜索</li><li>二叉树</li></div></div><br><div><li>👍 279</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 已更新到 V2.1，[手把手刷二叉树系列课程](https://aep.xet.tech/s/3YGcq3) 上线。**



<p><strong><a href="https://labuladong.github.io/article/slug.html?slug=er-cha-shu-de-jing-xiang-lcof" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题和 [226. 翻转二叉树](/problems/invert-binary-tree) 相同。

> 本文有视频版：[二叉树/递归的框架思维（纲领篇）](https://www.bilibili.com/video/BV1nG411x77H)

前文 [手把手刷二叉树总结篇](https://labuladong.github.io/article/fname.html?fname=二叉树总结) 说过二叉树的递归分为「遍历」和「分解问题」两种思维模式，这道题可以同时使用两种思维模式。

如何翻转二叉树？其实就是把二叉树上的每个节点的左右子节点都交换一下，我同时给出两种思维模式下的解法供你对比。

**详细题解：[东哥带你刷二叉树（思路篇）](https://labuladong.github.io/article/fname.html?fname=二叉树系列1)**

**标签：[二叉树](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2121994699837177859)，[数据结构](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=1318892385270808576)**

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
// 本代码还未经过力扣测试，仅供参考，如有疑惑，可以参照我写的 java 代码对比查看。

// 「遍历」的思路
class Solution {
public:
    // 二叉树遍历函数
    void traverse(TreeNode* root) {
        if (root == nullptr) {
            return;
        }

        /**** 前序位置 ****/
        // 每一个节点需要做的事就是交换它的左右子节点
        TreeNode* tmp = root->left;
        root->left = root->right;
        root->right = tmp;

        // 遍历框架，去遍历左右子树的节点
        traverse(root->left);
        traverse(root->right);
    }

    // 主函数
    TreeNode* invertTree(TreeNode* root) {
        // 遍历二叉树，交换每个节点的子节点
        traverse(root);
        return root;
    }
};

// 「分解问题」的思路
class Solution2 {
public:
    // 定义：将以 root 为根的这棵二叉树翻转，返回翻转后的二叉树的根节点
    TreeNode* invertTree(TreeNode* root) {
        if (root == nullptr) {
            return nullptr;
        }
        // 利用函数定义，先翻转左右子树
        TreeNode* left = invertTree(root->left);
        TreeNode* right = invertTree(root->right);

        // 然后交换左右子节点
        root->left = right;
        root->right = left;

        // 和定义逻辑自恰：以 root 为根的这棵二叉树已经被翻转，返回 root
        return root;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码还未经过力扣测试，仅供参考，如有疑惑，可以参照我写的 java 代码对比查看。

# 「遍历」的思路
class Solution:
    # 主函数
    def invertTree(self, root: TreeNode) -> TreeNode:
        # 遍历二叉树，交换每个节点的子节点
        self.traverse(root)
        return root

    # 二叉树遍历函数
    def traverse(self, root: TreeNode) -> None:
        if root is None:
            return

        # 前序位置
        # 每一个节点需要做的事就是交换它的左右子节点
        tmp = root.left
        root.left = root.right
        root.right = tmp

        # 遍历框架，去遍历左右子树的节点
        self.traverse(root.left)
        self.traverse(root.right)


# 「分解问题」的思路
class Solution2:
    # 定义：将以 root 为根的这棵二叉树翻转，返回翻转后的二叉树的根节点
    def invertTree(self, root: TreeNode) -> TreeNode:
        if root is None:
            return None

        # 利用函数定义，先翻转左右子树
        left = self.invertTree(root.left)
        right = self.invertTree(root.right)

        # 然后交换左右子节点
        root.left = right
        root.right = left

        # 和定义逻辑自恰：以 root 为根的这棵二叉树已经被翻转，返回 root
        return root
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
// 「遍历」的思路
class Solution {
    // 主函数
    public TreeNode invertTree(TreeNode root) {
        // 遍历二叉树，交换每个节点的子节点
        traverse(root);
        return root;
    }

    // 二叉树遍历函数
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        /**** 前序位置 ****/
        // 每一个节点需要做的事就是交换它的左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 遍历框架，去遍历左右子树的节点
        traverse(root.left);
        traverse(root.right);
    }
}

// 「分解问题」的思路
class Solution2 {
    // 定义：将以 root 为根的这棵二叉树翻转，返回翻转后的二叉树的根节点
    TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 利用函数定义，先翻转左右子树
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 然后交换左右子节点
        root.left = right;
        root.right = left;

        // 和定义逻辑自恰：以 root 为根的这棵二叉树已经被翻转，返回 root
        return root;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码还未经过力扣测试，仅供参考，如有疑惑，可以参照我写的 java 代码对比查看。

/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

//「遍历」的思路
func invertTree(root *TreeNode) *TreeNode {
    // 遍历二叉树，交换每个节点的子节点
    traverse(root)
    return root
}

// 二叉树遍历函数
func traverse(root *TreeNode) {
    if root == nil {
        return
    }
    //每一个节点需要做的事就是交换它的左右子节点
    tmp := root.Left
    root.Left = root.Right
    root.Right = tmp

    // 遍历框架，去遍历左右子树的节点
    traverse(root.Left)
    traverse(root.Right)
}

//「分解问题」的思路
func invertTree(root *TreeNode) *TreeNode {
    if root == nil {
        return nil
    }
    // 利用函数定义，先翻转左右子树
    left := invertTree(root.Left)
    right := invertTree(root.Right)

    // 然后交换左右子节点
    root.Left = right
    root.Right = left

    // 和定义逻辑自恰：以 root 为根的这棵二叉树已经被翻转，返回 root
    return root
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码还未经过力扣测试，仅供参考，如有疑惑，可以参照我写的 java 代码对比查看。

// 「遍历」的思路
var Solution = function() {};

// 主函数
Solution.prototype.invertTree = function(root) {
    // 遍历二叉树，交换每个节点的子节点
    this.traverse(root);
    return root;
};

// 二叉树遍历函数
Solution.prototype.traverse = function(root) {
    if (root == null) {
        return;
    }

    /**** 前序位置 ****/
    // 每一个节点需要做的事就是交换它的左右子节点
    var tmp = root.left;
    root.left = root.right;
    root.right = tmp;

    // 遍历框架，去遍历左右子树的节点
    this.traverse(root.left);
    this.traverse(root.right);
};

// 「分解问题」的思路
var Solution2 = function() {};

// 定义：将以 root 为根的这棵二叉树翻转，返回翻转后的二叉树的根节点
Solution2.prototype.invertTree = function(root) {
    if (root == null) {
        return null;
    }
    // 利用函数定义，先翻转左右子树
    var left = this.invertTree(root.left);
    var right = this.invertTree(root.right);

    // 然后交换左右子节点
    root.left = right;
    root.right = left;

    // 和定义逻辑自恰：以 root 为根的这棵二叉树已经被翻转，返回 root
    return root;
};
```

</div></div>
</div></div>

**类似题目**：
  - [114. 二叉树展开为链表 🟠](/problems/flatten-binary-tree-to-linked-list)
  - [116. 填充每个节点的下一个右侧节点指针 🟠](/problems/populating-next-right-pointers-in-each-node)
  - [剑指 Offer 27. 二叉树的镜像 🟢](/problems/er-cha-shu-de-jing-xiang-lcof)

</details>
</div>

