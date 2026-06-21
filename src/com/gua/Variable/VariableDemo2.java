package com.gua.Variable;

public class VariableDemo2 {
    /*
    *       我方：叉子           对方：长手
    *       攻击：200           攻击：180
    *       防御：100           防御：120
    *       血量：1012.5        血量：1233.3
    *       技能加成：1.2        技能加成：1.3
    *
    *
    *       技能造成伤害：攻击 * 技能加成 - 对方防御
    *       普攻造成伤害：攻击 - 对方防御
    *
    *       计算：
    *       我方的第一次进行普通攻击，造成多少伤害，对方还剩多少血？
    *       我方的第二次进行技能攻击，造成多少伤害，对方还剩多少血？
    *
    * */
    public static void main(String[] args) {
        // 双方攻击力
        int attack1 = 200;
        int attack2 = 180;
        // 双方防御力
        int defense1 = 100;
        int defense2 = 120;
        // 两方血量
        double health1 = 1012.5;
        double health2 = 1233.3;
        // 技能加成
        double skillAdd1 = 1.2;
        double skillAdd2 = 1.3;

        // 我方的第一次进行普通攻击，造成多少伤害，对方还剩多少血？
        double damage = attack1 * skillAdd1 - defense1;
        health2 = health2 - damage;
        System.out.println("我方普通攻击造成伤害：" + damage + "，对方还剩" + health2);

        // 我方的第二次进行技能攻击，造成多少伤害，对方还剩多少血？
        double damage2 = attack1 * skillAdd1 - defense1;
        health2 = health2 - damage2;
        System.out.println("我方技能攻击造成伤害：" + damage2 + "，对方还剩" + health2);
    }

}
