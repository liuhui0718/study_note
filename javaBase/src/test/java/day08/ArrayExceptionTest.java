package day08;

/*
数组中的常见异常
1，数组角标越界异常：ArrayIndexOutOfBoundsException

2，空指针异常：NullPointException
 */

public class ArrayExceptionTest {
    public static void main(String[] args) {

        //1，数组角标越界异常：ArrayIndexOutOfBoundsException

        int[] arr = new int[]{1, 4, 3, 6, 8, 5};
//        for (int i = 0; i <=arr.length ; i++) {
//            System.out.println(arr[i]);
//
//        }
       // System.out.println(arr[-3]);

        //2，空指针异常：NullPointException
        //情况1
//        int[] arr1 = new int[]{1,2,3,4};
//        arr1 = null;
//        System.out.println(arr1[1]);

        //  情况2
//        int[][] arr3 = new int[4][];
//        System.out.println(arr3[3][4]);

        //情况3
        String[] arr4 = new String[]{"aa","bb","cc"};
        arr4[0] = null;
        System.out.println(arr4[0]);




    }
}
