package day22.abstracttest;

/**
 * @Author Miracle Liuhui
 * @Date 2022/4/17 下午2:09
 * @Version 1.0
 */
 public abstract class TemplateTest {
    public static void main(String[] args) {

        SubTemplate subTemplate = new SubTemplate();
        subTemplate.spendTime();


    }


}
abstract class Template{


    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(end- start);

    }

    public abstract void code();
}

class SubTemplate extends  Template{

     //1000以内的质数
    public void code() {

        for (int i = 2; i < 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
            
        }

    }
}
