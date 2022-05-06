package day17.downchange;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午9:17
 * @Version 1.0
 * <p>
 * 面向对象特征之三：多态性
 * <p>
 * 1，理解多态性：可以理解为一种事物的多种形态
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
        Person person = new Man();

        //多态的使用，当调用子父类相同的方法时，实际上执行的是子类重写父类的方法-----虚拟方法调用
        person.eat();
        person.speak();

        //不能调用Man类中独有的方法和属性
//        person.isSmoking();
        person.name = "sony";

        //有了对象的多态性之后，内存中实际上是加载了子类特有的属性和方法的，但是由于变量声明为父类类型，导致编译时
        //只能调用父类声明的方法和属性，子类特有的方法和属性不可调用

        //如何才能调用子类特有的属性和方法
        //向下转型，使用强制类型转换符

        Man man1 = (Man) person;
        man1.earnMoney();
        man1.isSmoking();
        man1.major = "语文";



        //使用强转时，可能会出现ClassCastException的异常
//        Woman woman1 = (Woman) person;
//        woman1.goShopping();


        /**
         * instanceof关键字的使用
         *
         * a instanceof A:判断对象a是否是类A的实例。如果是，则返回true，如果不是，则返回false。
         *
         * 使用情景，为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，一旦返回为true，
         * 则向下进行转型，如果返回为false，不进行向下转型。
         *
         *
         */

        if (man instanceof  Person){
            System.out.println("t5347y57832y58y238y5342y5724y237y43");
        }

        if (person instanceof Man){
            Man man2 = (Man) person;
            man2.isSmoking();
            System.out.println("=========man");
        }

        if (person instanceof Woman){
            Woman woman1 = (Woman) person;
            woman1.goShopping();
            System.out.println("=========woman");
        }


        //如果a instanceof A返回true，a instanceof B也返回为true；
        //则B是A的父类


        if (person instanceof Person){
            System.out.println("=========Person");
        }


        if (person instanceof Object){
            System.out.println("=========Object");
        }


        //向下转型的几个常见问题
        //问题一：编译时通过，运行不通过
//        Person person1 = new Man();
//        Woman woman1 = (Woman) person1;


        //问题二：编译通过，运行也通过
        Object object = new Woman();
        Person person2 = (Person) object;

        //问题三：编译不通过
//        Man man2 = new Woman();
    }
}
