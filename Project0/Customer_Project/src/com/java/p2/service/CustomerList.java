package com.java.p2.service;

import com.java.p2.bean.Customer;

public class CustomerList {
    private Customer[] customers;
    private int total;

    /*totalCustomer: 指定数组的长度*/
    public CustomerList(int totalCustomer) {
         customers = new Customer[totalCustomer];
    }

    /*将指定的客户添加到数组中*/
    public boolean addCustomer(Customer customer) {
        if (total >=  customers.length) {
            return false;
        } else {
            customers[total++] = customer;
            return true;
        }
    }

    /*修改指定索引位置的客户信息*/
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= total) {
            return false;
        } else {
            customers[index] = customer;
            return true;
        }
    }

    /*删除指定索引的客户信息*/
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        } else {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i+1];
            }
            customers[--total] = null;
            return true;
        }
    }

    /*获取所有客户信息*/
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i=0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /*获取指定索引位置上的元素*/
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /*获取存储的客户数量*/
    public int getTotal() {
        return total;
    }
}
