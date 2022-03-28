package day12;

/**
 * 面向对象的特征之一：封装与隐藏
 * 一：问题的引入：
 *      当我们创建一个类的对象以后，我们可以通过对象.属性d的方式，对对象的属性进行赋值，这里，赋值操作要受到属性的数据类型和存储范围
 *      的制约，除此之外，没有其他制约条件。但是，在实际问题中，我们往往需要给属性赋值加入额外的限制条件，这个条件就不能在属性声明时体现，
 *      我们只能通过方法添加限制条件（比如setAge，同时，我们需要避免用户再使用"对象.属性"的方法对属性进行赋值，则需要将属性声明为私有的（private））
 *      --->此时，针对属性就体现了封装性
 *
 *
 * 二；封装性的体现
 *      我们将属性私有化的（private）的同时通过公共的（public）方法来设置和获取属性的值
 *
 *      拓展；封装性的体现：1，如上   2，不对外暴露的私有的方法   3，单例模式
 *
 * 三；封装性的体现，需要权限修饰符来配合
 *
 * 1，java规定的四种权限（从小到大排列）：private，缺省，protected，public
 * 2，四种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 * 3，具体的，四种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部类
 *          修饰类：只能使用缺省、public
 *
 */
public class Packaging {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "小白";
        //animal.age = 3;
        animal.leg = 4;
        animal.eat();
        animal.show();
        animal.setAge(4);
        animal.show();

    }


}


class Animal {

    String name;
    private int age;
    int leg;


    public void setAge(int i) {
        if (i > 0 && i < 10) {
            age = i;
        } else {
            age = -1;
        }


    }

    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void show() {
        System.out.println("name = " + name + "age = " + age + "leg = " + leg);
    }

}
