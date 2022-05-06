package day13.override;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 上午11:13
 * @Version 1.0
 */
public class Student extends Person {

    String major;

    public Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public void study( String major){
        System.out.println("学习了" + major);
    }

    public void eat(){
        System.out.println("年轻人多吃饭，少抽烟");
    }


    public void show(){
        System.out.println("我是一个学生");
    }
}
