package day08;
/*
数组中常用的排序算法： 冒泡排序 、 快速排序 、堆排序 、 归并排序
其他排序算法：直接选择排序，折半插入排序、shell排序、直接插入排序、桶式排序、基数排序

数组的冒泡排序
 */
public class ArrayPaiXu {
    public static void main(String[] args) {
        int[] arr = new int[]{99,88,33,55,77,66,22,88,100,11};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -1 -i ; j++) {

                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;

                }

            }
            
        }

        for (int i = 0; i <arr.length -1 ; i++) {
            System.out.print(arr[i] + "\t");

        }




        //快速排序


        

    }
}
