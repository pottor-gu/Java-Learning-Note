package com.gua.algorithmDemo;

public class AlgorithmDeno1 {
    /*
    * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。
    * 然后返回 nums 中与 val 不同的元素的数量。
    *       思路：快慢指针
    *            slow 记录非val的元素存入的位置
    *            fast 找val
    *             当fast找到val时，fast + 1
    *             不是val时，fast指向的元素赋给slow，slow + 1
    * */
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int val = 2;

        int num = removeElement(nums,val);

        for (int i = 0; i < num; i++) {
            System.out.print(nums[i] + " ");
        }

    }
    public static int removeElement(int[] arr,int value){
        int slow = 0;
        int fast = 0;

        for (; fast < arr.length; fast++){
            if (arr[fast] ==  value){
                fast ++;
            }else {
                arr[slow] = arr[fast];
                slow++;
            }
        }

        return slow;
    }

}
