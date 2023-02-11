import java.util.ArrayList;
public class Order {
    private String name;
    private boolean ready = false;
    private ArrayList<Item> items; 


    public Order(){
    this.name = "Guest";
    this.items = new ArrayList<Item>();
    }

    public Order(String name){
    this.name = name;
    this.items = new ArrayList<Item>();
    }

    // Name Getter
    public String getName() {
            return name;
        }
    
    // Name Setter
    public void setPrice(String name){
        this.name = name;
    }

    // Ready Getter
    public boolean getReady(boolean ready){
        return ready;
    }

    // Ready Setter
    public void setReady(boolean ready){
        this.ready = ready;
    }

    // add Item
    public void addItem(Item item){
        this.items.add(item);
    }

    // get Status Message
    public String getStatusMessage(){
        if(this.ready == true){
            return "Your order is ready.";

        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
            
        }
    }

    public double getOrderTotal(){
        double sum = 0;
        for (Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void display(){
        System.out.println("Customer Name:" + this.name);
        for (Item item : items){
        System.out.println(item.getName() + ":" + item.getPrice());
        }
        System.out.println("Total:" + getOrderTotal());
    }







}
