package day05;

/*
分支结构二：switch - case
    1,格式
    switch(表达式){
    case 常量1：
        执行语句1；
        //break；
    case 常量2：
        执行语句2；
        //break；
    ...
    default：
        执行语句n；
        //break；


        说明：
        1，根据switch-表达式中的值，依次匹配各个case中的常量，一旦匹配成功，则进入相应的case结构中，调用其执行语句。
            当调用完执行语句后，则仍然向下继续执行其他case结构中的执行语句，直到遇到break关键字或这个switch-case结构末尾为止结束

        2，break，可以使用在switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构

        3，switch中的表达式，只能是如下6中数据类型，否则编译不通过
            byte、short、int、char、枚举类型、String类型

        4，case之后只能声明常量，不能声明范围，否则编译不通过

        5，break关键字是可选的

        6，default：相当于if-else结构中的else，也是可选的
 */

public class SwitchCaseTest {
    public static void main(String[] args) {

        int num = 2;
        switch (num){
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
        }
    }
}
