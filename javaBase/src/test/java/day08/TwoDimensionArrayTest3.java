package day08;
/*
2，求数值型数组中元素的最大值、最小值、平均数、总和等


例子：
定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
然后求出所有元素的最大值，最小值，和，平均值，并1输出出来
要求：所有随机数都是两位数

 */

public class TwoDimensionArrayTest3 {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * 90 + 10);
            System.out.println(num[i]);
        }
        int max = num[0];
        int min = num[0];
        int sum = 0;
        double avg = 0;
        for (int j = 0; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];
            }
        }
        for (int j = 0; j < num.length; j++) {
            if (min > num[j]) {
                min = num[j];
            }
        }
        for (int j = 0; j < num.length; j++) {
            sum += num[j];
            avg = sum / num.length;
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
        System.out.println("和值是：" + sum);
        System.out.println("平均值是：" + avg);
    }
}
