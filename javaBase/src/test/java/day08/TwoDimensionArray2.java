package day08;

/*
    5）数组元素的默认初始化值
    规定：二维数组分为外层数组的元素，内存够数组的元素
    int[][] arr = new int[4][3]
        外层元素：arr[0],arr[1]...
        内层元素：arr[0][0],arr[0][1]...

    针对初始化方式一；int[][] arr = new int[4][3];
        外层元素的初始化值：地址值
        内层元素的初始化值：与一维数组的初始化情况相同


    针对初始化方式二：String[][] arr2 = new String[3][];
        外层元素的初始化值：null
        内层元素的初始化值；不能调用



    6）数组的内存解析
 */

public class TwoDimensionArray2 {
    public static void main(String[] args) {

        int[][] arr = new int[4][3];
        System.out.println(arr[0]);//地址值:[I@29453f44
        System.out.println(arr[0][1]);//0
        System.out.println(arr);//[[I@5cad8086


        int[][] arr2 = new int[3][];
        System.out.println(arr2[1]);//null
        System.out.println(arr2[2][1]);//报错

    }
}
