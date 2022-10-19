package day25.errortest;

/**
 *      异常体系结构
 *java.lang.Throwable
 *      ｜--------java.lang.Error:一般不编写针对性的代码进行编写
 *      ｜---------java.lang.Exception：可以进行异常的处理
 *          ｜--------编译时异常（checked）
 *              1，IOException
 *              2,FileNotFoundException
 *              3,ClassNotFoundException
 *          |--------运行时异常（unchecked，RuntimeException）
 *              1,NullPointerException
 *              2,ArrayIndexOutOfBoundsException
 *              3,ClassCastException  类型转换异常
 *              4，NumberFormatException
 *              5,InputMismatchException 输入不匹配
 *
 *
 *
 *
 *
 *
 *
 */


public class ExceptionTest {
}
