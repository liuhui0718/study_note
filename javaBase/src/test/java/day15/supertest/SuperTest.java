package day15.supertest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午4:36
 * @Version 1.0
 *
 * super关键字的使用
 *  1，super可以理解为：父类的
 *  2，super可以用来调用属性、方法、构造器
 *  3，super的使用：调用属性和方法
 *      3.1我们可以在子类的方法或构造器中，通过使用super.属性或者super.方法，显式的调用父类中声明的属性或方法。但是
 *              通常情况下，我们一般省略super.
 *      3.2特殊情况下：当子类的父类定义了同名的属性时，我们想要在子类中调用父类的属性，则必须显式的使用"super."，
 *              来表明调用的是父类中的属性
 *      3.3特殊情况：当子类重写来父类中的方法，我们想在子类的方法中调用父类被重写的方法，这时就显式的使用"super."，
 *                来表明调用的是父类中的方法
 *  4，super调用构造器：
 *      4.1我们可以在子类的构造器中显式的使用"super(形参列表)"的方式，调用父类中声明的指定的构造器
 *      4.2"super(形参列表)"的使用，必须声明在子类构造器首行。
 *      4.3，我们在类的构造器中，针对于this（形参列表)和super（形参列表），只能二选一，不能同时出现
 *      4。4在构造器的首行，没有显式的声明this（形参列表)和super（形参列表），则默认调用的是父类中空参的构造器
 *
 *
 *
 *
 */
public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.show();


    }
}
