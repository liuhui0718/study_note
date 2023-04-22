package day28.collection.settest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * set接口的框架
 * ｜---collection接口：单列集合，用来存储一个一个的对象
 *
 *                ｜--set接口：存储无序的，不可重复的数据
 *                  ｜HashSet：作为set接口的主要实现类：线程不安全，可以存储null值
 *                  ｜LinkHashSet ：作为HashSet的子类：遍历其内部数据时，可以按照添加的顺序遍历
 *                                  对于频繁的遍历操作，LinkedHashSet效率高于HashSet
 *                  ｜TreeSet：可以按照添加对象的属性，进行排序
 *
 *
 *   1，set接口中没有额外定义新的方法，使用的都是collection中声明过的方法
 *
 *   2，要求：向set中添加的数据，其所在的类一定要重写hashCode()和equals（）；
 *      要求：重写的hashCode()和equals（）尽可能保持一致性：相等的对象必须拥有相等的散列码
 */

public class SetListTest {

    /**
     * 一：set存储无序的，不可重复的数据
     以HashSet为例说明
     1，无序性：不等于随机性，存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值去添加
     2，不可重复性：保证添加的元素在按照equals（）判断时，不返回true，即：想通过的元素只能添加一个

     二：添加元素的过程，以HashSet为例
        我们向HashSet中添加元素a，首先调用元素a所在类的hashCode（），计算出a的哈希值，此哈希值接着通过某种算法计算出在HashSet底层
        数组中的存放位置（即：索引位置），判断数组此位置上是否已经有元素
            如果该位置上没有元素，则元素a添加成功------》情况1
            如果该位置上已经有了其他元素（或者以链表形式存在多个元素），则需要比较元素a与元素b的哈希值
                如果与元素a与元素b的哈希值不相同，则添加元素a成功------》情况2
                如果元素a与元素b的哈希值相同，则需要调用元素a所在类的equals（），
                    equals（）方法返回为true，则添加元素失败
                    equals（）方法返回为false，则添加元素a成功------》情况3

     对于添加成功的情况2与情况3而言，与已经存在指定索引位置上的数据以链表的形式存储
     jdk7：新的元素a放在数组中，指向原来的元素
     jdk8：原来的元素放在数组中，指向新的元素a
     总结；七上八下


     HashSet底层；数组+链表的结构

     */


    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(1);
        set.add(2);
        set.add("aa");
        set.add("bb");
        set.add(new User("tom",12));
        set.add(2);
        set.add(4);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    /**
     * LinkedHashSet的使用
     * LinkedHashSet作为HashSet的子类，在添加数据的同时，每个数据还维护了两个应用，记录此数据前一个数据和后一个数据
     * 优点：对于频繁的遍历操作，LinkedHashSet效率高于HashSet
      */


    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(1);
        set.add(2);
        set.add("aa");
        set.add("bb");
        set.add(new User("tom",12));
        set.add(2);
        set.add(4);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
