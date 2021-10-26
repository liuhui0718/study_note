package day09;
/*
一：设计类，其实就是设计类的成员

    属性=成员变量=field=域、字段
    方法=成员方法=函数=method


    创建类的对象 = 类的实例化 = 实例化类

二：类和对象的使用（面向对象思想落地的实现）；
    1，创建类，设计类的成员
    2，创建类的对象
    3，通过"对象.属性"或者"对象.方法"调用对象的相关结构

 */

public class PersonTest {
    public static void main(String[] args) {
        //创建类的对象
        Person person = new Person();

        //调用对象的结构：属性、方法
        //调用属性："对象.属性"
        person.name = "流川枫";
        person.isMale = true;
        System.out.println(person.name);

        //调用方法："对象.方法"
        person.eat();
        person.sleep();
        person.talk("汉语");

    }

}
class Person{
    //属性
    String name;
    int age = 1;
    boolean isMale;


    //方法
    public void sleep(){
        System.out.println("人可以睡觉");
    }

    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void talk(String language){
        System.out.println("人可以说话，使用的是：" + language);
    }




        }
