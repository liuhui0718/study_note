package day03;
/*
整数类型：byte、short、int、long

    类型      占用存储空间      表数范围
    byte:    一字节=8bit位     -128～127
    short   2字节             -2^15 ～ 2^15-1
    int     4字节             -2^31 ～ 2^31-1（约21亿）
    long    8字节             -2^63 ～ 2^63-1


    浮点类型：float、double
    类型          占用存储空间      表数范围
    单精度float    4字节            -3.403E38~3.403E38
    双精度double   8字节            -1.798E308~1.798E308


字符类型：char（1字符=2字节）

布尔型：boolean
 */

public class BaseDataType {
    public static void main(String[] args) {
        byte a = 0;
        byte b = -128;
        //编译不通过，byte值的范围为-128～127
        //byte c = 128;
        short d = 666;
        int e = 777;
        //声明long型变量，必须以"l"或"L"结尾
        long f = 12344L;
        //通常定义整数变量时使用int类型




        //浮点型，表示带小数点的数值
        //float表示数值的范围比long还大
        double dou = 1.323;
        //定义float类型变量时，变量要以"f"或"F"结尾，否则编译不通过
        //通常定义浮点型变量时，使用double型
        float flo = 4.234f;


        //定义char型变量，通常使用一对''，
        char ch1 = 'a';
        //定义char型变量，内部只能写一个字符，否则编译不通过
        //char ch2 = 'ab'
        char ch3 = '-';
        System.out.println(ch3);

        //@char型变量表示方式；1，声明一个字符     2，转义字符      3，直接使用Unicode值来表示字符型常量
        char ch4 = '\n';//换行符
        System.out.print("hello" + ch4);
        System.out.println("World");

        char ch5 = '\t';//制表符
        System.out.print("hello" + ch5);
        System.out.println("World");


        //直接使用Unicode值来表示字符型常量
        char ch6 = '\u3456';
        System.out.println(ch6);



        //布尔型
        //只能取两个值之一：true false
        //常常在条件判断，循环结构中使用
        boolean success = true;
        if (success){
            System.out.println("成功晋级");
        }else{
            System.out.println("很遗憾");
        }

    }
}
