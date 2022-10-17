package day24.innerclasstest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/5/3 下午5:59
 * @Version 1.0
 *
 * 类的内部成员之五：内部类
 *
 * 1，java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B就是外部类
 *
 * 2，内部类的分类   成员内部类（静态、非静态）  vs   局部内部类（方法内，代码块内，构造器类）
 *
 * 3，成员内部类
 *      一方面，作为外部类的成员
 *      >调用外部类的结构
 *      >可以被static修饰
 *      可以被4种不同的权限修饰
 *      >
 *
 *      另一方面，作为一个类
 *       >类内可以生命属性、方法、构造器
 *       >可以被final修饰，表示此类不能被继承；言外之意，不使用final，就可以被继承
 *       >可以被abstract修饰，表明该类不能被实例化
 *
 *  4，关注如下的3个问题
 *
 *     4.1如何实例化成员内部类对象
 *     4.2如何在成员内部类中区分调用外部类的结构
 *     4.3开发中局部内部类的使用
 */

public class InnerClassTest {

    public static void main(String[] args) {

        //创建Dog实例（静态成员内部类）
        Person.Dog dog = new Person.Dog();
        dog.show();

        //创建Bird实例（非静态成员内部类）
        //Person.Bird bird = new Person.Bird();  错误的写法

        Person person = new Person();
        Person.Bird bird = person.new Bird();
        bird.sing();


    }


}

class  Person{

    String name;
    int age;
    public void eat(){
        System.out.println("吃饭");
    }


//    静态成员内部类
    static class Dog{

        String name;
        int age;

        public void show(){
            System.out.println("卡拉是条狗");

            //eat() 静态不能调用非静态
        }

    }
    // 非静态成员内部类
    class Bird{

        String name;


        public void sing(){
            System.out.println("我是一只小小鸟");

            Person.this.eat(); //Person.this可以省略
        }

    }



    public void method(){
        //局部内部类
        class AA{

        }
    }

    {
        //局部内部类
        class  AA{

        }
    }


    public Person(){
        //局部内部类
        class CC{

        }
    }
}
