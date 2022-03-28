package day10;

/*
1,声明一个方法，在方法中打印一个10*8的"*"矩阵，在main方法中调用该方法

2，修改上一个程序，除打印一个10*8的矩阵，再计算其面积，并将其作为方法的返回值，在main方法中调用该方法，接受返回的面积值并打印

3，修改上一个程序，在method方法提供m和n两个参数，方法中打印一个m*n的矩阵
 */
public class MethodExer3 {

    int m;
    int n;

    public static void main(String[] args) {
        MethodExer3 m = new MethodExer3();
        System.out.println(m.Method2());

        m.Method3(2,3);
        m.m  = 3;
        m.n  = 4;
        m.Method4();


    }


    //1
    public void Method1(){
        for (int i = 0; i <8 ; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    //2

    public int Method2(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");

            }
            System.out.println();


        }
        int area = 10*8;
        return area;
    }

    //3
    public void Method3(int m,int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    //4
    public  void  Method4(){


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
