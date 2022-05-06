package day23.interfacetest.java8;

/**
 * @Author Miracle Liuhui
 * @Date 2022/5/3 下午5:15
 * @Version 1.0
 *
 * JDK8：除了可以定义全局常量和抽象方法之外，还可以定义静态方法，默认方法（略）
 */
public interface CompareA {

    public static void method1(){
        System.out.println("Compare: 北京");
    }

    public default void method2(){
        System.out.println("Compare: 上海");
    }

    default void method3(){
        System.out.println("Compare: 杭州");
    }
}
