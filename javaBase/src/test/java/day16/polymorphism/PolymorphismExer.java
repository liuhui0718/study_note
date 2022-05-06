package day16.polymorphism;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/31 上午10:00
 * @Version 1.0
 */
public class PolymorphismExer {

    public static void main(String[] args) {
        PolymorphismExer p  = new PolymorphismExer();
        p.method(new StudentStar());

    }



    public void method(PersonStar personStar){

        //虚拟方法调用
        String info = personStar.getInfo();
        System.out.println(info);


        if (personStar instanceof Graduate){
            System.out.println("Graduate");
            System.out.println("StudentStar");
            System.out.println("PersonStar");
        }else if (personStar instanceof  StudentStar){
            System.out.println("StudentStar");
            System.out.println("PersonStar");
        }else{
            System.out.println("PersonStar");

        }
    }

}


class PersonStar {

    protected String name = "tom";
    protected int age = 18;

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age;
    }
}

class StudentStar extends PersonStar {
    protected String school = "光明";

    public String getInfo() {
        return "Name:" + name + "\n" + "age:" + age + "\nSchool:" + school;
    }


}

class Graduate extends StudentStar {

    protected String major = "IT";
    public String getInfo(){

        return "Name:" + name + "\n" + "age:" + age + "\nSchool:" + school +"\nMajor:" + major;

    }

}
