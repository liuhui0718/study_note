package day28.collection.settest;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1，向TreeSet中添加的数据，必须是相同类的对象
 * 2，两种排序方式，自然排序与定制排序
 *
 * 3，自然排序中，比较两个对象是否相同的标准为：compareTo()方法返回为0，不再是equals（）
 * 4，定制排序中，比较两个对象是否相同的标准为：compare()方法返回为0，不再是equals（）
 *
 *
 */

public class TreeSetTest {

    //
    @Test
    public void test1(){

        //失败，不能添加不能类的对象
//        Set set = new TreeSet();
//        set.add(1);
//        set.add(2);
//        set.add("bb");
//        set.add(new User("tom",12));


        //举例一
         Set set1 = new TreeSet();
        set1.add(1);
        set1.add(90);
        set1.add(8);
        set1.add(-8);
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        //举例二：
        Set set = new TreeSet();

        set.add(new User("tom",12));
        set.add(new User("armi",12));
        set.add(new User("jerry",12));
        set.add(new User("mike",12));
        Iterator iterator2 = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator2.next());
        }






    }


}
