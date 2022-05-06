package day13.override;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 上午11:13
 * @Version 1.0
 */
public class Person {
    String name = "tom";
    int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(int time){
        System.out.println("睡了" + time + "个小时");
        show();
        eat();
    }

    private void show(){
        System.out.println("我是一个人");
    }
}
