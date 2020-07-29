package homework7;

public class Truck extends Car {

    private double weight;
    private double length;

    public Truck(String brand, double price, double maxSpeed, int fuelConsumption, double weight, double length) {
        super(brand, price, maxSpeed, fuelConsumption);
        this.weight = weight;
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString() + " Weight: " + weight + " Length: " + length;
    }
}
