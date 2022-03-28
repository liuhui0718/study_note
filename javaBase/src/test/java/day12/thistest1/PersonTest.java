package day12.thistest1;

/**
 * this关键字的使用
 * <p>
 * 1，this可以用来修饰、调用：属性、方法、构造器
 * <p>
 * 2，this修饰属性和方法：
 * 可以理解为当前对象  或者  当前正在创建的对象
 * <p>
 * <p>
 * <p>
 * 在类的方法中，我们可以使用"this.属性"或者"this.方法"的方式，调用当前的属性或方法，但是，在通常情况下，我们都选择
 * 省略"this"。特殊情况下，如果方法的形参与类的属性同名时，我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参
 * <p>
 * 在类的构造器中，我们可以使用"this.属性"或者"this.方法"的方式，调用当前的属性或方法，但是，在通常情况下，我们都选择
 * 省略"this"。特殊情况下，如果构造器的形参与类的属性同名时，我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参
 * <p>
 * 3，this调用构造器
 *      3.1我们在类的构造器中，可以显式的使用"this（形参列表）"方式，调用本类中指定的其他构造器
 *      3.2构造器中不能使用this（形参列表）来调用自己
 *      3.3如果一个类中有n个构造器，那么最多有n-1个构造器使用类this（形参列表）
 *      3.4规定："this（形参列表）"必须声明在当前构造器首行
 *      3.5构造器内部，最多只能声明一个"this（形参列表）"，用来调用其他的构造器
 *
 *
 */


public class PersonTest {
    public static void main(String[] args) {


        Person person = new Person();
        person.setName("tom");
        System.out.println(person.getName());


        person.eat();

        System.out.println();

        Person person1 = new Person("tony",9);
        System.out.println(person1.getAge());


    }
}


class Person {

    private String name;
    private int age;

    public  Person() {
        String info = "Person初始化时，需要考虑如下的1，2，3，4。。。（共40行代码）";
        System.out.println(info);

    }

    public Person(String name) {
        this();
        this.name = name;
        //Person初始化时，需要考虑如下的1，2，3，4。。。（共40行代码）

    }

    public Person(String name, int age) {
        this(name);
        this.name = name;
        this.age = age;
        //Person初始化时，需要考虑如下的1，2，3，4。。。（共40行代码）

    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("人吃饭");
        this.study();
    }

    public void study() {
        System.out.println("人睡觉");
    }

}
