package day04;
/*
运算符之六：三元运算符：
   1， 结构：（条件表达式）？表达式1：表达式2
   2， 说明：
            1，条件表达式的结果为boolean类型
            2根据条件表达式的真或者假，决定执行表达式1还是表达式2
                如果表达式为true，则执行表达式1
                如果表达式为false，则执行表达式2
                表达式1和表达式2要求是一致的：能用同一个类型去接收表达式1和表达式2
                三元运算符可以嵌套使用

   3,凡是可以使用三元运算符的地方，都可以改写为if - else
   反之，不成立，比如 （M > N）？ 2 ： "不行"   ：这种形式就不能写成写成三元运算符，编译不通过

   4,如果程序既可以使用三元运算符，又可以使用if-else结构，那么优先使用三元运算符。原因：简洁，执行效率高
 */

public class SanYuanTest {
    public static void main(String[] args) {

        //获取两个整数的最大值
        int a = 20;
        int b = 10;
        int max = (a > b) ? a : b;

        System.out.println(max);


        int m = 12;
        int n = 12;
        String num = (m > n) ? "m大":((m == n) ? "m等于n": "n大");
        System.out.println(num);


        //获取三个数的最大数

        int a1 = 12;
        int a2 = 14;
        int a3 = -2;

        int max1 = (a1 > a2) ? a1 : a2;
        int max2 = (max1 > a3) ? max1 : a3;
        System.out.println("三个数中最大的是：" + max2);

        //改写成if - else
        if (a1 > a2){
            System.out.println(a1);
        }else{
            System.out.println(a2);
        }

    }
}
