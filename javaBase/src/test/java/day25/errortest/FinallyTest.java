package day25.errortest;

import org.junit.Test;

/**
 * try-catch-finally 中finally的用法
 *
 * 1，finally可选
 * 2，finally中声明的是一定会执行的代码，即使try中有return，catch又出现异常了，catch中有return的语句等情况。
 * 3,像数据库连接，输入输出流，网络变成socket连接，jvm是不能自动回收的，我们需要手动的进行资源的释放，此时的资源释放，就要声明在finally中
 *
 */

public class FinallyTest {


    @Test
    public void test03(){
        int num = test02();
        System.out.println(num);
    }


    public int test02(){
        try{
            int[] jj = new int[4];
            System.out.println(jj[4]);
            return  1;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally {
            System.out.println("yidingzhixing");
            return 3;
        }
    }

    @Test
    public void test01() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch (ArithmeticException e){
           // e.printStackTrace();
            int[] a = new int[10];
            System.out.println(a[10]);

        }catch (Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("一定会执行的代码");
        }
    }
}
