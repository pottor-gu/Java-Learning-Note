package com.gua.algorithmDemo;

import java.util.Random;

public class AlgorithmDemo2 {
    /*
    *   需求：红包问题
    *       M，红包总额，N，红包个数
    *           N个人来抽红包，红包金额随机
    * */
    public static void main(String[] args) {
        int money = 1;
        int person = 10;
        Random r = new Random();

        if (person > money){
            System.out.println("人数不能大于红包总额");
            return;
        }
        // 最后一人直接取剩余的M，不需要随机数
        for (int i = 0; i < person - 1; i++) {
                /*  确保没人都有至少1分
                *   money - person 减去N个人，保证每个人至少1分 + 1确保能够完全使用剩余的M
                * */
            // 随机数不能超过M-N
            int m = r.nextInt(money-person ) + 1;

            money = money - m;

            System.out.println("第" + (i+1) + "个人抢到" + m + "分");

        }

        System.out.println("最后一人" + money + "分");

    }

}
