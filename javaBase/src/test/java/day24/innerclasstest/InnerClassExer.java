package day24.innerclasstest;

public class InnerClassExer {

    /*
    在局部内部类的方法中（比如show），如果要调用该声明的方法（比如method）的局部变量（比如age），要求此局部变量为final
    、jdk7之前，要求此局部变量显式的声明为final
    jdk8之后，final可以省略
     */


    public void method(){

        //局部变量
        int age = 20;

        class AA{

            public void show(){
              //  age = 25;
                System.out.println(age);
            }
        }


    }
}
