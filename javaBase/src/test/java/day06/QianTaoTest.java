package day06;
/*
嵌套循环的使用
    一：说明：
        1，内层循环结构遍历一遍，只相当于外层循环循环体执行例一次
        2，假设外层循环需要执行m次，内层循环需要执行n次，此时内层循环的循环体一共执行例m * n 次

     二：技巧
        1，外层循环控制行数，内层循环控制列数

 */

public class QianTaoTest {
    public static void main(String[] args) {
        /*
        输出
        *
        **
        ***
        ****
        *****
         */
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
                }
            System.out.println();

            }
        
        
        /*
        输出
        ****
        ***
        **
        *
         */
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4-i ; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }

        /*
        输出
          *
         *  *
       *  *  *
      *  *  *  *
     *  *  *  *  *
      *  *  *  *
       *  *  *
         *  *
           *
         */
        //上半部分
        for (int i = 0; i < 5 ; i++) {
            //输出空格

            for (int j = 0; j < 4-i ; j++) {
                System.out.print(" ");

            }
            //输出*
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        //下半部分
        for (int i = 0; i <4 ; i++) {
            //输出空格
            for (int j = 0; j <= i ; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < 4 - i ; k++) {
                System.out.print("* ");

            }
            System.out.println();

        }




    }
}
