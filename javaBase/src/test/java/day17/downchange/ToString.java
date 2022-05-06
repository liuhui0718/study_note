package day17.downchange;

import java.util.Date;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 下午7:26
 * @Version 1.0
 *
 *
 * 1，当我们s输出一个对象的引用时，实际上就是调用当前d对象的toString()
 *
 *
 * 2，Object类中toString()的定义
 * public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *
 * 3，String 、Data、File、包装类等都重写了Object中的toString()方法，使得在调用toString()时，返回的是实体内容信息
 *
 *4，自定义类也可以重写toString()方法，当调用此方法时，返回对象的实体内容。
 *
 *
 *
 *
 *
 */
public class ToString {
    public static void main(String[] args) {
        Person1 person1 = new Person1("tom",18);
        System.out.println(person1); //downchange.Person1@610455d6
        System.out.println(person1.toString());//downchange.Person1@610455d6


        String s1 = new String("mm");
        System.out.println(s1.toString());
        System.out.println(s1);
        String s2 = new String("mm");
        System.out.println(s2.toString());
        System.out.println(s2);


      Date data = new Date(23536763l);
        System.out.println(data);//Thu Jan 01 14:32:16 CST 1970

    }





}

class Person1 {
    String name;
    int age;


    public Person1() {

    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人：吃饭");
    }

    public void sleep() {
        System.out.println("人散步");
    }

    public void speak() {
        System.out.println("说中国话");
    }

    //重写toString

    @Override
    public String toString() {
        return "Person1{" + "name='" + name + '\'' + ", age=" + age + '}';
    }


}