package day28.collection;


import org.junit.Test;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用Iterator接口
 * 1,内部的方法：hasNext()和next（）
 * 2,集合对象每次调用iterator（）方法都得到一个全新的迭代器对象，默认游标都在集合的第一个元素之前
 * 3，内部定义了remove（），可以在遍历的时候，删除集合中的元素，此方法不同于集合直接调用remove（）
 *
 *
 *
 */

public class IteratorTest {

    @Test
    public void test1(){

        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",40));
        Iterator iterator = coll.iterator();

        //方式一
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //报异常：NoSuchElementException
//        System.out.println(iterator.next());

        //方式二：不推荐
//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//        }

        //方式三：推荐
        //hasNext()：判断是否还有下一个元素
        //next（）指针下移，将下移以后集合位置伤的元素返回
        while(iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",40));


        //错误方式一
//        Iterator iterator = coll.iterator();
//        while(iterator.next() != null){
//            System.out.println(iterator.next());
//        }

        //错误方式二：
//        while (coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());
//        }

    }

    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",40));

        //Iterator中的remove（），删除集合中的tom元素
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            if ("tom".equals(obj)){
                iterator.remove();
            }
        }
        Iterator iterator2 = coll.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }


    }
}
