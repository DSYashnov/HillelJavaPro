package hw_10.coffee.order;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class CoffeeOrderBoard {
    private List<Order> orderList = new ArrayList<>();
    private int nextOrderNumber = 1;

    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        // Додаємо замовлення
        board.add("Stanislav");
        board.add("Anastasiya");
        board.add("Dmitriy");

        // Виводимо всі замовлення
        board.draw();

        // Виконуємо найстаріше замовлення
        board.deliver();
        board.draw();

        // Виконуємо замовлення за номером
        board.deliver(2); // Видає замовлення з номером 2 (Anastasiya)
        board.draw();
    }


    public void deliver (){
        if(!orderList.isEmpty()) {
            Order deliveredOrder = orderList.remove(0);
            System.out.println("Delivered (is order): " + deliveredOrder);
        } else {
            System.out.println("No orders to deliver");
        }
    }

    public Order add(String name){
        Order order = new Order(nextOrderNumber++, name);
        return order;
    }
    public void deliver (int orderNumber) {
        Optional<Order> orderToDeliver = orderList.stream().filter(order -> order.getNumber() == orderNumber).findFirst();
        if (orderToDeliver.isPresent()) {
            orderList.remove(orderToDeliver.get());
            System.out.println("Delivered (by numbers): " + orderToDeliver.get());
        } else {
            System.out.println("Order with number " + orderNumber + " not found.");
        }
    }
    public void draw () {
        if (orderList.isEmpty()) {
            System.out.println("New orders in the queue.");
        } else {
            System.out.println("Current orders in queue");
            for (Order orders : orderList) {
                System.out.println(orders);
            }
        }
    }
}
