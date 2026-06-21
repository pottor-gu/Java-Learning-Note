package com.gua.litereal;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int a = 10;

    public int[] twoSum(int[] nums, int target){
        // 定义一个哈希数组
        // key 记录已经遍历过的值 value 记录该值在数组中的索引
        Map<Integer, Integer>map = new HashMap<>();

         int a = 10;

        // 循环遍历数组
        for(int i = 0;i < nums.length; i++){
            int complement = target - nums[i]; // 计算需要的另一个数字

            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            };

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");

    }
}
