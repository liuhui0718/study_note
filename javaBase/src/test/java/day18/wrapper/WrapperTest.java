package day18.wrapper;

import org.junit.Test;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 下午9:40
 * @Version 1.0
 * <p>
 * 包装类的使用
 * 1，java提供8种基本数据类型对应的包装类，使的基本数据类型的变量具有类的特性
 * <p>
 * 2，掌握的：基本数据类型，包装类，String之间的转换
 */
public class WrapperTest {

    @Test
    public void test1() {
        int num1 = 20;
//        System.out.println(num1.toString()); 此时num1是基本数据类型

        //基本数据类型 --->  包装类   ：调用包装类的构造器
        Integer number1 = new Integer(30);
        System.out.println(number1.toString());

        Integer number2 = new Integer("123");
        System.out.println(number2.toString());

        //报异常
//        Integer number3 = new Integer("123ert");
//        System.out.println(number3.toString());

        Float f1 = new Float(12);
        Float f2 = new Float("123");

//        Float f3 = new Float("123asd");   报异常

        Float f4 = new Float(66f);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f4.toString());


        Boolean b1 = new Boolean("true");
        Boolean b2 = new Boolean(true);
        Boolean b3 = new Boolean("hu");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(b3);

        Order order = new Order();
        System.out.println(order.isMale);//没有赋值，默认值false
        System.out.println(order.isFemale);//对象，默认null

    }

    @Test
    public void test2() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        //包装类转换成基本数据类型，调用包装类对应的xxxValue()

        Integer i1 = new Integer("34");
        int i2 = i1.intValue();
        System.out.println(i2);

        Float f1 = new Float(8.9999);
        float f2 = f1.floatValue();
        System.out.println(f2);

        Boolean b1 = new Boolean(true);
        boolean b2 = b1.booleanValue();
        System.out.println(b2);


        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        Class<? extends List> aClass = list.getClass();
        Method add = aClass.getDeclaredMethod("add", Object.class);
        add.invoke(list, "aaa");
        System.out.println(list);
    }


    /**
     * JDK5.0新特性 ；自动装箱与自动拆箱
     */

    @Test
    public void test3() {

        int num1 = 999;
        method(num1);

        /**
         * 自动装箱:基本数据类型转换成包装类：
         */

        int num2 = 888;
        Integer num = num2;
        System.out.println(num);//自动装箱

        boolean b1 = true;
        Boolean b = b1;
        System.out.println(b);//自动装箱


        //自动拆箱：包装类转换成基本数据类型

        System.out.println(num.toString());
        int number = num;
        boolean bool = b;
        System.out.println(number);



    }

    @Test
    public void test4(){

        //基本数据类型类型或包装类   转换成String类型   调用String重载的valueOf()（xxx）

        int num = 33;
        //方式一：连接运算
        System.out.println(num + "");

        //方式二
        Double d = new Double(23.6);
        String ds = String.valueOf(d);
        System.out.println(ds);

        Boolean b = true;
        System.out.println(String.valueOf(b));


    }


    @Test
    public void test5(){
         //String转换成基本数据类型类型或包装类 调用包装类的parsexxx（）方法

        String str1 = "345";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);

        String str2 = "true";
        boolean b = Boolean.parseBoolean(str2);
        System.out.println(b);


        String str3 = "true345";
        boolean b2 = Boolean.parseBoolean(str3);
        System.out.println(b2);



    }


    public void method(Object obj) {
        System.out.println(obj);
    }


}

class Order {

    boolean isMale;
    Boolean isFemale;

}
