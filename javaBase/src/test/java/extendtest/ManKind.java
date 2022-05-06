package extendtest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/28 下午9:08
 * @Version 1.0
 */
public class ManKind {

    private int sex;
    private  int salary;





    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman(){
        if (sex ==1 ){
            System.out.println("man");
        }if (sex == 0){
            System.out.println("woman");
        }

    }

    public ManKind(){

    }
    public ManKind(int sex,int salary){
        this.salary = salary;
        this.sex = sex;
    }

    public void employeed(){
        if (salary == 0){
            System.out.println("no job");
        }else{
            System.out.println("job");
        }

    }
}
