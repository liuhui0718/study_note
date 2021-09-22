package day07;
/*
求100以内的质数:实现方式二
质数：除了1和本身之外，没有其他的约数,质数是从2开始的
 */

public class PrimeNumber2 {

    public static void main(String[] args) {

        int count = 0;
        //获取当前时间距离1970-01-02 00：00：00的毫秒数
        long start = System.currentTimeMillis();
        lable:for (int i = 2; i < 10000; i++) {//遍历10000以内的自然数
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue lable;//优化一：只对本身非质数的自然数是有效的。
                }

            }
            //能执行到此步骤的，都是质数
            count++;

        }
        long end = System.currentTimeMillis();
        System.out.println("程序运行的时间是：" + (end - start));
    }

}
