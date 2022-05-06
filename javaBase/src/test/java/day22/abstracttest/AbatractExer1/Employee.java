package day22.abstracttest.AbatractExer1;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/15 下午3:32
 * @Version 1.0
 */
public abstract class Employee {

    String name;
    int id;
    double salary;

    public Employee(){

    }
    public Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public  abstract void work();
}
