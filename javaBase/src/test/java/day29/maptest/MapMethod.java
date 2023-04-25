package day29.maptest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * map中定义的方法
 *
 *   添加、删除、修改操作
 *
 *
 */


public class MapMethod {

    /*
    添加、删除、修改操作

    Object put(Object key,Object value)将指定key-value添加到（或修改到）当前map对象中
    void putAll(Map m)将m中所有的key-value对存放到当前map中；
    Object remove（Object key）：移除指定可以的key-value对，并返回value
    void clear（）：清空当前map中的所有数据

     */

    @Test
    public void test01(){

        Map map = new HashMap();
        //添加
        map.put(123,"aa");
        map.put("bb",234);
        map.put("cc",345);
        //修改
        map.put("bb",11);
        System.out.println(map);

        Map map2 = new HashMap();
        map.put("dd",22);
        map.put("ee",33);
        map2.putAll(map);
        System.out.println(map2);
        //remove
        map2.remove("dd");
        System.out.println(map2);

        //clear
        map.clear();//与map= null操作不同
        System.out.println(map);
        System.out.println(map.size());


    }



}
