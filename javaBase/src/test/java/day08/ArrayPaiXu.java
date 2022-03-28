package day08;

/*
数组中常用的排序算法： 冒泡排序 、 快速排序 、堆排序 、 归并排序
其他排序算法：直接选择排序，折半插入排序、shell排序、直接插入排序、桶式排序、基数排序

衡量排序算法的优劣：时间复杂度、空间复杂度、稳定性

数组的冒泡排序
 */
public class ArrayPaiXu {
    public static void main(String[] args) {
        int[] arr = new int[]{99,88,33,55,77,66,22,88,100,11};

        ArrayPaiXu arrayPaiXu = new ArrayPaiXu();
        arrayPaiXu.paiXu(arr);


//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length -1 -i ; j++) {
//
//                if (arr[j] > arr[j + 1]){
//                    int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//
//                }
//
//            }
//
//        }

//        for (int i = 0; i <arr.length -1 ; i++) {
//            System.out.print(arr[i] + "\t");
//
//        }




        //快速排序


        

    }




    public  void paiXu( int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }

            }

        }

        for (int i = 0; i <array.length  ; i++) {
            System.out.print(array[i] + "\t");
    }
}
}
