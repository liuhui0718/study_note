package day11;
/*
方法形参的传递机制：值传递

1，形参：方法定义时，在小括号内声明的参数
2，实参；方法调用时，实际传递给形参的值
 */

public class ValueTransferTest1 {
    public static void main(String[] args) {

        int m = 10;
        int n = 20;

        System.out.println("m=" + m + " n = " + n);

        ValueTransferTest1 test = new ValueTransferTest1();
        test.change(m,n);

        System.out.println("m=" + m + " n = " + n);//实际保存的还是main方法里面m和n，change方法运行完已经出栈


    }

    //交换值
    public void change(int a,int b){
        int temp = a;
        a = b;
        b = temp;

    }


}
