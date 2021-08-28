package day03;
/*
基本数据类型之间的运算规则：
    1，自动类型提升：
        当容量小的数据类型的变量和容量大的数据类型的变量做运算时，结构自动提升为容量大的数据类型
        说明：此时的容量的大小表示的是数的范围的大小，比如float容量大于long的容量
        byte、char、short三个数据类型之间做运算时，结果最低也得用int型接收

        byte、char、short--> int -->long-->loat-->double


    2，强制类型转换
 */

public class AutoTypeChange {
    public static void main(String[] args) {
        //当容量小的数据类型的变量和容量大的数据类型的变量做运算时，结构自动提升为容量大的数据类型
        //说明：此时的容量的大小表示的是数的范围的大小，比如float容量大于long的容量

        byte a1 = 23;
        short a2 = 45;
        //没有自动提升为容量大的数据类型，编译不通过
        // byte a3 = a1+ a2;
        int a4 = a1 + a2;

        int a9 = a4 + a2;


        long a5 = 1234l;
        float a6 = 56788f;
        //float的数的范围比long类型的大，编译不通过
        //long a7 = a5 + a6;
        float a7 = a5 + a6;

        //*******************************
        //byte、char、short三个数据类型之间做运算时，结果都得用int型接收
        byte b1 = 23;
        short c1 = 21;
        char d1 = 'e';

        //这三个数据类型做运行，最低也得用int类型接收
        int e1 = b1 + c1;
        int e2 = b1 + d1;
        int e3 = +c1 + d1;
    }
}
