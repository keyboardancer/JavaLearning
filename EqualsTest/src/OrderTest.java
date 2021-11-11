public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(2, "a");
        Order order1 = new Order(2,"b");
        boolean isEquals = order.equals(order1);
        System.out.println(isEquals);
    }
}
