package com.gua.switchDemo;

import java.util.Scanner;

public class switchDemo1 {
    public static void main(String[] args) {
        String week;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天周几：");
        week = sc.next();
        switch (week){
            case "星期一":
                System.out.println("今天是星期一");
                break;
            case "星期二":
                System.out.println("今天是星期二");
                break;
            case "星期三":
                System.out.println("今天是星期三");
                break;
            case "星期四":
                System.out.println("今天是星期四");
                break;
            case "星期五":
                System.out.println("今天是星期五");
                break;
            case "星期六":
                System.out.println("今天是星期六");
                break;
            case "星期日":
                System.out.println("今天是星期日");
        }
    }
}
