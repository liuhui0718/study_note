package day04;

/*
运算符之一：算术运算符 +  -   *   /     %       （前）++   （后）++     （前）--    （后）--
 */

public class ArithmeticTest {
    public static void main(String[] args) {

        //%：取余运算
        //结果的符号与被模数的符号相同\
        //开发中，经常使用%来判断能否被除尽的情况。
        int m1 = 12;
        int n1 = 5;
        System.out.println("m1 % n1 =" + m1 % n1);

        int m2 = -12;
        int n2 = 5;
        System.out.println("m2 % n2 =" + m2 % n2);

        int m3 = 12;
        int n3 = -5;
        System.out.println("m3 % n3 =" + m3 % n3);

        int m4 = -12;
        int n4 = -5;
        System.out.println("m4 % n4 =" + m4 % n4);

        //（前）++ :先自增1，然后再运算
        //（后）++ ：先运算，然后再自增1

        int a1 = 10;
        int b1 = ++ a1;
        System.out.println(a1+" "+b1);//11，11

        int a2 = 10;
        int b2 = a2++;
        System.out.println(a2+" "+b2);//11，10

        //注意点：
        short a3 = 123;//想让他实现+1
        //编译不通过
        //a3 = a3 + 1;原因：1为int类型，不满足自动转换
        //a3 = (short)(a3 + 1);//正确

        a3++;//自增1不会改变变量本身的数据结构
        System.out.println(a3);


        //问题：
        byte a4 = 127;
        a4++;
        System.out.println(a4);//结果变成-128


        byte a5 = -128;
        a5--;
        System.out.println(a5);//结果变成127


        //（前）-- :先自减1，然后再运算
        //（后）-- ：先运算，减

        int a6 = 10;
        int b6 = -- a6;
        System.out.println(a6+" "+b6);// 9，9

        int a7 = 10;
        int b7 = a7--;
        System.out.println(a7+" "+b7);//9，10


        int i2 = 20;
        int i = i2--;
        System.out.println(i2);//19
        System.out.println(i);//20

        i = --i2;
        System.out.println(i2);//18
        System.out.println(i);//18


    }
}
