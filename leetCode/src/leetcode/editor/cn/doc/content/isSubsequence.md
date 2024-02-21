<p>给定字符串 <strong>s</strong> 和 <strong>t</strong> ，判断 <strong>s</strong> 是否为 <strong>t</strong> 的子序列。</p>

<p>字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，<code>"ace"</code>是<code>"abcde"</code>的一个子序列，而<code>"aec"</code>不是）。</p>

<p><strong>进阶：</strong></p>

<p>如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k &gt;= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？</p>

<p><strong>致谢：</strong></p>

<p>特别感谢<strong> </strong><a href="https://leetcode.com/pbrother/">@pbrother&nbsp;</a>添加此问题并且创建所有测试用例。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "abc", t = "ahbgdc"
<strong>输出：</strong>true
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "axc", t = "ahbgdc"
<strong>输出：</strong>false
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>0 &lt;= s.length &lt;= 100</code></li> 
 <li><code>0 &lt;= t.length &lt;= 10^4</code></li> 
 <li>两个字符串都只由小写字符组成。</li> 
</ul>

<div><div>Related Topics</div><div><li>双指针</li><li>字符串</li><li>动态规划</li></div></div><br><div><li>👍 741</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 和 [递归算法专题课](https://aep.xet.tech/s/3YGcq3) 限时附赠网站会员；算法可视化编辑器上线，[点击体验](https://labuladong.online/algo-visualize/)！**



<p><strong><a href="https://labuladong.gitee.io/article/slug.html?slug=is-subsequence" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

力扣上的这道题很简单，利用双指针 `i, j` 分别指向 `s, t`，一边前进一边匹配子序列。

![](https://labuladong.github.io/pictures/子序列/1.gif)

但这题的进阶比较有难度，需要利用二分搜索技巧来判断子序列，见详细题解。

**详细题解：[二分查找高效判定子序列](https://labuladong.github.io/article/fname.html?fname=二分查找判定子序列)**

**标签：[二分搜索](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)，子序列**

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
    bool isSubsequence(string s, string t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s[i] == t[j]) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i, j = 0, 0
        while i < len(s) and j < len(t):
            if s[i] == t[j]:
                i += 1
            j += 1
        return i == len(s)
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

func isSubsequence(s string, t string) bool {
    i, j := 0, 0
    for i < len(s) && j < len(t) {
        if s[i] == t[j] {
            i++
        }
        j++
    }
    return i == len(s)
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {
    let i = 0, j = 0;
    while (i < s.length && j < t.length) {
        if (s.charAt(i) === t.charAt(j)) {
            i++;
        }
        j++;
    }
    return i === s.length;
};
```

</div></div>
</div></div>

<details open><summary><strong>👾👾 算法可视化 👾👾</strong></summary><div id="data_is-subsequence" data="GyMfERWb3QB0HmRuxp1dhcNaP3tRUFg0aBQiizq9XrUdAqgBtpYpZChZ05mQHDjb9yQIJyVVO2n6AJm2TFfjigfmV98UCdJipy/+/6+lSCNcCG6EibDh2SQF1vX1Oe/9n1siRaxmVxZoKISqgKhrXJ2rdoSqy3AKtD7RBLEJwb7vH+625+1931kHcQnvfWe3f2HgtLw5dQ5BUl/f5MfTqpgif4TrVxHquzUl/J0iVmW2abv1V4Unxe7l4MJCLE3UPmk2RO3YbVbhuVanjWGKvqlcmGuK1Ovavc/2uc7F28Ppus0N680mh+6NJihbr8702Z9WHmY6rZy273YDuBj57jKTdCxjNuakY4jP+sdNcJxZHKfL5jvvGZMoNc1XS3H7skth6zjhoFzoSXLtOo4cys2IFaa0r80h00XDGAjCkamer2fPqiiN5ARcKTH0EAxO9lyvmdZtYLBca7FpIjK59IA6xDzOSNesx7nb/rtSK54OIxjXjWguKjgEYtFlQfmbj1+7g33j+/OHN0VMSy8yjY1YSBdwOFzCJLhei05TC+Qk3BnfUGLH3A/eOzXLNe/vn0OA+/cG9rcWvBT/DmD/UMg6P/wPt1P27038Dxyxf2/B/tbC9/3fgazzk1F66FMTohVcbDe8LmwZR/u/+TnYP4FkwTBtTXAJT9WMHxWeV14mlQ0GKbXLpO3GTE6NTvV6fs42uXSWJ216sfe+8/sbX584YbfdAajUwLRy3Wx8EaBob55HnDDQnQ/2HrUKLC6brlmFHWX/N0HNCWyUeeAJrutmnH/MZhKwfbxqzant/ij/KxSL1dgUeh4gSYNmEtUpkK5AHv0lbbnAUPINWjiYK+o+0jAkAQro5KNXKstV53VYzUC56MQqgHIRWdP5kSdjVLR9qWbIw5B3chGShN00N0ABmi6tUiyYM8IZOdpmGrhBl86iaXmCAtIXJ7VEsU9SFVTRWCg9BAlC2oJSKD0EDqMyWC3hHDIhLJ2spLWFCK+utoLNr9f39vdcJbQ/hQoTMkNlwnCe95frEVUGG4T8RBBYZUKkKHwu+rl6XOaa9/WqaRTCi/1DwwKBo0piWaRc/e7idytik9K8z7voex3Y4Bs6ztGv4anE2Vwkz0LV1FTrPkQEQqpEJuqQgLOmMvYsIziiEqjQAB5+WmaIohMoAZJcL7Xw85zktk0MeKg8otl2UtIWqlAyGJSfSGNcjTCtliKl3YWCR7CnAw3CW/1h/eos9VtRHkAUsqa9IgQ6w8qk3oGAYqk4RIHQgLzkoNqgY+CwX/MiH3RltrkdDiiUvOShi9IthdM2V+NTJJWpaIq2Zc8YkZaoYXOEVL/dby/X8OWYotxkdQgUKPMydcK4ox94E+QRHP8cWTHkUq5IarRuNtXByBX0LfRsgpAOE802sTt/lyhFzyzUgpC3G/psVdUhWhI0J/TqksA0sxIZaav/EiG7PtFV2iAYpDsKfD3w+7axYadp+N3Ytm+lWmlD/9upuJXKfM/izAwiwwwcZQVaOyRSX4SFBlQsLUF76zB4n1hj+TsXEVn7NXxoCRbx+oBmDuQ0DBEZACCPJQjYh6U5oLvrdmHmHwt9WMAeVFwnhP5V9FyxpEKySTG8PmytGbD5sZwS07C/v2+HaTR9oaSzZ2d3nx5uH28gMEHWvquF2jSVIDbYXUQWy5iMbaPsO8DJU5N+EE7OwSSZcvvk9K7fWep4pj65rVZMCE/ftFazpenLZ6Tjl9umd7u2DQ=="></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_is-subsequence"></div></div>
</details><hr /><br />

**类似题目**：
  - [792. 匹配子序列的单词数 🟠](/problems/number-of-matching-subsequences)

</details>
</div>

