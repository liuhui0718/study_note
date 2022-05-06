package day11;

//1，第一行有1个元素，第n行有n个元素
//        2，每一行的第一个元素和最后一个元素都是1
//        3，yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j](非第一个元素和最后一个元素)

public class YangHui {
    public static void main(String[] args) {

        int[][] arr  = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            //第一个元素和最后一个元素赋值
            arr[i][0] = arr[i][i] = 1;
            if (i >1){
                for (int j = 1; j < arr[i].length-1; j++) {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];


                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();

        }






    }
}
