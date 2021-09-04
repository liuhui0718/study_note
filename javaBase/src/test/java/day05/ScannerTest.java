package day05;

/*
//如何从键盘获取不同类型的变量：需要用Scanner类

具体实现步骤：
        1，导包：import java.util.Scanner;
        2，Scanner实例化：Scanner scanner = new Scanner(System.in);
        3，调用Scanner类的相关方法（next（）/nextXxx（）），来获取指定类型的变量
 */

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //next()只有检测到有字符输入时执行回车才有效，，否则回车在控制台只起到换行的作用，不实际录入数据
        //若录入字符后再输入空格再录入一段字符后回车，直接将该字符串解析为以空格字符做间隔的两次录入数据，并且不录入空格，直接在控制台打印两个字符串

        System.out.println("请输入你的姓名：");
        String name = scanner.next();
        System.out.println(name);
/*
        System.out.println("请输入你的芳龄：");
        int age = scanner.nextInt();
        System.out.println(age);

        System.out.println("请输入你的体重：");
        double weight = scanner.nextDouble();
        System.out.println(weight);

        System.out.println("请输入你的性别：（男/女）");
        String gender = scanner.next();
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);

        System.out.println("你是否看上我类尼：（true/false）");
        boolean isLove = scanner.nextBoolean();
        System.out.println(isLove);


        System.out.println("请输入：1");
        String abc = scanner.nextLine();//nextLine() 若输入回车直接在控制台打印空数据，并且它能检测并打印空格符。
        System.out.println(abc);

*/


    }
}
