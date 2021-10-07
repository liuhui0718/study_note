package day08;
/*
二维数组的使用

1。理解：
    对于二维数组的理解，可以看成是一维数组array1又作为另外一个数组array2的元素而存在，
    其实，从数组底层的运行机制来看，其实没有多维数组


2，二维数组的使用
    1）二维数组的声明和初始化
    2）如何调用数组的指定位置的元素
    3）如何获取数组的长度、
    4）如何遍历数组
    5）数组元素的默认初始化值:见TwoDimensionArray2
    6）数组的内存解析：见TwoDimensionArray2
 */

public class TwoDimensionArray1 {
    public static void main(String[] args) {
        //一维数组的声明和初始化
        //静态·初始化
        int[] arr1 = new int[]{1,2,3};//一维数组

        //二维数组的声明和初始化
        //静态初始化
        int[][] arr2 = new int[][]{{1,2,3},{4,5},{5,6,7}};//二维数组
        //动态初始化1
        String[][] arr3 = new String[3][3];
        //动态初始化2
        String[][] arr4 = new String[3][];
        //还可以这样写
        int[] arr5[] = new int[][]{{1,2,3},{4,5},{5,6,7}};//二维数组
        int[] arr6[] = {{1,2,3},{4,5},{5,6,7}};//二维数组

        //2）如何调用数组的指定位置的元素
        System.out.println(arr2[0][1]);//2
        System.out.println(arr3[2][1]);//null

        arr4[1]=new String[3];
        System.out.println(arr4[1][2]);

        //3）如何获取数组的长度、
        System.out.println(arr5.length);//3
        System.out.println(arr5[0].length);//3
        System.out.println(arr5[1].length);//2

        //4）如何遍历数组

        for (int i = 0; i <arr5.length ; i++) {
            for (int j = 0; j <arr5[i].length ; j++) {
                System.out.println(arr5[i][j]);
            }
            System.out.println();

        }

    }



}
