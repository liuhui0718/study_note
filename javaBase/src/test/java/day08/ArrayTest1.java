package day08;

/*
数组的默认初始化值
    ->数组元素是整型：0
    ->数组元素是浮点型；0.0
    ->数组元素是char型:  /0或
    ->数组元素是boolean型:false

    ->数组元素是引用数据类型时：null



数组的内存解析
 */
public class ArrayTest1 {
    public static void main(String[] args) {

        //5）数组元素的初始化值
        int[] arr1 = new int[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);

        }
        short[] arr2 = new short[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        float[] arr3 = new float[3];
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        char[] arr4 = new char[3];
        for (int i = 0; i < arr4.length; i++) {
            System.out.println("===="+arr4[i] + "*****");
        }
        boolean[] arr5= new boolean[3];
        for (int i = 0; i < arr5.length; i++) {
            System.out.println("===="+arr5[i] + "*****");
        }
        String[] arr6= new String[3];
        for (int i = 0; i < arr6.length; i++) {
            System.out.println("===="+arr6[i] + "*****");
        }

        //6）数组的内存解析


    }
}
