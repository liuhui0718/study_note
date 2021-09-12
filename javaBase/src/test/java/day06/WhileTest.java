package day06;
/*
While循环的使用
一：循环结构的4个要素
    1，初始化条件
    2，循环条件----->是boolean类型
    3，循环体
    4，迭代条件

    初始化条件
    while(循环条件){
            循环体
            迭代条件

    说明：
        1，写while循环千万小心不要丢了迭代条件。一旦丢了，就可能导致死循环
        2，我们写程序，要避免出现死循环
        3,while循环与for循环可以相互转换

 */

public class WhileTest {
    public static void main(String[] args) {

        //例；便利100以内的偶数
        int i = 1;
        while(i <= 100){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(i);

    }
}
