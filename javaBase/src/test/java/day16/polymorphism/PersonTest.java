package day16.polymorphism;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午9:17
 * @Version 1.0
 * <p>
 * 面向对象特征之三：多态性
 * <p>
 * 1，理解多态性：可以理解为一种1事物的多种形态
 * 2，何为多态性：父类的引用指向子类的对象（或子类的对象赋给父类的引用）
 * <p>
 * 3，多态的使用：虚拟方法调用
 *          3.1，有了对象的多态性之后，我们在编译期只能调用父类声明的方法，但在运行期，我们实际执行的是子类重写父类的方法。
 *          总结：编译看左边，运行看右边
 *
 * 4，多态性的使用前提；
 *          4。1，类的继承关系
 *          4。2，方法的重写
 *
 *
 * 5，对象的多态性，只适用于方法，不适用于属性（编译和运行都看左边）
 */
public class PersonTest {
    public static void main(String[] args) {
        Man man = new Man();
        man.age = 18;
        man.speak();


        Woman woman = new Woman();
        woman.eat();
        woman.age = 17;

        System.out.println("======");
        Person p = new Man();

        //多态的使用，当调用子父类相同的方法时，实际上执行的是子类重写父类的方法-----虚拟方法调用
        p.eat();
        p.speak();

        //不能调用Man类中独有的方法和属性
//        p.isSmoking();
    }
}
