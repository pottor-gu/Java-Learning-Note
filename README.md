# JAVA基础

## 短路逻辑运算符

&&以及||，与单个的&以及|相同，只不过在判断时左边不符合条件就直接跳出了，不执行右边，提高了效率，&& 左边false 右边不执行，|| 左边为true，右边不执行

## 三元运算符

~~~ java
int a = 10;
int b = 15;
int c = a > b ? a : b;
~~~

## 判断

### `if`语句

~~~java
// 第一种格式
if(表达式关系){
    语句体
}
其他语句体
~~~

> 细节：
>
> 1. 大括号的位置：
>
>    左括号在上一行末尾，不要另起一行
>
> 2. 大括号的省略
>
>    如果大括号中的语句只有一行，大括号可以省略
>
> 3. 小括号后面不能有分号
>
>    小括号后面不能有分号，这样会拆开`if`的语句结构
>
> 4. 判断布尔类型的变量
>
>    判断布尔类型的变量，直接把变量写在小括号中即可

~~~java
// 第二种格式
if(关系表达式){
    语句体A;
}else{
    语句体B;
}
~~~

~~~java
if(关系表达式A){
    语句体A;
}else if(关系表达式B){
    语句体B;
}else if(关系表达式C){
    语句体C;
}
...
else{
    语句体N;
}
~~~

### `switch`语句

~~~java
swich(表达式){
    case 值1:
    	语句体1;
    	break;
    case 值2:
		语句体1;
    	break;
    default:
    	语句体1;
    	break;
}
~~~

> 细节说明:
>
> 1. 表达式：结果(字符/整数byte short int /枚举(jdk5以后)/字符串(jdk7以后))
> 2. case：被匹配的值，只能是真实的数据
> 3. case：值不允许被重复
> 4. break：表示中断，结束switch语句
> 5. default：所有情况都不匹配，执行该处内容

#### 1. default的位置和省略

位置：case和default的位置是没有标准的上下之分的，位置可以任意书写

省略：default是可以省略不写的，在此时如果所有的case都不匹配，则没有任何输出结果

#### 2. case穿透

在我们写代码的时候，如果break没有写，就会触发case穿透现象。

执行流程：

1. 拿着小括号中的值于下边的case进行匹配

2. 如果匹配上，执行case中的语句体，语句体执行完后会继续执行下一个case中的语句体，不顾及下一个case的判断条件，
3. 直至遇到break或者是switch结束。

应用场景：

​		当多个case的语句体重复的时候，利用case穿透节省代码

#### 3. switch新特性	JDK12预览版	JDK14正式开始长期支持

1. 箭头标签

   不会有case穿透现象

   ~~~java
    switch (number) {
               case 1 -> System.out.println("星期一");
               case 2 -> System.out.println("星期二");
               case 3 -> System.out.println("星期三");
               case 4 -> System.out.println("星期四");
               case 5 -> System.out.println("星期五");
               case 6 -> System.out.println("星期六");
               case 7 -> System.out.println("星期日");
               default -> System.out.println("输入错误");
           }
   ~~~

2. case后面可以写多个值

   ~~~java
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
   ~~~

3. switch可以有运行结果

4. yield关键字

   ~~~java
   // 不写yield关键字
   int result = switch (operator) {
               case "+" -> a + b;
               case "-" -> a - b;
               case "*" -> a * b;
               case "/" -> a / b;
               default -> 0;
           };
   
   // 写yield关键字
   int result = switch (operator) {
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
           };
   ~~~

   #### `switch`和`else if`各自的使用场景

   `else if`：用于对范围的判断

   `switch`：case的值有限时使用

### `for`循环

~~~java
for(初始化语句;条件判断语句;条件控制语句){
    循环体语句;
}
~~~

