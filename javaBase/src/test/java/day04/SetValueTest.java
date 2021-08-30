package day04;

/*
运算符之二：赋值运算符   =     +=      -=      *=      /=      %=
 */

public class SetValueTest {
    public static void main(String[] args) {
        //赋值符号：=
        //三种赋值方法：
        //一：
        int a1 = 10;
        int b1 = 20;

        //二：
        int a2,b2;
        a2 = b2 = 20;

        //三：
        int a3 = 20,b3 =40;


        //****************************

        //+=的用法
        int num1 = 12;
        num1 += 1;//相当于num1 = num1 + 2
        System.out.println(num1);

        //%=的用法
        short num2 = 13;
        num2 %= 3;//相当于num2 = num2  % 3
        System.out.println(num2);


        short num3 = 23;
        //编译不通过，改变来自身的数据类型
       // num3 = num3 +1
        num3 += 1;
        System.out.println(num3);//不会改变变量本身的数据类型

        //开发中，如果希望变量实现+2的操作，有几种方法？（前提：int num = 8;）
        //方式一：num = num + 2;
        //方式二：num += 2;(推荐)

        //开发中，如果希望变量实现+1的操作，有几种方法？（前提：int num = 8;）
        //方式一：num = num + 1;
        //方式二：num += 1;
        //方式三；num ++;（推荐）




    }
}
