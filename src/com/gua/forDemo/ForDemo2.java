package com.gua.forDemo;

import java.util.Scanner;

public class forDemo2 {
    public static void main(String[] args) {

        int a, b;
        int num = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字：");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            for (int i = b; i <= a; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println(i+"既可以被3整除又可以被5整除");
                    num++;
                }
            }
        } else {
            for (int i = a; i <= b; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println(i+"既可以被3整除又可以被5整除");
                    num++;
                }
            }
        }
        System.out.println("共"+num+"个既可以被3整除又可以被5整除的数字");
    }
}