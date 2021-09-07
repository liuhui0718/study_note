package day05;
/*编写程序：从键盘上输入2019年的"month" 和"day"，要求通过程序输出输入的日期为2019年的第几天


说明：
    1，凡是可以使用switch-case的结构，都可以转换为if-else，反之，则不成立
    2，当既可以使用switch-case（switch中表达式的取值情况不太多），又可以使用if-else时，优先使用switch-case
    原因：switch-case执行效率稍高
 */

import java.util.Scanner;

public class SwitchCaseExer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入month：");
        int month = scanner.nextInt();

        System.out.println("请输入day:");
        int day = scanner.nextInt();

        //声明一个变量来接收天数
        int numbers = 0;
        switch (month){
            case 12:
                numbers += 30;
            case 11:
                numbers += 31;
            case 10:
                numbers += 30;
            case 9:
                numbers += 31;
            case 8:
                numbers += 31;
            case 7:
                numbers += 30;
            case 6:
                numbers += 31;
            case 5:
                numbers += 30;
            case 4:
                numbers += 31;
            case 3:
                numbers += 28;
            case 2:
                numbers += 31;
            case 1:
                numbers += day;
        }
        System.out.println(numbers);

    }


}
