<p>字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入:</strong> s = "abcdefg", k = 2
<strong>输出:&nbsp;</strong>"cdefgab"
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入:</strong> s = "lrloseumgh", k = 6
<strong>输出:&nbsp;</strong>"umghlrlose"
</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<ul> 
 <li><code>1 &lt;= k &lt; s.length &lt;= 10000</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数学</li><li>双指针</li><li>字符串</li></div></div><br><div><li>👍 319</li><li>👎 0</li></div>

<div id="labuladong"><hr>

**通知：[数据结构精品课](https://aep.h5.xeknow.com/s/1XJHEO) 和 [递归算法专题课](https://aep.xet.tech/s/3YGcq3) 限时附赠网站会员，全新纸质书[《labuladong 的算法笔记》](https://labuladong.gitee.io/algo/images/book/book_intro_qrcode.jpg) 出版，签名版限时半价！**

<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题没啥难度，只要注意一下不同编程语言底层的字符串实现原理（可变/不可变）即可。

**标签：字符串**

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
// 本代码不保证正确性，仅供参考。如有疑惑，可以参照我写的 java 代码对比查看。

class Solution {
public:
    string reverseLeftWords(string s, int n) {
        return s.substr(n) + s.substr(0, n);
    }
};
```

</div></div>

<div data-tab-item="python" class="tab-item " data-tab-group="default"><div class="highlight">

```python
# 注意：python 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
# 本代码已经通过力扣的测试用例，应该可直接成功提交。

class Solution:
    def reverseLeftWords(self, s: str, n: int) -> str:
        return s[n:] + s[:n]
```

</div></div>

<div data-tab-item="java" class="tab-item active" data-tab-group="default"><div class="highlight">

```java
class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
```

</div></div>

<div data-tab-item="go" class="tab-item " data-tab-group="default"><div class="highlight">

```go
// 注意：go 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码不保证正确性，仅供参考。如有疑惑，可以参照我写的 java 代码对比查看。

func reverseLeftWords(s string, n int) string {
    return s[n:] + s[:n]
}
```

</div></div>

<div data-tab-item="javascript" class="tab-item " data-tab-group="default"><div class="highlight">

```javascript
// 注意：javascript 代码由 chatGPT🤖 根据我的 java 代码翻译，旨在帮助不同背景的读者理解算法逻辑。
// 本代码已经通过力扣的测试用例，应该可直接成功提交。

/**
 * @param {string} s
 * @param {number} n
 * @return {string}
 */
var reverseLeftWords = function(s, n) {
    return s.substring(n) + s.substring(0, n);
};
```

</div></div>
</div></div>

<details open><summary><strong>🥳🥳 算法可视化 🥳🥳</strong></summary><div id="data_zuo-xuan-zhuan-zi-fu-chuan-lcof" data="G/8MAIzEOCbyooi/QuRSl1Wtx1XCAuMDoh5EtNYRxK/f7+fexNMhBWt/mE6k1Ld7L4uKPMM0uURCJSdyYxHPWan4Z+w7sFrzetit3z2phJE1sPoLA4+xC1YrBxFiXa9Bfw4zY0z4D/8iLT1mNxdMmB+KuI7R6Z+/47nWeksoSIyu5IoflpKXNlTtrAZGvv3dNxejQFb9sxhGx6g+y5fSSemZZ1/fPW5a0QVu3mBWIEVHpOpfPuGqei8LLkSBaa5nNenbAFOfE/pTH7oQqqgH6a+5+AlG5AIjWtemuS1+t1W2TmdOEPgObnN0pR139mwI9/T8yufYHEXwBbQVvgh851iLokOOVhRiW6PpuZodxJdXq1h2adTUd0b+L7WzGMRQOVgc10plzLciqJfYjpkX5ZY42l3X5ia4i++xY05g7VIZacPhRkp8YA2r/21FQZKmuNIsDGXTGEgCUcchurGD9nf8XYGl1k7UvAQW2v1yVyJkGrsDLoHGor8MpfCrnE7JAL2Ipeub3zdQ0Sah/QbpsSBggnLOTVl600RRhOMpNTJ1Tc9oqdKASwFReUaSwWWHFfvvj56liXMGUQJVcvJZIGIXbbf00TQlzaFGQBomFbAIRMSuNOpCd5JhhkjBhJAqFWCykuoLBEqLrErM6pqHkqE0jY+MyyoFhO6MF3RoG0IZRqRC6NA2cKxVN2rGrbUpAWMLREJ5NtlE4tp3Mn8OlnwruISUJfn/NnBsTI/dNV8/vSwwk0YaCvgICAs/qkBI2IEQCilb4CUs0yOaAjUvjx+tjDEcWBfbdN989bAcjBQs96E9+CV8ajv0DVC+AHdl1nwqQ3EgMCXDEHXvgZKs2FI7OaQIDZ8CGWP7sZDBLRk9dM3jyVkl4Z88TjwXrchhg7nPrY+8bW0ZmjQRt5TQIS8LAM/gCZuaQogCxlL50HW95QUCEMQ7xajMCOBac+azzjCnJHjCa7cwNrXlQXKohd7kmmYY7dmerXixQFgWfTlXU56eO4DBZx54CFpfDtXEyJQy2jpukz9pA2mRxLVKhyq7vn56CQdEndtAQbeXDNGI3HrUgL0V3OZTQ3pQhavguDRYD4Cmi1YAztC29RRfMvGZMPSo1S+e+QXZ9EC23mXiqZCGpPddxDqKE5ixNSGpy3g6Wk2IFFVPJ1pc8nJhBDJVi2SlOF2AOgnuErzyt7dRdeumZF2svvFK+XSBIu+UVJFp/nJ9dsYYVGfVgx+hyg/Ro2tuqgVIxRe8wkFFooQKVyXXWxRlsg3UWNGLZi8uKjitDnSMhWZp7yLK8xROq/ODpYhWye2i9GbDqNqTXv5/efBd/q6cMBbwpSNjF1V3elvJdHTIl+fW+QpiPt69Lb2pAQ=="></div><div class="resizable aspect-ratio-container" style="height: 100%;">
<div id="iframe_zuo-xuan-zhuan-zi-fu-chuan-lcof"></div></div>
</details><hr /><br />

</details>
</div>

