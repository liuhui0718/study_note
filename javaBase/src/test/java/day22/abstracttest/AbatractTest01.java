package day22.abstracttest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/15 上午11:13
 * @Version 1.0
 *
 * abstract关键字的使用
 *      1，abstract：抽象的
 *      2，abstract可以用来修饰的结构：类，方法
 *
 *
 *      3,abstract 修饰类：抽象类
 *
 *      --》此类不能实例化
 *      --》抽象类中一定有构造器，便于子类实例化时调用(涉及：子类对象实例化的全过程)
 *      --》开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 *
 *
 *
 *      4，abstract修饰方法：抽象方法
 *      --》抽象方法只有方法的声明，没有方法体
 *      --》包含抽象方法的类，一定是一个抽象类；反之，抽象类中可以没有抽象方法
 *      --》若子类重写了父类中所有的抽象方法，则子类可以被实例化
 *          若子类没有重写父类中所有的抽象方法，则子类也是一个抽象类，需要用abstract修饰
 *
 */
public class AbatractTest01 {

    public static void main(String[] args) {

        //一旦Person类抽象了，就不能再实例化
//        Person person = new Person("tom",9);
//        person.eat();


    }
}


abstract class Creature{
    public abstract void breath();
}

abstract class Person extends Creature{
    String name;
    int age;

    public  Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
//    public void eat(){
//        System.out.println("人吃饭");
//    }

    public abstract void eat();


    public void walk(){
        System.out.println("人走路");
    }
}


class Student extends Person{
    public Student(){

    }

    public Student(String name,int age){
        super(name,age);
    }

    public void eat() {

    }

    public void breath() {
        System.out.println("学生应该呼吸新鲜空气");

    }
}
