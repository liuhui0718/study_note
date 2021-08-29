package day03;
/*
强制类型转换:自动提升类型的逆运算
    说明：
        1，需要使用强转符：（）如：double转变成int型    int 变量名称 = （int）double变量
        2，注意点：强制类型转换，可能导致精度丢失


 */

public class ForceTypeChange {
    public static void main(String[] args) {
        double a1 = 11.23;
        //精度损失举例1
        int a2 = 34;
        int a3 = (int) (a2 + a1);

        //没有精度损失
        int a5 = 345;
        short a6 = (short) a5;

        //精度损失举例2
        int a7 = 128;
        byte a8 = (byte) a7;



        //编码情况1
        //12345默认为int型，且数值范围没有超过int类型的范围，int转long属于自动类型提升
        long l1 = 12345;
        //5678899991772663653默认为int型，但是数值范围超过了int类型的范围，结尾应该加上"l"或"L"
        //long l2 = 5678899991772663653;
        long l3 =5678899991772663653l;



        //编码情况2
        //整型常量，默认类型是int型
        byte b1 = 34;
        //编译失败，数字6默认是int型，应强制转换为byte型
        //byte b2 = b1 + 6;
        byte b3 = (byte) (b1 + 6);

        //浮点型常量，默认类型是double型

        //编译不通过，234。4默认为double型，应该强制转换为float
        //float f1 = 234.4;
        float f2 = (float)234.4;
        float f3 = 234.4f;


    }
}
