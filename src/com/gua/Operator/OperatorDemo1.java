package com.gua.Operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        /*
        *       算数运算符:+ - * / %
        *
        *       整数、浮点数
        * */


        // 整数计算
        // 整数除法 结果为整数，就是商，不考虑余数
        int a = 10;
        int b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 浮点数计算
        // 小数直接参加计算，有可能不精确
        double c = 10.0;
        double d = 3.0;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);

    }
}
