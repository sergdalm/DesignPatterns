package main.java.com.sergdalm.patterns.composite;

public class OrderDemo {
    public static void main(String[] args) {
        Item table = new Item("table", 200);
        Item chair = new Item("chair", 80);
        Item shampoo = new Item("shampoo", 10);
        Item clothes1 = new Item("dress", 50);
        Item clothes2 = new Item("jacket", 100);
        Item shoes = new Item("shoes", 130);

        Box clothesBox = new Box();
        Box furnitureBox = new Box();
        Box shoesBox = new Box();
        Box shampooBox = new Box();
        Box lamodaBox = new Box();
        Box ikeaBox = new Box();

        // put items in boxes
        furnitureBox.put(table, chair);
        shoesBox.put(shoes);
        clothesBox.put(clothes1, clothes2);
        shampooBox.put(shampoo);

        // put boxes with items in bigger boxes
        lamodaBox.put(clothesBox, shoesBox);
        ikeaBox.put(furnitureBox);

        OrderContainer orderContainer1 = new OrderContainer();
        OrderContainer orderContainer2 = new OrderContainer();
        OrderContainer bigContainer = new OrderContainer();
        orderContainer1.put(lamodaBox, shampooBox);
        orderContainer2.put(ikeaBox);
        bigContainer.put(orderContainer1, orderContainer2);


        int orderSum = bigContainer.getPrice();
        System.out.println(orderSum);


    }
}
