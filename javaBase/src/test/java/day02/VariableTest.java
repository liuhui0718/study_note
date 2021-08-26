package day02;
/*
变量的使用
1，变量是程序中最基本的存储单元。包含变量类型、变量名和存储的值:   数据类型 变量名 = 变量值
2，说明：
    变量必须先声明，才能去用
    变量都定义在作用域内，在作用域内，它是有效的，出了作用域就失效了
    同一个作用域，不能定义重名的变量


 */



public class VariableTest {
    public static void main(String[] args){

        //变量的定义
        int age = 18;
        //变量的使用
        System.out.println(age);

        //编译错误，使用myNumber前未定义1过myNumber
        //System.out.println(myNumber);

        //变量的声明
        int myNumber;
        //编译错误，使用myNumber前并未赋值过myNumber
       // System.out.println(myNumber);

        //编译错误，不可以在同一个作用域内定义同名的变量
        //int age = 20

    }
}
