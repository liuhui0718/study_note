package day08;

/*
1，创建一个名为ArrayExer2的类，在main（）方法中声明array1和array2两个变量，他们是int[]类型的数组
2，array1初始化为8个素数，2，3，5，7，11，13，17，19。
3，显示array1的内容
4，赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值（array[0]=0,array[2] = 2）
 */

public class ArrayExer2 {
    public static void main(String[] args) {
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        //赋值array2变量等于array1
//        array2 = array1;
//        System.out.println();

        /*
        数组的复制

         */

        array2 = new int[array1.length];
        for(int i = 0;i < array1.length;i++){
            array2[i] = array1[i];
        }


        //修改array2中的偶索引元素，使其等于索引值（array[0]=0,array[2] = 2）
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
            System.out.print(array2[i] + "\t");

        }

        System.out.println(array1);
        System.out.println(array2);
    }
}
