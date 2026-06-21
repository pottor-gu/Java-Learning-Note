package com.gua.ifDemo;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {
        // 需求：最大生命200 收到x伤害，恢复y点血 x,y键盘输入
        // 人物不会死，最少剩下1滴血
        // 最终血量
        int health = 200;
        int hurt = 0;
        int recover = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入伤害");
        hurt = sc.nextInt();

        System.out.println("请输入恢复");
        recover = sc.nextInt();

        health = health - hurt + recover;

        // 判断血量是否小于等于0
        if(health <= 0){
            health = 1;
        }
        if(health > 200){
            health = 200;
        }
        System.out.println("最终血量：" + health);
    }
}
