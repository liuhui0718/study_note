package day25.errortest;

import org.junit.Test;

/**
 * 一：异常处理     ：抓抛模型
 *
 * 过程一："抛"：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生成一个对应异常类的对象。
 *          并将此对象抛出。一旦抛出此对象之后，其后的代码就不再执行。
 *
 * 过程二："抓"：可以理解为异常的处理方式：1，try-catch-finally    2，throws
 *
 *
 * 二：try-catch-finally的使用
 *
 * try{
 *     可能出现异常的代码
 * }catch(异常类型1，变量名1){
 *     处理异常的方式1
 * }
 * catch(异常类型2，变量名2){
 *      处理异常的方式2
 *  }
 *  catch(异常类型3，变量名3){
 *      处理异常的方式3
 * }fianlly{
 *     //一定会执行的代码
 * }
 *
 * 说明：
 * 1,finally 可选
 * 2,使用try将可能出现异常的代码包装起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配
 * 3，一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理，一旦处理完成，就跳出try-catch结构（在没有写finally的情况下）
 * 继续执行其后的代码
 * 4，catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓
 *    catch中的异常类型如果有子父类关系，要求子类的声明在父类上面，否则会报错
 *
 * 5,常用异常处理方式  1，String getMessage()  2,printStackTrace()
 *
 * 6,在try结构中的变量，在出了try结构后就不能再用了
 *
 * 7，try-catch-finally 可以相互嵌套使用
 *
 * 体会1：使用try-catch-finally处理编译时异常，程序在编译时将不会报错，但在运行时仍可能报错，
 *      相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现
 *
 * 体会2：开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally 了
 *        针对编译时异常，我们一定要进行异常的处理；
 *
 *
 */
public class ExceptionTest1 {

    @Test
    public void test01(){

       String num = "abc";
       try{
           int a = Integer.parseInt(num);
           System.out.println("异常后面代码不执行");
       } catch (NumberFormatException e) {
          // e.printStackTrace();
           System.out.println(e.getMessage());
           System.out.println("出现数值转换异常");
       }catch(NullPointerException e){
           System.out.println(e.getMessage());
       }

        System.out.println("*******");


    }






}

