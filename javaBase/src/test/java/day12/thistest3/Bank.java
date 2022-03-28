package day12.thistest3;

public class Bank {
    private  Customer[] customers = new Customer[10];
    private  int numberOfCustomer;

    public Bank(){

    }

    //添加客户
    public void addCustomer(String f,String l){

        Customer customer = new Customer(f,l);
        customers[numberOfCustomer] = customer;

        numberOfCustomer++;

    }
    //获取客户的个数
    public  int getNumberOfCustomer(){
        return numberOfCustomer;
    }


    //获取指定位置上的客户
    public Customer getCustomer(int index){
        if (index < numberOfCustomer){
            return customers[index];
        }
        return null;
    }


}
