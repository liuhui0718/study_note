package day18.wrapper;


import org.junit.Test;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/1 上午10:45
 * @Version 1.0
 */
public class MianShiTest {


    @Test
    public void test1(){
        Object o1 = true ? new Integer(1) : new Double(2.0);//三元运算符，数据类型先统一
        System.out.println(o1);
    }


    @Test
    public  void test2(){
        Object o2;
        if (true){
            o2 =new Integer(1);

        }else {
            o2 = new Double(2.0);
        }
        System.out.println(o2);
    }


    @Test
    public void test3(){
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);//false
        System.out.println(i1.equals(i2));//true,Integer重写了equals()方法

        Integer i3 = 1;
        Integer i4 = 1;
        System.out.println(i3 == i4);//true


        Integer i5 = 129;
        Integer i6 = 129;
        System.out.println(i5 == i6);//false





    }
}
