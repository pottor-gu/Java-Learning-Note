package com.gua.Variable;

import java.util.Scanner;

public class VariableDome5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数字1：");
        num1 = sc.nextInt();

        System.out.println("请输入数字2：");
        num2 = sc.nextInt();
        int Sum = num1 + num2;

        System.out.println("数字1+数字2的结果为：");
        System.out.println(Sum);
    }
}
