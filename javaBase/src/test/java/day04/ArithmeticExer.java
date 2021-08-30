package day04;
/*
练习：
随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值；

 */




public class ArithmeticExer {
    public static void main(String[] args) {

        int number = 261;
        int a = number / 100;
        int b = number % 100 / 10;
        int c = number % 100 % 10;
        System.out.println(a+"  "+ b+"    "+c);



    }
}
