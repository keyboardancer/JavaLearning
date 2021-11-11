import java.util.Objects;

public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        //System.out.println("***************");
        if (this == o) {
            return true;
        }
        if (o instanceof Order) {
            //System.out.println("!!!!");
            return this.orderId == ((Order) o).getOrderId() && this.orderName.equals(((Order) o).getOrderName());
        } else {
            return false;
        }
    }


}
