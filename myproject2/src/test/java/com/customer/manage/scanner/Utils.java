package com.customer.manage.scanner;

import java.util.Scanner;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/28 下午4:06
 * @Version 1.0
 */
public class Utils {

    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.inner();
    }
    public  int inner(){

        Scanner scanner = new Scanner(System.in);
         int unmber = scanner.nextInt();
         if (unmber < 1 || unmber > 5){
             System.out.println("输入参数不合理，请重新输入");
         }
         return unmber;

    }
}
