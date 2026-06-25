package com.gua.arrayDemo;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            arr[i] = sc.nextInt();
        }

        for (int j : arr) {
            System.out.println("数组元素为：" + j);

        }
    }
}
