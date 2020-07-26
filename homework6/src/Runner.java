package homework6;

public class Runner {

    public static void main(String[] args) {

        Car[] cars = new Car[3];
        cars[0] = new Car(1, "Lexus", "RX", 2018, "Red", 118000, "UMM 721");
        cars[1] = new Car(2, "Mitsubishi", "LancerX", 2012, "Black", 22000, "ANB 892");
        cars[2] = new Car(3, "Honda", "Civic", 2015, "White", 18000, "CLF 999");

        CarProcessor processor = new CarProcessor(cars);

        processor.showBrand(cars, "Mitsubishi");
        processor.showYearsOfExploit(cars,"RX",1);
        processor.showPriceMoreThan(cars, 2015, 17000);

        CarProcessor processor1 = new CarProcessor();

        processor1.cars[0] = new Car(11, "Mercedes", "XS", 2015, "Red", 120000, "AX222");
        processor1.cars[1] = new Car(12, "BMW", "X6", 2019, "White", 100000, "AX222");
        processor1.cars[2] = new Car(13, "Honda", "Accord", 2017, "Black", 80000, "AX143");
        processor1.showYearsOfExploit("XS", 2);
        processor1.showBrand("Mercedes");
        processor1.showPriceMoreThan(2017, 70000);
    }
}
