package day09;

/*
类中属性的应用：

属性（成员变量） vs  局部变量

1，相同点：
        1.1定义变量的格式：数据类型 + 变量名
        1.2先声明，后使用
        1.3变量都有其对应的作用域




2，不同点：
        2.1在类中声明的位置不同
        属性：直接定义在类的一对{}中
        局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量

        2.2关于权限修饰符的不同
        属性：在声明属性时，可以在数据类型前指明其权限，加上权限修饰符
            权限修饰符：private，public，缺省，protected ---->封装性时讲
        局部变量：不可以使用权限修饰符

        2.3默认初始化值的情况；
            属性：类的属性，根据其类型，都有默认的初始化值
                整形（byte、short、int、long）0
                浮点型（double、float） 0.0
                字符型（char） 0 或'\u0000'
                boolean型（boolean） false

                引用数据类型（类、数组、接口、String） null

            局部变量：没有默认的初始化值
                声明之后必须赋值
                特别的：方法形参在调用时，我们赋值即可。

         2.4在内存中加载的位置不同
            属性：堆（非static）
            局部变量；栈
 */

public class ShuXingTest {
    public static void main(String[] args) {
        ShuXin shuXin = new ShuXin();
        System.out.println(shuXin.age);
        System.out.println(shuXin.name);
        System.out.println(shuXin.isMale);

        shuXin.talk("中文");
    }

}

class ShuXin {
    //属性（）或成员变量
    String name;
    int age;
    boolean isMale;

    public void talk(String language) {//language:方法形参：也是局部变量
        System.out.println("我们使用" + language + "进行交流");

    }
    public void eat(){
        String food = "面条";//局部变量
        System.out.println("北方人喜欢吃：" + food);
    }

}
