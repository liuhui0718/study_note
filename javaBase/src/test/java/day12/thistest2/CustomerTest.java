package day12.thistest2;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("力宏","王");
        Account account = new Account(1000,2000,0.0123);

        customer.setAccount(account);
        customer.getAccount().deposit(100);
        System.out.println(customer.getAccount().getBalance());

        customer.getAccount().withdraw(960);
        System.out.println(customer.getAccount().getBalance());

        customer.getAccount().withdraw(2000);
        System.out.println(customer.getAccount().getBalance());


        System.out.println("Customer" +"[" + customer.getLastName()+"," + customer.getFirstname() + "]+" +
                "has a ccount: id is " + customer.getAccount().getId()+"," + "annualInterestRate is " +
                customer.getAccount().getAnnualInterestRate()+"," +"balance is" + customer.getAccount().getBalance());




    }
}
