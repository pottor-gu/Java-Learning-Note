package com.gua.Operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 时间转换

        int secondes = 3661;

        // 计算小时
        int hours = 3661 / 3600;

        // 计算分钟
        int min = secondes / 3600 % 60;

        // 计算秒
        int sec = secondes % 60;
        System.out.println(hours + ":" + min + ":" + sec);
    }
}
