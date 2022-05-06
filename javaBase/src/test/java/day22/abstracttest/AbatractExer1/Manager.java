package day22.abstracttest.AbatractExer1;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/15 下午3:48
 * @Version 1.0
 */
public class Manager extends Employee {


    double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus){
        this.bonus = bonus;

    }
    public void work(){
        System.out.println("管理层");
    }


}

