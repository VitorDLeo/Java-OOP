package entities;

public class Product {

    // Attributes
    public String name;
    public double price;
    public int quantity;


    // Methods
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

}
