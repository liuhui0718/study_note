package day10;

/*
定义Student类，包含三个属性，学号number（int），年级state（int），成绩score（int）创建20个学生对象，学生对象1-20
                年级和成绩都由随机数确定，


                问题一：打印出3年级（state=3）的学生信息
                问题二；使用冒泡排序按学生成绩排序，并遍历所有学生信息

                提示；
                生成随机数： Math.random(),返回值类型为double；
                四舍五入取整：Math.round(double d),返回值类型为long
 */
public class MethodExer4 {


    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 100 + 1);
        }


        //遍历学生数组
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(" 学号：" + students[i].number + " 班级：" + students[i].state + " 分数：" + students[i].score);
//
//        }

        System.out.println("===========");
        //打印出3年级（state=3）的学生信息
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].state == 3) {
//                System.out.println(" 学号：" + students[i].number + " 班级：" + students[i].state + " 分数：" + students[i].score);
//
//            }
//
//        }

        //使用冒泡排序按学生成绩排序，并遍历所有学生信息
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].score < students[j + 1].score) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;

                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println(" 学号：" + students[i].number + " 班级：" + students[i].state + " 分数：" + students[i].score);
        }
    }

}
class Student {
    int number;
    int state;
    int score;


}
