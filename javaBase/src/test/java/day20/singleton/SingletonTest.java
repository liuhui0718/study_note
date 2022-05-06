package day20.singleton;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/1 下午8:58
 * @Version 1.0
 *
 * 1，单例设计模式：
 * 所谓单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例
 *
 * 2，怎么实现：
 *
 * 饿汉式 VS 懒汉式
 *
 *
 *3，区分饿汉式与懒汉式
 * 饿汉式：
 *      坏处：对象加载时间过长
 *      好处：饿汉式线程是安全的
 *
 *
 * 懒汉式：
 *      好处：延迟对象的创建
 *      坏处：线程不安全。---->>到多线程内容时再修改
 *
 *
 *
 *
 */
public class SingletonTest {

    public static void main(String[] args) {


        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1);
        System.out.println(bank2);

        System.out.println(bank1 == bank2);


        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1);
        System.out.println(order2);

        System.out.println(order1 == order2);

    }
}


//饿汉式
class Bank{

    String name;
    int age;

    //1，私有化类的构造器
    private Bank(){

    }

    //2,内部创建类的对象
    //4,要求此对象也必须声明为静态的
    private static Bank instance = new Bank();



    //3,提供公共的静态方法，返回类的对象
    public static  Bank getInstance(){
        return  instance;
    }


}


//懒汉式

class Order{



    //1,私有化构造器
    private Order(){

    }

    //2，声明当前对象，没有初始化
    //4，此对象也必须声明为static的
    private static Order instance = null;


    //3，声明一个public、static的返回当前对象的方法
    public static  Order getInstance(){
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }



}
