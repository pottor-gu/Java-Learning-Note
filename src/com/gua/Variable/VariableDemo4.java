package com.gua.Variable;

import java.util.Scanner;

public class VariableDemo4 {
    public static void main(String[] args) {
        /*
        *   键盘录入
        *   第一步： 找到Scanner类
        *   第二步：创建Scanner对象
        *
        * */
        // 创建Scanner对象
        Scanner sc = new Scanner(System.in);

        // 接受数据
        String name = sc.next();
        int age  = sc.nextInt();
        double height = sc.nextDouble();
        System.out.println("name:" + name);
    }
}
