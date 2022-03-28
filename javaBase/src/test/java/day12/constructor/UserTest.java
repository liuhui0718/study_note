package day12.constructor;


/**
 * 总结：属性赋值的先后顺序
 *
 * 1，默认初始化
 * 2，显式初始化
 * 3，构造器中赋值
 * 4，通过"对象.方法"或者"对象.属性"的方法进行赋值
 *
 */
public class UserTest {

    public static void main(String[] args) {

        User user1 = new User();
        //对象.属性进行赋值
        user1.name = "Tom";

        System.out.println(user1.name);


        //构造器中赋值
        User user = new User("sony");
        System.out.println(user.name);






        //对象.方法进行赋值
        user1.setAge(4);
        user1.getAge();

    }

}



class User{

    //默认初始化
    String name;

//  显式初始化
     private int age =1;

     public User(){

     }


    public User(String n){
        name = n;
    }


    public void setAge(int a){
        age = a;
    }


    public int getAge(){
        return age;
    }


}
