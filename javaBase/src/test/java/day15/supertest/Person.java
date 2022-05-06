package day15.supertest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午4:36
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    int id =123456;

    public Person(){
        System.out.println("不管你怎么样，我一直在");

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人：多喝水");
    }
    public void sleep(){
        System.out.println("每天睡8小时");
    }
}
