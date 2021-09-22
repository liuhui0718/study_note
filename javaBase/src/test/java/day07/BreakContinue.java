package day07;
/*
break 和 continue 关键字的使用

                            使用范围                         循环中使用的作用（不同点）              相同点
break                   switch-case
                        循环结构中                             结束当前循环                    关键字之后不能有执行语句


continue                    循环结构中                         结束当次循环
 */
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==4){
                //break;//输出结果0，1，2，3
                continue;//输出结果0，1，2，3，5，6，7，8，9
                //System.out.println("我真帅");  编译不通过
            }
            //System.out.println(i);
        }
        int num = 2;
        switch (num){
            case 1 :
                System.out.println(1);
            case 2 :
                System.out.println(2);
                break;
            case 3 :
                System.out.println(3);
            case 4 :
                System.out.println(4);
            case 5 :
                System.out.println(5);


        }

    }
}
