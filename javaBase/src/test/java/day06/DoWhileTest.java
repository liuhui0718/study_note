package day06;
/*
do While循环的使用
一：循环结构的4个要素
    1，初始化条件
    2，循环条件----->是boolean类型
    3，循环体
    4，迭代条件

二：do-while循环结构
    初始化条件；
    do{
        循环体
        迭代条件
    }while（循环条件）；

    说明：
        1，do-while循环至少会执行一次循环体
        2，开发中，使用for循环与while循环会多一些。较少使用do-while循环
 */

public class DoWhileTest {
    public static void main(String[] args) {
        //例：便利100以内的偶数
        int i = 1;
        int sum = 0;//记录总和
        int count = 0;//记录个数
        do {
            if (i % 2 == 0){
                System.out.println(i);
                sum +=i;
                count++;
            }
            i++;
        }while (i <= 100);
        System.out.println("总和为："+sum);
        System.out.println("个数为："+count);

    }
}
