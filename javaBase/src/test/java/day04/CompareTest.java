package day04;
/*
运算符之三：比较运算符
    ==      !=      <=      >=      <       >       instanceof
   结论：比较运算符的结果是bolean类型
 */
public class CompareTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a == b);//false
        System.out.println(a = b);//20


        boolean i = true;
        boolean j = false;
        System.out.println(i == j);//false
        System.out.println(j = i);//true

    }
}
