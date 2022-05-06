package com.customer.manage.service;

import com.customer.manage.bean.Customer;

/**
 * @Author Miracle Liuhui
 * @Date 2022/3/28 下午2:26
 * @Version 1.0
 * customer对象的管理模块，提供对应的增删改查，供CustomerView调用
 */
public class CustomerList {

    private Customer[] customers;//用来保存客户数量的数组
    private int total = 0 ; //记录已经保存客户对象的数量




    /**
     * 用来初始化Customers数组的构造器
     * @param totalCustomer ：指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];

    }

    /**
     * 添加用户信息
     * @param customer
     * @return
     */

    public boolean addCustomer(Customer customer){
        if (total > customers.length){
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }

    /**
     * 修改客户信息
     * @param index
     * @param cust
     * @return
     */

    public boolean replaceCustomer(int index,Customer cust){
        if (total < 0 && index >= total){
            return false;
        }else {
            customers[index] = cust;
            return  true;
        }
    }

    /**
     * 删除客户信息
     * @param index
     * @return
     */

    public  boolean deleteCustomer(int index){
        if (total < 0 && index >= total){
            return false;
        }else {
            for (int i = 0; i < total-1 ; i++) {
                customers[i] = customers[i+1];
            }
        }
        //最后一个元素置为null
        customers[total-1] = null;
        total--;
        return  true;


    }

    /**
     * 获取所有客户信息
     * @return
     */

    public Customer[] getAllCustomer(){
        Customer[] cust = new Customer[total];
        for (int i = 0; i <total-1 ; i++) {
            cust[i] = customers[i];
        }
        return cust;

    }

    /**
     * 获取指定位置的客户信息
     * @param index
     * @return
     */
    public Customer getCustomer(int index){

        if (index<0 || index >= total){
            return null;
        }
        return customers[index];


    }

    /**
     * 获取客户的数量
     * @return
     */

    public  int getTotal(){
        return  total;

    }


}










