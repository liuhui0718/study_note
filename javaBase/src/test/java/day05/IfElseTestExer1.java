package day05;

/*
if-else选择语句
    1，else结构是可选的，非必写
    2，针对条件表达式
        》如果多个条件表达式是"互斥"关系（没有交集），哪个判断和执行语句声明在上面还是下面，无所谓
        》如果多个条件表达式有交集的关系，需要根据实际情况，考虑清楚应该将哪个语句声明在上面：因为if-else语句满足条件执行完后会跳出选择，不会接着运行
        》如果多个条件表达式之间有包含的关系，通常情况下，需要将范围小的声明在范围大的上面。否则，范围小的时候就没继辉执行了
 */



import java.util.Scanner;

public class IfElseTestExer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入你的成绩(0-100)：");

        int score = scanner.nextInt();

        if (score == 100){
            System.out.println("奖励一辆BMW");
        }else if (score >= 80 && score < 100){
            System.out.println("奖励一部iphone");
        }else if (score >= 60 && score < 80){
            System.out.println("奖励一部ipad");
        }else if (score < 60){
            System.out.println("打断腿");
        }

    }


}
