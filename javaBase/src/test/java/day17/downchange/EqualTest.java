package day17.downchange;

import java.util.Date;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 下午4:26
 * @Version 1.0
 *
 *面试题：==与equals()的区别
 *
 * 一》：==的使用
 * == 运算符
 * 1，可以使用在基本数据类型和引用数据类型变量中
 * 2，如果使用在基本数据类型中，比较两个变量保存的数据是否相等（不一定要类型相同）
 *      如果使用在引用数据类型中，比较两个对象的地址值是否相同,即两个引用是否指向同一个对象实体
 *
 *
 * 二》：equals()方法的使用
 *
 * 1,equals()是一个方法，而不是运算符
 * 2，只能在引用数据类型中使用
 * 3，Object类中equals()的定义：
 *      public boolean equals(Object obj) {
 *         return (this == obj);
 *     }    说明：Object类中定义的equals()和 == 的作用是相同的：比较两个对象的地址值是否相同。即两个引用是否指向同一个对象实体。
 *
 * 4，像String、Data、File、包装类等都重写了Object类中的equals（）方法。重写之后，比较的不是两个应用的地址值是否相同，而是
 *      比较两个d对象的"实体内容"是否相同
 *
 *
 *
 * 5，通常情况下，我们z自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否相同，那么，我们
 *          就需要对Objecte类中的equals（）方法进行重写。
 *
 *
 *
 *
 *
 */
public class EqualTest {

    public static void main(String[] args) {

        int i = 10;
        int j = 10;
        double w = 10.0;
        System.out.println(i== j);
        System.out.println(i == w);

        boolean b = true;
//        System.out.println(i == b);


        char c = 10;
        System.out.println(i == c);

        Person p = new Person("ccc",33);
        Person p2 = new Person("ccc",33);
        System.out.println(p == p2);//false
        System.out.println("=========");

        System.out.println(p.equals(p2));

        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));

        String s1 = new String("fei");
        String s2 = new String("fei");
        System.out.println(s1.equals(s2));

        Date d1 = new Date(13456789L);
        Date d2 = new Date(13456789L);
        System.out.println(d1.equals(d2));




    }
}
