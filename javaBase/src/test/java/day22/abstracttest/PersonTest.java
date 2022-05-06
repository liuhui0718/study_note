package day22.abstracttest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/15 下午5:43
 * @Version 1.0
 * <p>
 * 抽象类的匿名子类
 */
public class PersonTest {


    public static void main(String[] args) {

        method1(new Student());//匿名对象

        Worker worker = new Worker();
        method1(worker);//非匿名类，非匿名对象
        method1(new Student());//非匿名类，匿名对象


        //创建了一个匿名对象的子类： p
        Person p = new Person() {
            public void eat() {
                System.out.println("好好吃饭");

            }

            public void breath() {
                System.out.println("好好呼吸");

            }
        };


        method2(p);


    }


    public static void method1(Person person) {

    }

    public static void method2(Person person) {
        person.eat();
        person.breath();
    }
}

class Worker extends Person {
    @Override
    public void eat() {

    }

    public void breath() {

    }
}


