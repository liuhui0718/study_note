package day06;
/*
For循环结构的使用
一：循环结构的4个要素
    1，初始化条件
    2，循环条件----->是boolean类型
    3，循环体
    4，迭代条件
格式：for（初始化条件；循环条件；迭代条件）{
        循环体
        }
 */

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {

        //练习：编写程序从1循环到150，并在每行打印一个值
        //      另外，在每个3的倍数行上答应出"for"，在每个5的倍数行上打印"biz"，在每个7的倍数行上打印"baz"

        for (int i = 1; i <=150; i++) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print("    foo");
            }
            if (i % 5 == 0) {
                System.out.print("    biz");
            }
            if (i % 7 == 0) {
                System.out.print("    baz");
            }

            System.out.println();

        }


        //练习二：输入两个正整数m和n，求其最大公约数与最小公倍数。
        //      比如：12和20的最大公约数是4，最小公倍数是60
        //      说明：break的用法     跳出循环
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个正整数：");
            int m = scanner.nextInt();
            System.out.println("请输入第二个正整数：");
            int n = scanner.nextInt();

            //获取最大公约数：能被两个数整除的最大数
            int min = (m < n ? m : n);
            for (int j = min; j >= 1; j--) {
                if (m % j == 0 && n % j == 0){
                    System.out.println("最大公约数是" + j);
                    break;
                }

            }
            //获取最大公倍数：最大公倍数能整除这两个数
            int max = (m > n ? m : n);
            for (int j = max; j < m * n; j++) {
                if (j % m == 0 && j % n == 0){
                    System.out.println("最小公倍数是：" + j);
                    break;
                }

            }



            //水仙花数（100-999）
        for (int u = 100; u < 1000; u++) {
            int bai = u / 100;
            int shi = u % 100 /10;
            int ge = u % 10;
            if( bai*bai*bai + shi*shi*shi + ge*ge*ge == u) {
                System.out.println("水仙花数是：" + u);

            }

        }


    }
}
