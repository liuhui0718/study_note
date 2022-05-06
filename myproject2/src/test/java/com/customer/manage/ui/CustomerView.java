package com.customer.manage.ui;

import com.customer.manage.bean.Customer;
import com.customer.manage.scanner.Utils;
import com.customer.manage.service.CustomerList;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/28 下午2:28
 * @Version 1.0
 * 主模块，负责菜单的显示和处理用户操作
 */
public class CustomerView {

    private CustomerList customerList = new CustomerList(10);

    Utils utils = new Utils();


    public CustomerView() {
        Customer customer = new Customer("张三", '男', 18, "110", "345");

        customerList.addCustomer(customer);


    }

    /**
     * 显示客户信息管理软件的操作
     */

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {

            System.out.println("------------------客户信息管理软件-------------------");
            System.out.println("                    1 添加客户");
            System.out.println("                    2 修改客户");
            System.out.println("                    3 删除客户");
            System.out.println("                    4 客户列表");
            System.out.println("                    5 退   出");
            System.out.println("        请选择1-5：");

            int menu =  utils.inner();
            switch (menu){
                case 1:
                    addNewCustomer();
                    break;
                case 2:
                    modifyCustomer();
                    break;

                case 3:
                    deleteCustomer();
                    break;
                case 4:
                    listAllCustomers();
                    break;
                case 5:
                    System.out.println("退出");

            }
        }

    }

    /**
     * 添加客户的操作
     */

    private void addNewCustomer() {


    }


    /**
     * 修改客户的操作
     */
    private void modifyCustomer() {

    }

    /**
     * 删除客户的操作
     */

    private void deleteCustomer() {

    }

    /**
     * 查找客户的操作
     */

    private void listAllCustomers() {
        System.out.println("----------------------客户列表----------------------");
        if (customerList.getTotal() == 0) {

            System.out.println("没有客户记录");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer[] cust = customerList.getAllCustomer();
            for (int i = 0; i < customerList.getTotal(); i++) {
                Customer custs = cust[i];
                System.out.println((i + 1) + "\t" + custs.getName() + "\t" + custs.getGender() + "\t" + custs.getAge() + "\t" + custs.getPhone() + "\t" + custs.getEmail());

            }

        }


        System.out.println("------------------客户列表完成----------------------");
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();


        customerView.enterMainMenu();
        customerView.utils.inner();


    }
}
