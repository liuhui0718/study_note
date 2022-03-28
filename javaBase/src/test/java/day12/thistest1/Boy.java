package day12.thistest1;

public class Boy {
    private int age;
    private String name;


    public Boy(){

    }

    public Boy(String name,int age){
        this.name = name;
        this.age = age;

    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void marry(Girl girl){
        System.out.println("我也想娶" + girl.getName());



    }

    public void shout(){
        if (this.age > 22){
            System.out.println("我们结婚吧");
        }else{
            System.out.println("先谈恋爱吧");
        }

    }
}
