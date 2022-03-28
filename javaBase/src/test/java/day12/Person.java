package day12;

public class Person {

    private int age;


    public void setAge(int i){
        if (i > 0 && i< 130){
            age = i;
            System.out.println(age);
        }else{
            System.out.println("年龄不合法");
        }
    }
    public int getAge(){
        return age;
    }


}
