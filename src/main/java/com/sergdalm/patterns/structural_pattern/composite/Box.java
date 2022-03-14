package main.java.com.sergdalm.patterns.structural_pattern.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box implements Order {
    private List<Order> orders = new ArrayList<>();

    public void put(Item item) {
        orders.add(item);
    }

    public void put(Box box) {
        orders.add(box);
    }

    public void put(List<Order> orders) {
        orders.addAll(orders);
    }

    public void put(Order... orders) {
        this.orders.addAll(Arrays.asList(orders));
    }

    public List<Order> getContents() {
        return orders;
    }


    @Override
    public int getPrice() {
        int sum = 0;
        for(Order order: orders) {
            if(order.getClass() == Item.class) {
                sum += order.getPrice();
            }
            else if(order.getClass() == Box.class){
                List<Order> boxList = ((Box) order).getContents();
                for(Order boxOrder : boxList) {
                    sum += boxOrder.getPrice();
                }
            }
            else {
                throw  new ClassCastException();
            }
        }
        return sum;
    }
}
