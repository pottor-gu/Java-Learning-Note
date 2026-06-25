package com.gua.ifDemo;

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
        /*
        *   需求：
        *       计算充值不同金额，储值卡中的余额
        *
        *
        * */
        int money;
        // 定义余额
        int balance;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额：");
        money = sc.nextInt();
        if(money>1000){
            if(money<2000) {
                balance = money + 200;
                System.out.println("门票39元/次");
            }
            else if (money < 3000) {
                balance = money + 500;
                System.out.println("持卡本人及同行客人门票35元/次");
                        }
            else if (money < 5000) {
                balance = money + 700;
                System.out.println("持卡本人及同行客人门票35元/次");
            }
            else if (money < 10000) {
                balance = money + 1300;
                System.out.println("持卡本人及同行客人门票35元/次");
            }
            else if (money < 20000) {
                balance = money + 2500;
                System.out.println("1.持卡本人及同行客人门票30元/次");
                System.out.println("2.送专属更衣箱一个");
            }
            else if (money < 50000) {
                balance = money + 6000;
                System.out.println("1.持卡本人及同行客人门票30元/次");
                System.out.println("2.送专属更衣箱一个");
            }
            else {
                balance = money + 15000;
                System.out.println("1.持卡本人及同行客人门票30元/次");
                System.out.println("2.送专属更衣箱一个");
                System.out.println("3.送专属浴袍一套");
            }

        }else {
            balance = money;
            System.out.println("没有优惠政策，余额为"+ balance);
        }
        System.out.println("余额为：" + balance);




    }
}
