package day08;
/*
java.util.Arrays：操作数组的工具类，里面定义了很多操作数组的方法
 */

import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {

        //1，arrays.equals(array1,array2)：判断两个数组是否相等

        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,2,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);


        //2.Arrays.toString（array）:输出数组名信息
        int[] arr3 = new int[]{1,4,5,7,8};
        String body = Arrays.toString(arr3);
        System.out.println(body);


        //3,void   Arrays.fill(array):将指定值填充到数组中
        Arrays.fill(arr1,2);
        Arrays.fill(arr1,0,2,4);
        System.out.println(Arrays.toString(arr1));


        //4，void    Arrays.sort(array):对数组进行排序：正序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        //5,Arrays.binarySearch(array):二分法查找
        int[] arr5 = new int[]{99,88,33,55,77,66,22,88,100,11};
        int index = Arrays.binarySearch(arr5,88);
        System.out.println(index);

    }


}