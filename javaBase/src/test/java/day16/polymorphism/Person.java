package day16.polymorphism;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午9:16
 * @Version 1.0
 */
public class Person {
    String name;
    int age;


    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人：吃饭");
    }
    public void sleep(){
        System.out.println("人散步");
    }

    public void speak(){
        System.out.println("说中国话");
    }
}
