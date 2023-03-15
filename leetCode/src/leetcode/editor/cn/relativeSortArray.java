//给你两个数组，arr1 和 arr2，arr2 中的元素各不相同，arr2 中的每个元素都出现在 arr1 中。 
//
// 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末
//尾。 
//
// 
//
// 示例 1： 
//
// 
//输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//输出：[2,2,2,1,4,3,3,9,6,7,19]
// 
//
// 示例 2: 
//
// 
//输入：arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
//输出：[22,28,8,6,17,44]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= arr1.length, arr2.length <= 1000 
// 0 <= arr1[i], arr2[i] <= 1000 
// arr2 中的元素 arr2[i] 各不相同 
// arr2 中的每个元素 arr2[i] 都出现在 arr1 中 
// 
//
// Related Topics 数组 哈希表 计数排序 排序 👍 254 👎 0

package leetcode.editor.cn;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.util.stream.Collectors;

class relativeSortArray{
    //2023-03-13 20:11:27
    //数组的相对排序
    //编号：[1122]
    
    public static void main(String[] args) {
        Solution solution = new relativeSortArray().new Solution();
        int[] ints = {2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31};
        int[] ints1 = {2,42,38,0,43,21};
        int[] ints2 = solution.relativeSortArray(ints, ints1);
        System.out.println(Arrays.toString(ints2));
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // 创建一个哈希表，用于存储arr2中元素的出现次数
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr2) {
            countMap.put(num, 0);
        }

        // 遍历arr1，统计arr2中出现的元素的个数，并将剩余元素存入list
        List<Integer> list = new ArrayList<>();
        for (int num : arr1) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                list.add(num);
            }
        }

        // 对剩余元素进行排序
        Collections.sort(list);

        // 创建一个新的数组，将arr2中的元素按照出现次数插入到新数组中
        int[] result = new int[arr1.length];
        int index = 0;
        for (int num : arr2) {
            int count = countMap.get(num);
            for (int i = 0; i < count; i++) {
                result[index++] = num;
            }
        }

        // 将剩余元素插入到新数组中
        for (int num : list) {
            result[index++] = num;
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}