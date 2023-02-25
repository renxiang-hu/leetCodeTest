package leetcode.editor.cn.排序;

import java.util.Arrays;

public class easyChooseSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 5, 4, 2, 4, 6, 9, 7};
        System.out.println(Arrays.toString(arr));
        chooseSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void chooseSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            int temp = 0;
            int index = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[j] < arrs[index]) {
                    index = j;
                }
            }
            temp = arrs[i];
            arrs[i] = arrs[index];
            arrs[index] = temp;
        }
    }
}
