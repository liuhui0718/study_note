package day11;

/**
 * 方法形参的传递机制：值传递
 *
 * 1，   形参：方法定义时，在小括号内声明的参数
 *      实参；方法调用时，实际传递给形参的值
 *
 * 2，   如果变量是基本数据类型，此时实参赋给形参的是实参真实存储的数据值
 *       如果变量是引用数据类型，此时实参赋给形参的是实参存储数据的地址值
 *
 *
 *
 */

public class ValueTransferTest2 {

    public static void main(String[] args) {

        Show show = new Show();
        show.m = 10;
        show.n = 20;

        System.out.println("m=" + show.m + " n = " + show.n);

        ValueTransferTest2 valueTransferTest2 = new ValueTransferTest2();
        valueTransferTest2.change(show);
        System.out.println("m=" + show.m + " n = " + show.n);

    }


    public void change(Show show){
        int temp = show.m;
        show.m = show.n;
        show.n = temp;

    }

}

class Show{
    int m ;
    int n;
}
