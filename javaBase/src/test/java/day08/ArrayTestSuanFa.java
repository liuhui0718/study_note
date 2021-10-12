package day08;
/*
3，算法的考察：数组的复制、反转、查找（线性查找、二分法查找）
 */
public class ArrayTestSuanFa {
    public static void main(String[] args) {
        String[] arr = new String[]{"姐姐","哥哥","弟弟","妹妹","美眉","美女"};

        //数组的复制
        String[] arr1 = new String[arr.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
        for (int i = 0; i < arr.length / 2 ; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        //遍历
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

        //查找（搜索）
        //线性查找

        String dest = "美眉";
        boolean isFlag = true;
        for (int i = 0; i <arr.length ; i++) {
            if (dest.equals(arr[i])){
                System.out.println("找到了指定元素，位置为：" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("很抱歉，没有找到指定元素");
        }


        //二分法查找：前提：所要查找的数组必须有序
        int[] array = new int[]{-24,-22,-10,-2,-1,0,8,25,66,99,100};

        int dest1 = 0;
        int start = 0;
        int end = array.length-1;
        boolean isFlag1 = true;
        for (int i = 0; i < array.length /2 ; i++) {
            int middle = (start + end) / 2;
            if (dest1 == array[middle]){
                System.out.println("恭喜找到指定元素，位置为"+ middle);
                isFlag1 = false;
                break;

            }else if (array[middle] > dest1){
                end = middle-1;

            }else{//array[middle] < dest1
                start = middle + 1;

            }

        }
        if (isFlag1){
            System.out.println("很遗憾没有找到");
        }

    }
}
