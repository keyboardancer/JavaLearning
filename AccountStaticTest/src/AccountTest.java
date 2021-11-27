public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("hehe123",5);
        Account a2 = new Account("hehe456", 5);
        Account a3 = new Account("hehe789",5);
        System.out.println("a1的账号为: " + a1.getId() +
                ", 密码为: " + a1.getPassword() + ", 最小余额为: " + Account.getMinBalance() + ", 利率为: " + Account.getInterestRate());
        System.out.println("a2的账号为: " + a2.getId() +
                ", 密码为: " + a1.getPassword() + ", 最小余额为: " + Account.getMinBalance() + ", 利率为: " + Account.getInterestRate());
        System.out.println("a3的账号为: " + a3.getId() +
                ", 密码为: " + a3.getPassword() + ", 最小余额为: " + Account.getMinBalance() + ", 利率为: " + Account.getInterestRate());
    }
}
