package com.gua.ifDemo;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        /*
        *       需求：小明每次订外卖都会在多家平台对比，看看谁的优惠力度大
        *          已知：
        *             饿了么App：满场9折优惠
        *             美团App：满30元减10元
        *           请问1：
        *               小明买了1顿烧烤50元，在哪家下单更划算
        *           请问2：
        *               如果价格不确定，数据有键盘录入而来呢？
        * */

        // 默认价格50
        double price = 50;

        // 判断是否由用户自定义输入价格
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格");

        if(sc.hasNextInt()){
            price = sc.nextInt();
        }

        // 计算饿了么的优惠价格
        double eleme = price * 0.9;

        // 计算美团优惠价格
        double meituan = price >= 30 ? price - 10 : price;

        // 判断哪家合适
        if(eleme < meituan){
            System.out.println("饿了么更划算");
        }else {
            System.out.println("美团更划算");
        }
    }
}
