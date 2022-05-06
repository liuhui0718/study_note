package day18.wrapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/1 上午11:20
 * @Version 1.0
 */
public class Exer {

    public static void main(String[] args) {
        //键盘读取学生成绩
        Scanner scanner = new Scanner(System.in);

        //创建Vector对象

        Vector v = new Vector();
        //通过for（;;）或者while（true）方式，给Vertor中添加数组

        for (; ; ) {
            System.out.println("请输入学生成绩，负数代表结束");
            int score = scanner.nextInt();
            if (score < 0) {
                break;
            } else if (score > 150) {
                System.out.println("输入参数不合理，请重新输入");
                continue;
            } else {
                Integer intscore = score;
                v.addElement(intscore);
            }
        }
        //获取最大值
        int max = 0;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            Integer intScore = (Integer) obj;
            int score = intScore;
            if (max < score) {
                max = score;

            }

            if (max - score < 10) {
                System.out.println("成绩为：" + score + "等级为A");
            }
            if (max - score < 20) {
                System.out.println("成绩为：" + score + "等级为B");
            }
            if (max - score < 30) {
                System.out.println("成绩为：" + score + "等级为C");
            } else {
                System.out.println("成绩为：" + score + "等级为D");
            }

        }
    }
}
