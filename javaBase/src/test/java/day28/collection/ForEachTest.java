package day28.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 增强for循环遍历集合
 *
 */



public class ForEachTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("tom"));
        coll.add(false);
        coll.add(new Person("jerry",40));

        //for(集合中元素的类型 局部变量 ： 集合对象)
        //内部仍然调用了迭代器
        for (Object o : coll){
            System.out.println(o);

        }
    }

    @Test
    public void test2(){

        int[] arr = new int[]{1,2,3,4,5,6};
        //for (数组元素的类型 局部变量 ：数组对象)
        for (int i : arr){
            System.out.println(i);

        }

    }

    @Test
    public void test3(){
        String[]  arr = new String[]{"WW","DD","MM"};
        //方式一：普通for循环:在arr上进行值的修改
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i] = "reba";
//
//        }

        //方式二：增强for循环，将arr的元素赋给了i，没有对arr的元素进行修改
        for(String i : arr){
            i = "nazha";
        }


        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }


}
