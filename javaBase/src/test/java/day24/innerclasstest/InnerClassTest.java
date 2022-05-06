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
 */
public class InnerClassTest {


}

class  Person{


//    静态成员内部类
    static class Dog{

    }
    // 非静态成员内部类
    class Bird{

    }



    public void method(){
        //局部内部类
        class AA{

        }
    }

    {
        //局部内部类
        class  BB{

        }
    }


    public Person(){
        //局部内部类
        class CC{

        }
    }
}
