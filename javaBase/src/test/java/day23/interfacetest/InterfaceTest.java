package day23.interfacetest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/17 下午3:32
 * @Version 1.0
 *
 * 接口的使用
 * 1，接口使用interface来定义
 * 2，在Java中，接口和类是两个并列结构
 * 3，如何定义接口；定义接口中的成员
 *
 *      3.1 JDK7及以前：只能定义全局变量和抽象方法
 *          >全局变量：public static final   但是书写时可以省略
 *          >抽象方法：public abstract
 *
 *
 *     3.2JDK8：除了可以定义全局常量和抽象方法之外，还可以定义静态方法，默认方法（略）
 *
 * 4，接口中不能定义构造器，意味着接口不可以实例化
 *
 *
 * 5，java开发中，接口通过让类去实现（implements）的方式来使用
 *      如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 *      如果实现类没有覆盖接口中的所有抽闲方法，则此实现类仍为一个抽象类
 *
 *
 * 6,java类可以实现多个接口，-->弥补了java单继承的局限性
 *  格式：class  AA  extends BB implements CC,DD,FF...{}
 *
 *
 * 7,接口与接口之间可以继承，而且可以多继承
 *
 *
 */
public class InterfaceTest {
    public static void main(String[] args) {

        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        Plane plane = new Plane();
        plane.fly();

    }



}

interface  Atteckable{
    void atteck();
}

interface Flyable{


    //全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;//省略了public static final

    //抽象方法

    public abstract void fly();
    void stop();//省略了public abstract

    //接口不可以定义构造器
//    public Flyable(){
//
//    }

}

class  Plane implements Flyable{

    public void fly() {
        System.out.println("飞机起飞");

    }

    public void stop() {
        System.out.println("飞机降落");

    }
}

abstract class Kite implements Flyable{

    public void fly(){

    }
}


class Buller implements Flyable, Atteckable,CC{

    public void atteck() {

    }

    public void fly() {

    }

    public void stop() {

    }

    public void method1() {

    }

    public void method() {

    }
}

//举例：7
interface  AA{
    void method1();
}
interface  BB{
    void method();
}
interface   CC extends AA,BB{

}

