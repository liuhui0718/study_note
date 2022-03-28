package day08;

/*
1，数组元素的赋值（杨辉三角、回行数）
2，求数值型数组中元素的最大值、最小值、平均数、总和等
3，数组的复制、反转、查找（线性查找、二分法查找）
4，数组的排序算法



创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且随机赋值，同时，要求元素的值各不相同
 */
public class TwoDimensionArrayTest2 {
    public static void main(String[] args) {

        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() *30 +1);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]){
                    i--;
                    break;
                }

            }

        }

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] +"  ");

        }














//        int[] num = new int[6];
//        for (int i = 0; i <num.length; i++) {
//            num[i] = (int) (Math.random()*30 + 1);
//            if (i>0){
//                for (int j = 0; j < i; j++) {
//                    if (num[i]== num[j]){
//                        i--;break;
//
//                    }
//
//
//                }
//            }
//            System.out.println(num[i]);
//
//        }

    }
}
