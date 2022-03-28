package day08;

public class ArrayUtils {
    //数组反转、复制、排序、遍历、查找指定元素


    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = {3, 6, 9, 2, 10, 55, 33};
        //反转
        arrayUtils.FanZhuan(array);
        //复制
        arrayUtils.copy(array);


    }


    //反转
    public void FanZhuan(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;

        }
        BianLi(array);

    }


    //遍历
    public void BianLi(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    //复制

    public int[] copy(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }

    //排序
//    public int[] paiXu(int[] array){
//
//        for (int i = 0; i <array.length-1 ; i++) {
//            for (int j = 0; j <array.length -i-1 ; j++) {
//
//
//            }
//
//        }
//
//    }


}
