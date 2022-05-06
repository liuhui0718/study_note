package day16.polymorphism;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/30 上午10:32
 * @Version 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.show(new Dog());

        animalTest.show(new Cat());//Animal animal = new Cat()；
    }




    public void show(Animal animal){
        animal.eat();
        animal.shout();
        animal.number();

    }
}


class Animal {

    public void eat(){
        System.out.println("动物：吃饭");
    }
    public void shout(){
        System.out.println("动物：叫唤");
    }
    public void number(){
        System.out.println("成千上万");
    }

}


class Dog extends Animal{

    public void eat(){
        System.out.println("狗吃肉");
    }

    public void shout(){
        System.out.println("汪汪汪");
    }

    public void help(){
        System.out.println("狗看家");
    }
}
class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void shout(){
        System.out.println("喵喵喵");
    }

    public void hobby(){
        System.out.println("猫爱睡觉");

    }
}
