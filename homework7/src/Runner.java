package homework7;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new PassengerCar("BMW", 22000, 170, 10, "Black", 3);
        cars[1] = new Truck("MAN", 79000, 150, 24, 19000, 10);
        cars[2] = new Bus("Scania", 50000, 115, 20, 4.2);

        CarPark park = new CarPark(cars);
        System.out.println(park.sumPrice());
        System.out.println(park.toString(park.getCarsBySpeed(120, 160)));
        park.sortByConsumption();
        System.out.println(park.toString(cars));
    }
}
