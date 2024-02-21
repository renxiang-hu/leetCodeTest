<p>如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 <strong>回文串</strong> 。</p>

<p>字母和数字都属于字母数字字符。</p>

<p>给你一个字符串 <code>s</code>，如果它是 <strong>回文串</strong> ，返回 <code>true</code><em> </em>；否则，返回<em> </em><code>false</code><em> </em>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入:</strong> s = "A man, a plan, a canal: Panama"
<strong>输出：</strong>true
<strong>解释：</strong>"amanaplanacanalpanama" 是回文串。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "race a car"
<strong>输出：</strong>false
<strong>解释：</strong>"raceacar" 不是回文串。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<strong>输入：</strong>s = " "
<strong>输出：</strong>true
<strong>解释：</strong>在移除非字母数字字符之后，s 是一个空字符串 "" 。
由于空字符串正着反着读都一样，所以是回文串。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 2 * 10<sup>5</sup></code></li> 
 <li><code>s</code> 仅由可打印的 ASCII 字符组成</li> 
</ul>

<div><div>Related Topics</div><div><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 610</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 和 [递归算法专题课](https://aep.xet.tech/s/3YGcq3) 限时附赠网站会员；算法可视化编辑器上线，[点击体验](https://labuladong.online/algo-visualize/)！**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题很简单，只要先把所有字符转化成小写，并过滤掉空格和标点这类字符，然后对剩下的字符执行 [数组双指针技巧汇总](https://labuladong.github.io/article/fname.html?fname=双指针技巧) 中提到的两端向中心的双指针算法即可。

**标签：回文串，[数组双指针](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2120601117519675393)**

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
    bool isPalindrome(string s) {
        // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
        string nstr;
        for(int i=0;i<s.size();i++){
            char c = s[i];
            if(isalnum(c)){
                nstr += tolower(c);
            }
        }
        // 然后对剩下的这些目标字符执行双指针算法，判断回文串
        int left = 0, right = nstr.size() - 1;
        while(left<right){
            if(nstr[left]!=nstr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def isPalindrome(self, s: str) -> bool:
        # 先把所有字符转化成小写，并过滤掉空格和标点这类字符
        sb = []
        for c in s:
            if c.isalnum():
                sb.append(c.lower())

        # 然后对剩下的这些目标字符执行双指针算法，判断回文串
        s = "".join(sb)
        # 一左一右两个指针相向而行
        left, right = 0, len(s) - 1
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public boolean isPalindrome(String s) {
        // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        // 然后对剩下的这些目标字符执行双指针算法，判断回文串
        s = sb.toString();
        // 一左一右两个指针相向而行
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码不保证正确性，仅供参考。如有疑惑，可以参照我写的 java 代码对比查看。

func isPalindrome(s string) bool {
    // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
    var sb strings.Builder
    for i := 0; i < len(s); i++ {
        c := s[i]
        if unicode.IsLetter(c) || unicode.IsDigit(c) {
            sb.WriteRune(unicode.ToLower(rune(c)))
        }
    }

    // 然后对剩下的这些目标字符执行双指针算法，判断回文串
    s = sb.String()
    // 一左一右两个指针相向而行
    left, right := 0, len(s)-1
    for left < right {
        if s[left] != s[right] {
            return false
        }
        left++
        right--
    }
    return true
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

var isPalindrome = function(s) {
    // 先把所有字符转化成小写，并过滤掉空格和标点这类字符
    let sb = "";
    for (let i = 0; i < s.length; i++) {
        let c = s.charAt(i);
        if (/[a-zA-Z0-9]/.test(c)) {
            sb += c.toLowerCase();
        }
    }

    // 然后对剩下的这些目标字符执行双指针算法，判断回文串
    s = sb;
    // 一左一右两个指针相向而行
    let left = 0;
    let right = s.length - 1;
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
};
```

</div></div>
</div></div>

<details open><summary><strong>🌟🌟 算法可视化 🌟🌟</strong></summary><div id="data_valid-palindrome" data="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"></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_valid-palindrome"></div></div>
</details><hr /><br />

**类似题目**：
  - [剑指 Offer II 018. 有效的回文 🟢](/problems/XltzEq)

</details>
</div>

