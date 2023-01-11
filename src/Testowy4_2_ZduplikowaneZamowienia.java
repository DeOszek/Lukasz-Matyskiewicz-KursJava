import java.util.*;

class NewOrder {

    int orderNumber;

    public NewOrder(int orderNumber) {

        this.orderNumber = orderNumber;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewOrder newOrder = (NewOrder) o;
        return orderNumber == newOrder.orderNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderNumber);
    }
}


public class Testowy4_2_ZduplikowaneZamowienia {
    public static void main(String[] args) throws java.lang.Exception {

        Set<NewOrder> orders = new HashSet<>();

        NewOrder order1 = new NewOrder(1);
        NewOrder order2 = new NewOrder(2);
        NewOrder order3 = new NewOrder(3);
        NewOrder order4 = new NewOrder(4);
        NewOrder order5 = new NewOrder(1);

        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        System.out.println(orders.size());


    }
}
