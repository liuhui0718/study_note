package day21.blockandfinal;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/2 上午11:25
 * @Version 1.0
 *
 * 类的成员之四：代码块（或初始化块）
 *
 *  1，代码块的作用：用来初始化类，对象
 *  2，代码块如果有修饰的话，只能使用static进行修饰
 *  3，分类：静态代码块 VS 非静态代码块
 *
 *  4，静态代码块
 *      >内部可以有输出语句
 *      >随着类的加载而执行，而且只执行一次
 *      >如果一个类中定义类多个静态代码块，则按照声明的先后顺序执行
 *      >静态代码块的执行要优先于非静态代码块的执行
 *      》静态代码块只能调用静态结构（静态属性、静态方法）
 *
 *
 *  5，非静态代码块
 *      >内部可以有输出语句
 *      >随着对象的创建而执行
 *      >每创建一个对象，就执行一次非静态代码块
 *      >作用，可以在创建对象时，对对象的属性等进行初始化
 *      >如果一个类中定义类多个非静态代码块，则按照声明的先后顺序执行
 *      》非静态代码块既可以调用静态结构，也可以调用非静态结构
 *
 *
 *
 *  对属性赋值的位置
 *      1，默认初始化
 *      2，显示初始化
 *      3，构造器中初始化
 *      4，有了对象之后，可以通过对象.方法、对象.属性的方式进行赋值
 *      5，在代码块中赋值
 *
 *
 *
 */
public class BlockTest {

    public static void main(String[] args) {
        Person.getDesc();//静态代码块随着类的加载被调用，而静态方法随着类的加载而加载，但是没有进行调用
        String st = Person.nation;
        Person person1 = new Person();
        Person person2 = new Person();






    }
}

class Person{

    //属性
    private String name;
    private int age;
    private static String desc = "我是一个中国人";
    static String nation ="中国";


    public static String getDesc() {
        return desc;
    }

    //构造器
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    //静态代码块
    static {
        System.out.println("hello static block");
    }

    //非static的代码块
    {
        System.out.println("hello,block");
        info();
    }






    //方法
    public void eat(){
        System.out.println("人要吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void info(){
        System.out.println("info");
    }
}
