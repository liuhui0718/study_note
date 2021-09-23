package day07;

/*
一个数如果恰好等于他的因子之和，这个数就称为"完数"。（6 = 1+2+3）
编程 找出1000以内的所有完数。（因子：除去这个数本身的其他约数）
 */


public class Test {
    public static void main(String[] args) {

        for (int i = 1; i < 1000; i++) {
            int count = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    count += j;

                }

            }
            if (count == i) {
                System.out.println(i);
            }

        }

        /*
        ******
        *****
        ****
        ***
        **
        *
         */

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6-i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
