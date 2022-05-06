package day15.supertest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午4:36
 * @Version 1.0
 */
public class Student extends  Person {

    String major;
    int id=1;

    public Student(){

    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public Student(String major) {
        this.major = major;
    }

    public void eat(){
        System.out.println("学生：多吃饭");
    }

    public void study(){
        System.out.println("上 " + major);
    }

    public void show(){
        System.out.println("name:" +this.name +"   " +"age: " +super.age );
        System.out.println(id);
        System.out.println(super.id);
        eat();
        super.eat();
    }
}
