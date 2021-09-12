package day06;

import java.util.Scanner;

public class XunHuanTest {

    /*
    例题1；从键盘输入个数不确定的整数，并判断读入的正数和负数的个数，当输入为0时结束程序

    说明：
    1，不在循环条件部分限制循环次数的结构：for（；；）或者while（true）
    2，结束循环有几种方式？
        目前学到的点有：方式一：循环条件部分返回false
                      方式二：在循环体中，执行break

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countZheng = 0;
        int countFu = 0;

        //while（true）相当于for（；；）
        while (true){
            int num = scanner.nextInt();//此操作需要在循环中不停的被执行
            if (num > 0){
                countZheng++;
            }else if (num < 0){
                countFu++;
            }else{
                break;
            }

        }
        System.out.println(countZheng);
        System.out.println(countFu);

    }
}
