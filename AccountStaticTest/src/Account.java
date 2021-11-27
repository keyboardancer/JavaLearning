/*
 * 编写一个类实现银行账户的概念，包含的属性有"账号"、"密码"、"存款余额"、"利率"、"最小余额",
 * 定义封装这些属性的方法，账号要自动生成，
 * 编写主类，使用银行账户类，输入，输出3个储户的上述信息。
 * 考虑，哪些属性可以设计成static属性
 * */

public class Account {
    private int id;                 //账号
    private String password = "00000000";           //密码
    private double balance;         //存款余额
    private final static double interestRate = 0.35; //利率
    private static double minBalance;   //最小余额
    private static int initId = 1001;   //初始化账号
    private final static int minBalanceInit = 5;  //初始化最小余额

    public Account() {
        id = initId++;
        minBalance = minBalanceInit;
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

}
