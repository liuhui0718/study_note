package day21.blockandfinal;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/2 下午5:19
 * @Version 1.0
 *
 * fianl:最终的
 *
 *
 * 1，final可以用来修饰的结构：类、方法、变量
 *
 * 2，final  用来修饰一个类：此类不能被其他类所继承
 *           比如；String类、System类、StringBuffer类
 *
 * 3，final  用来修饰方法；表明此方法不可以被重写
 *           比如：Object类中的getClass()方法
 *
 *
 * 4，final 用来修饰变量：此时的"变量"就称为是一个常量
 *      4.1 final修饰属性：可以考虑赋值的位置有：显示初始化、代码块中初始化、构造器中初始化
 *      4.2final修饰局部变量
 *                  尤其是final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量赋一个实参。一旦赋值以后
 *                  就只能在方法体内使用此形参，但不能进行重新赋值。
 */
public class FinalTest {


     final int WIDTH = 8;

     final int RIGHT;

     public  FinalTest(){

         RIGHT  = 3;
     }

     final int LEAF ;
    {
        LEAF = 10;
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
//        finalTest.RIGHT = 9;
        System.out.println(finalTest.RIGHT);

        finalTest.show();
        finalTest.show(999);

    }




    //final修饰局部变量
    public  void show(){
        final int HEIGHT = 6;
        System.out.println(HEIGHT);
    }

    //final修饰局部变量
    public void show(final int id){
        System.out.println(id);
    }
}




final class Car{



}

//class  bmw extends Car{
//
//}


class ChangAn{
    public final void show(){

    }
}

class FuTe extends ChangAn{
//    public  void show(){
//
//    }
}


