package extendtest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/28 下午9:08
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;


    public  Kids(){

    }

    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }
    public void printAge(){
        System.out.println("i am "+yearsOld + "year old");
    }
}
