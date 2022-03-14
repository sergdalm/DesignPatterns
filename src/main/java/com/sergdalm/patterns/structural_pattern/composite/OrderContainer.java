package main.java.com.sergdalm.patterns.structural_pattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderContainer implements Order {
    private List<Order> orders = new ArrayList<>();

    @Override
    public int getPrice() {
        int sum = 0;
        for(Order order: orders) {
            if(order.getClass() == OrderContainer.class) {
                List<Order> ordersList = ((OrderContainer)order).getList();
                for(Order order1: ordersList) {
                    sum += order1.getPrice();
                }
            }
            else {
                sum += getPrice();
            }
        }
        return sum;
    }

    private List<Order> getList() {
        return orders;
    }

    void put(Order order) {
        this.orders.add(order);
    }

    void put(List<Order> orders) {
        this.orders.addAll(orders);
    }

    void put(Order... orders) {
        this.orders.addAll(Arrays.asList(orders));
    }

     void removeOrder(Order order) {
        this.orders.remove(order);
     }

}
