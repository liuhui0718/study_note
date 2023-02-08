package day28.collection;


import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 *一：集合框架的概述：
 *
 * 1，集合、数组都是对多个数据进行存储操作的结构，简称java容器
 *      说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储（.txt,.jpg,数据库）
 *
 * 2.1数组存储多个数据方面的特点
 *      >一旦初始化后，其长度就确定了
 *      >数组一旦定义好，其元素的类型就确定了，我们也就只能操作指定类型的数据了。
 *              比如 String[] arr1；Int[]  arr2 ； Object[]  arr3
 *
 * 2.2数组在存储多个数据方面的缺点
 *       >一旦初始化以后，其长度就不可修改
 *       >数组中提供的方法非常有限，对于添加、删除、插入数据等操作，非常不便，同时效率不高
 *       >获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用
 *       >数组存储数据的特点：有序、可重复，对于无序，不可重复的需求不能满足
 *
 *
 * 二：集合框架
 *      ｜---collection接口：单列集合，用来存储一个一个的对象
 *              ｜--list接口：存储有序的，可重复的数据   ---》"动态"数组
 *                  ｜ArrayList 、linkList、Vector
 *
 *              ｜--set接口：存储无序的，不可重复的数据
 *                  ｜HashSet、LinkHashSet 、TreeSet
 *
 *      ｜--map接口：双列集合，用来存储一对（key  value）的数据
 *              HashMap、LinkHashMao、TreeMap、Hashtable、Properties
 *
 *三：Collection接口中方法的使用
 *
 *
 * 向Collection接口的实现类的对象中添加obj数据时，要求obj所在类要重写equals方法
 *
 *
 */


public class CollectionTest {

    @Test
    public void test1(){

        Collection coll = new ArrayList();
        //add(Object o):将元素o添加到coll集合中
        coll.add("a");
        coll.add(123);
        coll.add(new Date());

        //size()：获取添加元素的个数
        System.out.println(coll.size());

        //addAll(Collection collone):将collone中的元素添加到当前集合中
        Collection collone = new ArrayList();

        collone.add("qw");
        collone.add(1234);
        coll.addAll(collone);
        System.out.println(coll);

        //clear():清空集合元素
        coll.clear();

        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());

        Collection colltwo = new ArrayList();

        colltwo.add(123);
        colltwo.add(456);
        colltwo.add(new String("Tom"));
        colltwo.add(false);
        colltwo.add(new Person("wang",33));

        //1，contains(Object obj):判断当前集合中是否包含obj
        //我们在判断时会调用obj对象所在类的equals（）
        System.out.println(colltwo.contains(456));
        System.out.println(colltwo.contains(new String("Tom")));//true

        System.out.println(colltwo.contains(new Person("wang",33)));//重写equals方法后为true，不重写为false

        //2,containsAll(Collection collthree):判断形参colltwo中的所有元素是否都存在当前集合中
        Collection collthree = Arrays.asList(123,456);
        System.out.println(colltwo.containsAll(collthree));

    }




    @Test
    public void test2(){
        //3,remove(Object obj):从当前集合中移除obj元素
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",40));

        coll.remove(1234);
        System.out.println(coll);
        coll.remove(new Person("jerry",40));
        System.out.println(coll);

        //4，removeAll(Collection coll1):从当前集合中移除coll1中的所有元素
        Collection coll1 = Arrays.asList(123,456,789);
        coll.removeAll(coll1);
        System.out.println(coll);


    }

    @Test
    public void test3(){

        //5，retainAll(Collection coll1):交集：获取当前集合和coll1集合的交集
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",40));

//        Collection coll1 = Arrays.asList(123,456,789);
//        coll.retainAll(coll1);
//        System.out.println(coll);

        //6，equals（Object obj）:要想返回true,需要当前集合和形参集合的元素都相同，对于有序的顺序也要相同

        Collection coll2 = new ArrayList();
        coll2.add(123);
        coll2.add(456);
        coll2.add(new String("tom"));
        coll2.add(false);
        coll2.add(new Person("jerry",40));
        System.out.println(coll.equals(coll2));;

    }

    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",40));

        //7，hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());


        //8，集合转换成数组：toArray()
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length ; i++) {
            System.out.println(obj[i]);

        }

        //拓展；数组转变成集合：调用Arrays类的静态方法asList();
        List<String> list = Arrays.asList(new String[]{"123","456","789"});
        System.out.println(list);

        List arr1 = Arrays.asList(new int[]{123,456});
        System.out.println(arr1.size());//1,数组整体是一个元素

        List<int[]> arr2 = Arrays.asList(new int[]{123,456});
        System.out.println(arr2.size());//1,数组整体是一个元素

        List arr3 = Arrays.asList(new Integer[]{123,456});
        System.out.println(arr3);
        List arr4 = Arrays.asList(123,456);
        System.out.println(arr4);

        //iterator():返回Iterator接口的实例，用于遍历集合元素，放在IteratorTest.java中测试



    }

}
