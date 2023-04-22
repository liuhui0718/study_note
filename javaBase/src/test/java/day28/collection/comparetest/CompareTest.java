package day28.collection.comparetest;

import org.junit.Test;

import java.util.*;

/**
 * 一：说明：
 *      java中的对象，正常情况下，只能进行比较：==   或!=  。不能使用  >   或   < 的，但是在开发场景中，我们需要对多个对象进行排序
 *      言外之意，就需要比较对象的大小。
 *      如何实现？使用后两个接口中的任何一个：Comparable  或   Comparator
 *
 *
 *二：Comparable接口的使用
 */

public class CompareTest {
    /**
     * Comparable接口的使用举例:  自然排序
     *1，像String，包装类等实现了Comparable接口，重写了CompareTo()方法，给出了比较两个对象大小的方式
     *2，像String，包装类等重写了CompareTo()方法以后，进行了从小到大的排序
     *3，重写CompareTo（obj）规则：
     *      如果当前对象this大于形参对象obj，则返回正整数；
     *      如果当前对象this小于形参对象obj，则返回负整数；
     *      如果当前对象this等于形参对象obj，则返回0；
     *
     *4,对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写CompareTo()方法，在CompareTo()方法中指明如何排序
     *
     *
     *
     */

    @Test
    public void test1(){
        String[] arr = new String[]{"FF","RR","DD","JJ","MM","AA"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }



    @Test
    public void test2(){
        Set set = new TreeSet();
        Goods u1 = new Goods("lenovoMouse",123);
        set.add(u1);
        set.add(new Goods("xiaomiMouse",377));
        System.out.println("&&&&&&&&&&&");
        set.add(new Goods("dellMouse",88));
        set.add(new Goods("huaweiMouse",999));
        set.add(new Goods("appleMouse",9999));

        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    /*
    Comparator接口的使用：定制排序
    1，背景：
            当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码，
            或者实现了java.lang.Comparable接口的排序与规则不适合当前的操作。那么可以考虑使用Comparator的对象来排序
    2，重写Compare(Object o1,Object o2)方法，比较o1和o2的大小：
            如果方法返回正整数，则表示o1 > o2;
            如果返回为0，则表示o1 = o2;
            如果返回为负整数，则表示o1 < o2;


     */

    @Test
    public void test3(){
        String[] arr = new String[]{"AA","QQ","WW","RR","DD","CC","MM"};
        Arrays.sort(arr, new Comparator() {

            //按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String&&o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return  -s1.compareTo(s2);

                }
                throw new RuntimeException("输入类型有误");

            }
        });
        System.out.println(Arrays.toString(arr));


    }

    @Test
    public void test4(){

        //指明商品比较大小的方式：按照产品名称从大到小的方式排序，再按照价格从高到低排序

        Goods[] arr = new Goods[5];
        arr[0] =new Goods("lenovoMouse",123);
        arr[1] =new Goods("xiaomiMouse",37);
        arr[2] =new Goods("dellMouse",99);
        arr[3] =new Goods("huaweiMouse",77);

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods){
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if (g1.getName().equals(g2.getName())){
                        return compare(g1.getPrice(),g2.getPrice());

                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                throw new RuntimeException("输入类型有误");
            }
        });


    }
}
