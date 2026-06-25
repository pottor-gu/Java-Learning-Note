package com.gua.ifDemo;

import java.util.Scanner;

public class ifDemo4 {
    public static void main(String[] args) {
        /*
        *       需求：
        *           阶梯式电量缴费，规则如下
        *             <=100   0.5/度
        *           101-200  0.8/度
        *            >200  1.2/度
        *
        * */
        // 变量usage记录实际用电量
        double usage;
        // 变量cost记录电费
        double cost = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入实际用电量：");
        usage = sc.nextDouble();
        if(usage<0){
            System.out.println("你丫的是来交电费了，还是TM抢钱来了");
        }else {
            if(usage <= 100){
                cost = usage * 0.5;
            } else if (usage < 200) {
                double v = usage - 100;
                cost = 100 * 0.5 + v * 0.8;
            }else {
                double v = usage - 200;
                cost = 100 * 0.5 + 100 * 0.8 + v * 1.2;
            }
        }
        System.out.println("电费为：" + cost);
    }
}
