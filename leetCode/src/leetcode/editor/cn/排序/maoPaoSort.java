package leetcode.editor.cn.排序;

import java.util.Arrays;

public class maoPaoSort {
    public static void main(String[] args) {
        int[] arr=new int[]{2,6,5,4,2,4,6,9,7};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arrs){
        int temp = 0;
        for (int i = 0 ; i < arrs.length - 1 ; i++){
            for (int j = 0 ; j < arrs.length - i - 1 ; j++){
               if (arrs[j] > arrs[j+1]){
                   temp = arrs[j];
                   arrs[j] = arrs[j+1];
                   arrs[j+1] = temp;
               }
            }
        }
    }
}
