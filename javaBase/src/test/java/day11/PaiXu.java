package day11;

public class PaiXu {
    public static void main(String[] args) {
        int[] arr = {1,6,4,2,8,66,99,44};
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");

        }
    }
}
