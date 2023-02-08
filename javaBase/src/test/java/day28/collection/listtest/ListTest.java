package day28.collection.listtest;

import day28.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    /**
     * void add(int index ,Object ele)：在指定位置添加元素
     * boolean addAll(int index ,Collection ele)；在指定位置将else中的所有元素添加进来
     * Object get(int index)：获取指定index位置的元素
     * int indexOf(Object obj)：返回obj在集合中首次出现的位置
     * int lastIndexOf(Object obj)：返回obj在当前集合末次出现的位置
     * Object remove(int index)移除指定位置的元素，并返回次元素
     * Object set(int index , Object obj)：设置指定位置的元素为else
     * List subList(int fromIndex , int toIndex):返回从fromindex到toindex左闭右开位置的子集合
     *
     *
     *
     *
 总结：常用方法


     增：add（Object obj）;从末尾添加元素
     删：remove（int index）/remove (Object obj)
     改：set(int index , Object obj)
     查:Object get(int index)
     插入：add(int index , Object obj)
     长度：size()
     遍历:for循环，增强for循环，iterator迭代器
     */


    //遍历
    @Test
    public void test3(){
        ArrayList list1= new ArrayList();
        list1.add(123);
        list1.add(456);
        list1.add("aa");
        list1.add(new Person("tom",10));
        list1.add(456);
        //方式一
        for (int i = 0; i <list1.size() ; i++) {
            System.out.println(list1.get(i));
        }
        System.out.println("****************");

        //方式二
        for(Object obj :list1){
            System.out.println(obj);
        }
        System.out.println("****************");
        //方式三：iterator迭代器
        Iterator iterator =list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }





    @Test
    public void test1(){
        ArrayList list1= new ArrayList();
        list1.add(123);
        list1.add(456);
        list1.add("aa");
        list1.add(new Person("tom",10));
        list1.add(456);
        System.out.println(list1);

        //void add(int index ,Object ele)：在指定位置添加元素
        list1.add(1,"bb");
        System.out.println(list1);


        //boolean addAll(int index ,Collection ele)；在指定位置将else中的所有元素添加进来
        List list2 = Arrays.asList(1,2,3);
        list1.addAll(list2);
        System.out.println(list1);

       // Object get(int index)：获取指定index位置的元素

        System.out.println(list1.get(1));


    }

    @Test
    public void test2(){
        ArrayList list1= new ArrayList();
        list1.add(123);
        list1.add(456);
        list1.add("aa");
        list1.add(new Person("tom",10));
        list1.add(456);

        //int indexOf(Object obj)：返回obj在集合中首次出现的位置

        int index = list1.indexOf(456);
        System.out.println(index);

        //int lastIndexOf(Object obj)：返回obj在当前集合末次出现的位置
        System.out.println(list1.lastIndexOf(456));

        //Object remove(int index)移除指定位置的元素，并返回次元素
        System.out.println(list1.remove(0));
        System.out.println(list1);

        // Object set(int index)：设置指定位置的元素为else
        Object obj = list1.set(0,"vv");
        System.out.println(obj);
        System.out.println(list1);
        //List subList(int fromIndex , int toIndex):返回从fromindex到toindex位置的子集合
        List list2 = list1.subList(0,2);
        System.out.println(list2);


    }
}
