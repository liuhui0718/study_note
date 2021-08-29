package day03;

/*
String类型变量的使用
    1，String属于引用数据类型
    2，声明String类型变量时，使用一对""
    3，String类型可以和8种基本数据类型变量做运算，且运算只能时连接运算：+、
    4，运算的结果仍然为String
 */



public class StringTest {
    public static void main(String[] args) {
        int number = 111;
        String numberStr = "人数:";
        String s = numberStr + number;
        System.out.println(s);

        //编译不通过，char类型变量声明里面要有值
        //char c ='';
        char d;
        d = 'd';


        boolean boo = true;
        String info = s + boo;
        System.out.println(info);

        //*********************************

        char c = 'a';//a:97      A:65
        int num = 10;
        String str = "hello";

        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c +(num + str));//a10hello
        System.out.println((c + num )+ str);//107hello
        System.out.println(str + num + c);//hello10a




    }
}


