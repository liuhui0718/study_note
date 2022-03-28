package day12.thistest3;

public class BankTest {
    public static void main(String[] args) {


        Bank bank = new Bank();
        bank.addCustomer("力宏","王");
        bank.getCustomer(0).setAccount(new Account(4000));
        System.out.println(bank.getCustomer(0).getLastName()+bank.getCustomer(0).getFirstName() + bank.getCustomer(0).getAccount().getBalance());
        bank.addCustomer("亦非","刘");
        bank.getCustomer(1).setAccount(new Account(10000));
        System.out.println("客户" + bank.getCustomer(1).getFirstName() +"余额：" + bank.getCustomer(1).getAccount().getBalance() );


        bank.addCustomer("热巴","迪丽");
        bank.addCustomer("娜扎","古丽");


        //获取全部客户信息
        for (int i = 0; i < bank.getNumberOfCustomer(); i++) {
            bank.getCustomer(i).setAccount(new Account(4000));
            System.out.println(bank.getCustomer(i).getLastName()+bank.getCustomer(i).getFirstName() + bank.getCustomer(i).getAccount().getBalance());
        }





    }
}
