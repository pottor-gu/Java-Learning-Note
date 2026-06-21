package com.gua.Variable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {

        // 定义身高、体重
        double weight;
        double height;

        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);

        // 录入数据
        System.out.println("请输入体重(kg)：");
        weight = sc.nextDouble();
        System.out.println("请输入身高(m)：");
        height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI:" + bmi);
    }
}
