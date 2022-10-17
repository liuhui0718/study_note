package day25.errortest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 异常处理方式二：throws + 异常类型
 * 1,throws + 异常类型  写在方法的声明处，指执行此方法时可能会抛出的异常类型，一旦当方法体执行时，出现异常，仍会在异常代码处生成一个异常类
 * 的对象，此对象满足throws后异常类型时，就会被抛出。异常代码后续的代码，就不会再执行。
 *
 * 2，体会：try-catch-finally：真正的将异常给处理了
 *         throws：只是将异常抛给了方法的调用者，并没有将异常真正处理掉
 *
 * 3，开发中如何选择使用try-catch-finally，还是使用throws
 *      1，如果父类中被重写的方法没有使用throws方式处理异常，则子类重写的方法也不能使用throws，意味着如果子类重写的方法有异常，
 *          则只能通过try-catch-finally方式处理
 *
 *      2，执行的方法a中，先后又调用了另外的几个办法，这个方法是递进关系执行的，我们建议这几个方法使用throws的方式进行处理。而执行的方法
 *              a可以考虑使用try-catch-finally方式进行处理。
 */

public class ThrowsTest {

    public static void main(String[] args) {
        try {
            method1();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void method1() throws IOException{
        test01();
    }

    public static void test01() throws FileNotFoundException, IOException {
        File file = new File("hello.text");
        FileInputStream f = new FileInputStream(file);

        String s = String.valueOf(f.read());
        System.out.println(s);
        f.close();


    }
}
