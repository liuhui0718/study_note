package day23.interfacetest.java8;

/**
 * @Author Miracle Liuhui
 * @Date 2022/5/3 下午5:20
 * @Version 1.0
 */
public class SubClassTest {

    public static void main(String[] args) {

        //知识点1：接口中定义的静态方法，只能通过接口来调用
        CompareA.method1();


        //知识点二；通过实现类的对象，可以调用接口的默认方法
        //如果实现类重写了接口中定义的默认方法，则调用时调用的是重写的方法
        SubClass subClass = new SubClass();
        subClass.method2();



        //知识点三：如果子类（或实现类）继承的父类和实现的接口中声明了同名同参数的方法
        //那么子类在么有重写此方法的情况下，默认调用的是父类中的同名同参数方法  --》类优先原则
        subClass.method3();

    }



}

class SubClass extends SuperClass implements CompareA{
    public void method2(){
        System.out.println("SubClass : 武汉");
    }

    public void method3(){
        System.out.println("subclass: 深圳");
    }






    //知识点5：如何在子类（或实现类）的方法中调用父类，接口中被重写的方法
    public void myMethod(){
        method3();//调用自己定义的方法
        super.method3();//调用的是父类中声明的

        //调用接口中的默认方法
        CompareA.super.method3();

    }

}
