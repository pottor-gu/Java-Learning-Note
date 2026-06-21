package com.gua.Operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        /*
        *       数值拆分
        *
        *       1999
        *       1 9 9 9
        * */

        int a = 1999;
        int b = a / 1000;
        int c = a / 100 % 10;
        int d = a / 10 % 10;
        int e = a % 10;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
