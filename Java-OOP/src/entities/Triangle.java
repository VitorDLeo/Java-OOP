package entities;
public class Triangle {
    public double a;
    public double b;
    public double c;

    public double area(){
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }

    public static class Product {

        public String name;
        public double price;
        public int quantity;

        public double totalValueInStock(){
            return price * quantity;
        }

        public void addProducts(int quantity){

        }

    }
}
