package homework7;

public class PassengerCar extends Car {

    private String color;
    private int numberOfPas;

    public PassengerCar(String brand, double price, double maxSpeed, int fuelConsumption, String color, int numberOfPas) {
        super(brand, price, maxSpeed, fuelConsumption);
        this.color = color;
        this.numberOfPas = numberOfPas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPas() {
        return numberOfPas;
    }

    public void setNumberOfPas(int numberOfPas) {
        this.numberOfPas = numberOfPas;
    }

    @Override
    public String toString() {
        return super.toString() + " Color: " + color + " Number of Passengers: " + numberOfPas;
    }
}
