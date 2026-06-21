package com.gua.Variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        /* 计算BMI
        *
        * 计算公式：BMI = 体重（kg）/身高^2 单位：kg/m^2
        * BMI数值(kg/m2)      身体状态        健康风险
        * 18.5以下               过轻         部分增加
        * 18.5-23.9             正常          正常
        * 24.0-27.9             过重          增加
        * 28.0-30.0             肥胖         中度增加
        * 30.0以上               重度肥胖     严重增加
        * */

        double weight = 75;
        double height = 1.75;
        // math.pow()函数 用于获取幂运算结果
        double bmi = weight / Math.pow(height, 2);

        System.out.println("BMI = " + bmi);

        // 计算当前身高，在标准BMI下的最高体重
        double maxWeight = Math.pow(height, 2) * 23.9;
        System.out.println("BMI = " + maxWeight);

    }

}
