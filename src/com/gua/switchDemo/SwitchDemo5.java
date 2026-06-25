package com.gua.switchDemo;

public class switchDemo5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String operator = "*";

        int result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        /*int result = switch (operator) {
            case "+": {
                yield a + b;
            };
            case "-": {
                yield a + b;
            };
            case "*": {
                yield a + b;
            };
            case "/": {
                yield a + b;
            };
            default:{
                yield 0;
            } ;
        };*/
        System.out.println(result);
    }
}
