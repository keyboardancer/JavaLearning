package com.java.p2.ui;

import com.java.p2.bean.Customer;
import com.java.p2.service.CustomerList;
import com.java.p2.util.CMUtility;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("小白", '男', 18, "13312312343", "test@gmail.com");
        customerList.addCustomer(customer);
    }
    //显示该软件界面的方法
    public void enterMainMenu() {

        boolean isFlag = true;
        while (isFlag) {
            System.out.println("--------------------------客户信息管理软件---------------------------");
            System.out.println("                            1 添加客户");
            System.out.println("                            2 修改客户");
            System.out.println("                            3 删除客户");
            System.out.println("                            4 客户列表");
            System.out.println("                            5 退 出\n");
            System.out.println("                            请选择(1-5):");

            char menu = CMUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;

                case '3':
                    deleteCustomer();
                    break;

                case '4':
                    listAllCustomers();
                    break;

                case '5':
                    System.out.println("是否确认退出(Y/N): ");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y' || isExit == 'y') {
                        isFlag = false;
                    }
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("-----------------------------------添加客户----------------------------------");
        System.out.print("姓名: ");
        String name = CMUtility.readString(10);
        System.out.print("性别: ");
        char gender = CMUtility.readChar();
        System.out.print("年龄: ");
        int age = CMUtility.readInt();
        System.out.print("电话: ");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱: ");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------------添加完成--------------------");
        } else {
            System.out.println("---------------------添加失败--------------------");
            return;
        }
        System.out.println("-----------------------------------添加客户完成----------------------------------");

    }

    private void modifyCustomer() {
        System.out.println("-----------------------------------修改客户----------------------------------");
        Customer cust;
        int number;
        for (;;) {
            System.out.println("请选择待修改的客户编号(-1退出): ");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户! ");
            } else {
                break;
            }
        }

        //修改客户信息
        System.out.println("姓名(" + cust.getName() + "): ");
        String name = CMUtility.readString(10, cust.getName());

        System.out.println("性别(" + cust.getGender() + "): ");
        char gender = CMUtility.readChar();

        System.out.println("年龄(" + cust.getAge() + "): ");
        int age = CMUtility.readInt();

        System.out.println("电话(" + cust.getPhone() + "): ");
        String phone = CMUtility.readString(11, cust.getPhone());

        System.out.println("邮箱(" + cust.getEmail() + "): ");
        String email = CMUtility.readString(30, cust.getEmail());

        Customer newCust = new Customer(name, gender, age, phone, email);
        boolean isReplaced = customerList.replaceCustomer(number - 1, newCust);
        if (isReplaced) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }

    private void deleteCustomer() {
        System.out.println("-----------------------------------删除客户-----------------------------------");
        int number;
        for (;;) {
            System.out.println("请选择待删除的客户编号(-1退出): ");
            number = CMUtility.readInt();
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }

        //找到指定客户，开始删除
        System.out.println("确认是否删除(Y/N): ");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if (deleteSuccess) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        }
    }

    private void listAllCustomers() {
        System.out.println("-----------------------------------客户列表----------------------------------");

        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录");
        } else {
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t\t邮箱");
            Customer[] customers = customerList.getAllCustomers();
            for (int i=0; i < customers.length; i++) {
                System.out.println((i+1) + "\t\t" + customers[i].getName() + "\t\t" +
                        customers[i].getGender() + "\t\t" + customers[i].getAge() + "\t\t" +
                        customers[i].getPhone() + "\t\t" + customers[i].getEmail());

            }
        }
        System.out.println("-----------------------------------客户列表完成----------------------------------");
    }
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
