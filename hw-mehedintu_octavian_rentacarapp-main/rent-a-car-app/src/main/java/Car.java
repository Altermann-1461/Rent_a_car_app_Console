
enum Type {
    ECONOMY,
    STANDARD,
    SUV
}
public class Car {
   private int id =0;
   private String brand;
   private String model;
   private double price;
   private Type type;
   private String color;
    public Car(){

    }
    public Car( String brand, String model, double price, Type type, String color) {

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.type = type;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", color='" + color + '\'' +
                '}';
    }
}
