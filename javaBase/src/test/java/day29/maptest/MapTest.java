package day29.maptest;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *      |----Map:双列数据  存储key-value键值对的数据，--类似于高中的函数  y=f（x）
 *              |----HashMap：作为Map接口的主要实现类；线程不安全，效率高；可以存储null的key和value；
 *                  |----LinkedHashMap：保证在遍历map元素时，可以按照添加的顺序实现遍历。
 *                          原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个元素和后一个元素
 *                              对于频繁的遍历操作，此类执行效率高于HashMap.
 *
 *              |----TreeMap：保证按照添加的key-value对进行排序，实现排序遍历，此时考虑key的自然排序或定制排序
 *                              底层使用红黑树
 *              |----Hashtable：作为古老的实现类，线程安全，效率低；不能存储null的key和value；
 *                  |----prpperties：常用来处理配置文件，key和value都是String类型；
 *
 *
 *      HashMap的底层：数组+链表（jdk7及以前）
 *                    数组+链表+红黑树（jdk8）
 *
 *  面试题：
 *  1，HashMap的底层实现原理：
 *  2，HashMap和Hashtable的异同？
 *  3，CurrentHashMap和Hashtable的异同？
 *
 *
 *  二：map结构的理解：
 *      Map中的key：无序的，不可重复的，使用Set存储所有的key；--》key所在的类要重写equals（）和hashCode()；（以HashMap举例）
 *      Map中的value：无序的，可重复的，使用Collection存储所有的value；value所在的类要重写equals（）方法
 *      一个键值对key-value构成了一个Entry对象。Map中的entry：无序的，不可重复的，使用Set存储所有的entry
 *
 * 三：HashMap的底层实现原理：
 * jdk7：
 *      HashMap map = new HashMap();
 *      在实例化以后，底层创建了长度为16的一维数组Entry[] table。
 *      map.put(key1, value1):
 *      首先，调用key1所在类的hashCode()计算出key1的哈希值，此哈希值经过某种算法计算以后，得到在Entry[]数组中的存放位置。
 *      如果此位置上的数据为空，此时的key1-value1添加成功。----情况1
 *      如果此位置上的数据不为空，（意味这该位置上存在一个或多个数据（以链表形式存在）），比较key1和已经存在的数据的哈希值：
 *          如果key1的哈希值与已经存在的某一数据的哈希值都不相同，此时key1--value1添加成功，-----情况2
 *          如果key1的哈希值与已经存在的某一数据（key2-value2）的哈希值相同，继续比比较，调用key1的所在类的equals（）方法，比较：
 *              如果equals（）方法返回false，此时key1--value1添加成功；----轻狂
 *              如果equals（）方法返回true，使用新添加的value替换之前的value值
 *
 *      补充：关于情况2和情况3，此时的key1-value1和原来的数据以链表的形式存储
 *      在不断的添加过程中，会涉及到扩容问题，默认的扩容方式：扩容为原来容量的两倍，并将原有数据复制过来
 *jdk8：
 * jdk8相较于jdk7在底层实现方面的不同：
 *      1，new HashMap()：底层没有创建一个长度为16的数组
 *      2，jdk8的底层数组是Node[]，而非Entry[]；
 *      3，首次调用put方法时，底层创建长度为16的数组
 *      4，jdk7底层结构只有：数组+链表。jdk8中底层结构：数组+链表+红黑树。
 *              当数组某一索引位置上的元素以链表的形式存在数据个数> 8 且数组长度 > 64 时，此时此索引位置上的所有数据改为红黑树存储
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

public class MapTest {


    @Test
    public void test02(){
        Map map = new HashMap();
        map = new LinkedHashMap();
        map.put(123,"oo");
        map.put(456,"yy");
        map.put(7898,"rr");
        System.out.println(map);
    }
    @Test
    public void test01(){
        Map map = new HashMap<>();
        map.put(null,null);
    }
}
