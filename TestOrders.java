import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
    // Create 2 orders for unspecified guests (without specifying a name);
    Order order1 = new Order();
    Order order2 = new Order();
    // Create 3 orders using the overloaded constructor to give each a name for the order.
    Order order3 = new Order("Kevin");
    Order order4 = new Order("Alfredo");
    Order order5 = new Order("Jonathan");

    Item item1 = new Item("mocha", 3.00);
    Item item2 = new Item("latte", 3.50);
    Item item3 = new Item("drip coffee", 4.00);
    Item item4 = new Item("capuccino", 4.00);

    // Add at least 2 items to each of the orders using the addItem method you wrote.
    order1.addItem(item4);
    order1.addItem(item3);

    order2.addItem(item1);
    order2.addItem(item4);

    order3.addItem(item2);
    order3.addItem(item1);

    order4.addItem(item4);
    order4.addItem(item4);

    order5.addItem(item2);
    order5.addItem(item3);
    order5.addItem(item4);

    // Test your getStatusMessage functionality by setting some orders to ready 
    // and printing the messages for each order. 

    order1.setReady(true);
    order3.setReady(true);

    System.out.println(order1.getStatusMessage());
    System.out.println(order2.getStatusMessage());

    //Test the total by printing the return value like so: 
    System.out.println(order1.getOrderTotal());

    //Finally, call the display method on all of your orders, like so:
    order3.display();

    }
}
