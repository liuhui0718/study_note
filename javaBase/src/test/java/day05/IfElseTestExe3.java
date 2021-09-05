package day05;


import java.util.Scanner;

/*
练习：
    1，程序随机的产生一个两位数的随机数，提示用户输入一个两位数
    2，如果用户输入的数匹配彩票的实际顺序，奖金10000元
    3，如果用户输入的所有数字匹配彩票的所有数字，但是顺序不一样，奖金3000元
    4，如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1000元
    5，如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500元
    6，如果用户输入的数字没有匹配任何一个数字，则彩票作废
 */
public class IfElseTestExe3 {
    public static void main(String[] args) {
        //产生随机数[10,99]
        //Math.random()-->[0.0,1.0)*90  -->   [0.0,90.0)+10  --->  [10.0,100.0)
        int num =(int)( Math.random() * 90 + 10 );
        System.out.println(num);
        int numShi = num /10;
        int numGe = num % 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要的数字：");
        int number = scanner.nextInt();
        int numberShi = number / 10;
        int numberGe = number % 10;

        if (number == num){
            System.out.println("恭喜你，获得一万元奖励");
        }else if (numberShi == numGe && numberGe == numShi ){
                System.out.println("恭喜你，获得3000元奖励");
        }else if(numberShi == numShi || numberGe == numGe){
                System.out.println("恭喜你，或得1000元奖励");
        }else if (numberShi == numGe || numberGe == numShi) {
                System.out.println("恭喜你，获得500元奖励");
        }else {
                System.out.println("很遗憾，你没有奖励");
        }

    }
}
