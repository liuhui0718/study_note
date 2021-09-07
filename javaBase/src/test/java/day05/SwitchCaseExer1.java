package day05;
/*
使用switch，把小写类型的char型转为大写。只转换a，b，c，d，e，其他的输出other(一次输入一个字符)
 */

import java.util.Scanner;

public class SwitchCaseExer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        char num = word.charAt(0);
        switch (num){
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");


    //2，对学生成绩大于60分的，输出"合格"，低于60分的，输出"不合格"（要求用switch-case结构写，尽可能简单）

                //说明：如果switch-case中的多个case的执行语句相同，则可以考虑进行合并，合并效果如下：
            int score  = 78;
            switch (score/10){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("不及格");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("及格");

        //更优的解法
        switch (score/60){
            case 0:
                System.out.println("不及格");
            case 1:
                System.out.println("及格");
        }

            }
        }
    }
}
