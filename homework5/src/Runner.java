package homework5;

public class Runner {

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car(1, "Lexus", "RX", 2018, "Red", 118000, "UMM 721");
        cars[1] = new Car(2, "Mitsubishi", "LancerX", 2012, "Black", 22000, "ANB 892");
        cars[2] = new Car(3, "Honda", "Civic", 2015, "White", 18000, "CLF 999");

        CarProcessor processor = new CarProcessor();

        processor.showBrand(cars, "Mitsubishi");
        processor.showYearsOfExploit(cars,"RX",1);
        processor.showPriceMoreThan(cars, 2015, 17000);
    }
}
