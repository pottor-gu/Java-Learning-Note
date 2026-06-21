package com.gua.switchDemo;

import java.util.Scanner;

public class switchDemo4 {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");

        month = sc.nextInt();
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31天");
                break;
            case 4, 6, 9, 11:
                System.out.println("30天");
                break;
            case 2:
                System.out.println("28天");
                break;
        }
    }
}
