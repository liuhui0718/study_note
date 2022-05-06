package day13.override;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 上午11:13
 * @Version 1.0
 *
 *
 * 方法的重写（override/overwrite）
 * 1,重写：子类继承父类后，可以对父类同名同参数的方法，进行覆盖操作。
 * 2，应用：重写之后，当创建子类对象之后，通过子类对象去调用子父类的同名同参数的方法时，实际执行的是子类重写父类的方法
 *
 * 3，重写的规定：
 *              方法的声明：权限修饰符 返回值类型 方法名（形参列表）throws 异常的类型{
 *                  方法体
 *              }
 *              约定俗称：子类中的叫重写的方法，父类中叫被重写的方法
 *
 *            1，子类中重写方法的方法名与形参列表与父类中被重写的方法名与形参列表相同
 *            2，子类中重写方法的权限修饰符权限大于或等于父类被重写方法的权限修饰符权限
 *              特殊情况；子类不能重写父类中声明为private权限的方法
 *            3，返回值类型：
 *                  1，父类中返回值类型是void，子类重写的方法的返回值类型也必须是void
 *                  2，父类被重写的方法返回值类型是a类型，则子类重写的方法的返回值类型可以是a类型或者a类型的子类
 *                  3，父类被重写的方法返回值类型是基本数据类型（如：int），则子类重写的方法的返回值类型必须是相同的（int）
 *           4，子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 */


public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student();
        Person person = new Person();

        //student.eat();
        student.sleep(10);
        student.name = "tom";

    }
}
