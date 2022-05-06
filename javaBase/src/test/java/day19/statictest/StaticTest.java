package day19.statictest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/1 下午4:46
 * @Version 1.0
 *
 * static关键字的使用
 *
 * 1，static  静态的
 *
 * 2，static可以用来修饰：属性、方法、代码块、内部类
 *
 * 3，使用static修饰属性：静态变量，或者也叫类变量
 *      3.1，按照是否使用stati修饰，又分为静态属性（静态变量）vs 非静态属性（实例变量）
 *          实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。当修改其中一个对象的非静态属性时，
 *                  不会导致其他对象中相同属性的属性值被修改。
 *          静态变量：我们创建了类的多个对象，每个对象共享一个静态变量，当通过某一个对象修改静态属性时，会导致其他对象在调用此
 *                  静态属性时，属性值被修改
 *
 *
 *       3.2static修饰属性的其他说明
 *          1，静态变量随着类的加载而加载，可以通过"类.静态变量"的方式进行调用
 *          2，静态变量的加载早于对象的创建
 *          3，由于类只会加载一次，则静态变量在内存中也只会存在一份儿，存在方法区的静态域中
 *
 *      3.3静态属性举例：System.out; Math.PI
 *
 *
 *4，使用static修饰方法：静态方法
 *      4.1随着类的加载而加载，可以通过"类.静态方法"的方式进行调用
 *      4.2                 静态方法            非静态方法
 *              类           yes                 no
 *              对象          yes                yes
 *
 *     4.3静态方法中，只能调用静态的方法或属性
 *          非静态方法中，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 *
 *5，static注意点：
 *      5.1在静态的方法内，不能使用this关键字、super关键字
 *      5.2关于静态属性和静态方法的使用，大家都从生命周期的角度去理解
 *
 *  5，开发中，如何确定一个属性是否要声明为static的
 *            >属性可以被多个对象共享，不会随着对象的不同而不同的
 *            >类中的常量也常常声明为static
 *
 *
 *
 *     开发中，如何确定一个方法是否要声明为static的
 *             >操作静态属性的方法，通常设为static
 *             >工具类中的方法，习惯声明为static的，比如Math、Arrays、Collections
 *
 *
 *
 *
 */
public class StaticTest {

    public static void main(String[] args) {

        Chinese c1 = new Chinese();
        c1.name = "林丹";
        c1.age = 30;
        c1.nation = "中国";


        Chinese c2 = new Chinese();
        c2.name = "李宗伟";
        c2.age = 29;
        c2.nation = "马来西亚";
        System.out.println(c2.name);
        System.out.println(c2.nation);
        System.out.println(c1.name);
        System.out.println(c1.nation);

        Chinese.sleep();


    }

}

class Chinese{
     String name;
     int age;
     static  String nation;


     public  void eat(){
         System.out.println("吃饭");

     }

     public static  void sleep(){
         System.out.println("睡觉");
         System.out.println(nation);//省略了Chinese.
         //不能调用非静态的结构
//         show()

         //可以调用静态的结构
         walk();


     }
     public void show(){
         System.out.println("中国人");
         sleep();
         System.out.println(nation);//省略了 this.
     }

     public void info(){
         System.out.println("name" + name +"  " + "age" + age);
     }

     public static void walk(){

     }
}
