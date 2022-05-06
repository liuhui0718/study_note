package day12.constructor;

/**
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 * <p>
 * 一：构造器的作用
 *
 * 创建对象
 * 初始化对象的信息
 *
 * 二：说明：
 * 1，如果没有显式的定义类的构造器，则系统默认提供一个空参的构造器
 * 2，定义构造器的格式：权限修饰符 + 类名 （形参列表）{}
 * 3，一个类中定义了多个构造器，彼此构成重载
 * 4，一旦我们显式的定义了类的构造器之后，系统就不再提供默认的空参构造器
 */
public class PersonTest {
    public static void main(String[] args) {


        //创建类的对象：new + 构造器
        Person person = new Person();
        person.eat();
    }
}




class Person {

    String name;
    int age;

    public Person(){
        System.out.println("构造器执行");
    }
    public void eat() {
        System.out.println("===chifan");
    }
    public void study(){
        System.out.println("学习");
    }

}

