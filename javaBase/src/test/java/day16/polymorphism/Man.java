package day16.polymorphism;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午9:16
 * @Version 1.0
 */
public class Man extends Person{
    String major;

    public Man(){

    }

    public void eat(){
        System.out.println("男生吃的多");
    }

    public boolean isSmoking(){
        System.out.println("男生要抽烟");
        return true;
    }

    public void earnMoney(){
        System.out.println("男人赚钱养家");
    }



}
