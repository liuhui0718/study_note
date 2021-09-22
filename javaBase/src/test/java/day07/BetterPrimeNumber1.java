package day07;

/*
质数输出问题的优化
 */
public class BetterPrimeNumber1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 2; i < 10000; i++) {
            boolean isFlag = true;//标识i是否被j除尽，一旦除尽，修改其值
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isFlag =false;
                    break;//优化一：只对本身非质数的自然数是有效的。
                }

            }if (isFlag == true){
                System.out.println(i);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行的时间是：" + (end - start));

    }
}
