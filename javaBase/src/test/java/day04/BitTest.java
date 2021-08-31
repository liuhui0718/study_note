package day04;
/*
运算符之五：位运算符（了解）
    << 左移   >>  右移      >>>无符号右移    & 与运算   ｜ 或运算   ^   异或运算     ～  取反运算

    结论：
        1，位运算符操作的都是整型的数据
        2，<<：在一定范围内，每向左移一位，相当于*2
           >>:在一定范围内，每向右移一位，相当于/2

           面试题：最高效的方式计算 2 * 8？
            2 << 3 或 8 << 1


           >>>  无符号右移 ：最高位无论是0还是1，空缺位都用0补全



           注意：判断&   ｜  ^是位运算符还是逻辑运算符看前后的语句，如果是判断语句则为逻辑运算符，如果是int类型则为位运算符
 */

public class BitTest {
    public static void main(String[] args) {
        int i = 21;
        System.out.println("i << 2:" + (i << 2) );//21 * 2^2
        System.out.println("i << 3:" + (i << 3) );//21 * 2^3
        System.out.println("i << 27:" + (i << 27) );//21 * 2^27


        int m = 12;
        int n = 5;
        System.out.println("m & n :" +(m & n));//4:将该数以二进制的方式表示出来，0代码false，1代表true，将&符号理解为逻辑运算符
        System.out.println("m | n :" +(m | n));//13
        System.out.println("m ^ n :" +(m ^ n));//9


    }
}
