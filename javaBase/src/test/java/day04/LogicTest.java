package day04;
/*
运算符之四：逻辑运算符
    &       &&      ｜       ｜｜      ^
 */

public class LogicTest {
    public static void main(String[] args) {

        //区分&   和  &&
        //相同点：1，&   和   &&  的运算结果相同
        //       2，当符号左边都为true时，二者都会执行符号右边的运算

        //不同点：当符号左边是false时，&  继续执行符号右边的运算，&& 短路不再执行符号右边的运算
        //开发中，推荐使用&&
        boolean a1 = true;
        a1 = false;
        int b1 = 10;
        if (a1 & (b1++ >0)){
            System.out.println("这是真的");
        }else{
            System.out.println("这是假的");
        }
        System.out.println("b1 = "+ b1);

        boolean a2 = true;
        a2 =false;
        int b2 = 10;
        if (a2 && (b2++ >0)){
            System.out.println("这是真的");
        }else{
            System.out.println("这是假的");
        }
        System.out.println("b2 = "+ b2);



        //区分 ｜ 和 ｜｜，和&& ，&相似，短路
        //相同点：1，当符号左边是false时，二者都会执行符号右边的运算
        //       2，｜ 和  ｜｜的运算结果相同

        //不同点：当符号左边是true时，｜继续执行符号右边的运算，而｜｜则短路，不再执行符号右边的运算
        //开发中，推荐使用｜｜


    }
}
