package day17.downchange;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/29 下午9:16
 * @Version 1.0
 */
public class Person {
    String name;
    int age;


    public Person(){

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("人：吃饭");
    }
    public void sleep(){
        System.out.println("人散步");
    }

    public void speak(){
        System.out.println("说中国话");
    }


    //重写equals()
    //重写原则：比较两个对象的实体内容是否相同
    //手动实现equals()重写
//    public boolean equals(Object obj){
//        if (this == obj){
//            return true;
//        }
//        if (obj instanceof  Person){
//            Person person = (Person) obj;
//            if (this.age == person.age && this.name.equals(person.name)){
//                return  true;
//            }else {
//                return  false;
//            }
//
//        }
//        return false;
//    }


    //自动生成equals()方法重写


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name.equals(person.name);
    }

}
