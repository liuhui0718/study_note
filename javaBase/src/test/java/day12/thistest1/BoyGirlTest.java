package day12.thistest1;

public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy = new Boy("梁山伯",20);

        Girl girl = new Girl("祝英台",18);
        boy.marry(girl);

        girl.marry(boy);


        System.out.println("=============");
        Girl girl1 = new Girl("马文才",18);
        int compare = girl.compare(girl1);
        if (compare > 0){
            System.out.println(girl.getName()+"大");
        }else if(compare == 0){
            System.out.println(girl.getName() + "和" + girl1.getName() +"一样大");

        }else{
            System.out.println(girl.getName()+"小");
        }

    }
}
