package day11;


/**
 * 已知一个数列，f(0) = 1,f(1) = 4 ,f(n+2) = 2*f(n+1) +f(n)
 * 其中n是大于0的整数，求f（10）
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
        System.out.println(recursionTest.f(2));

        System.out.println("===========");
        System.out.println(recursionTest.fei(4));


    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 4;
        }
        if (n > 1) {
            return 2 * f(n - 1) + f(n - 2);
        }
        return Integer.parseInt(null);

    }

    //斐波那契数列

    public int fei(int n) {
        if (n <= 2) {
            return 1;
        }
        if (n > 2) {

            return fei(n - 1) + fei(n - 2);
        }
        return Integer.parseInt(null);

    }
}