package homework6;

public class CarProcessor {

    Car[] cars;

    public CarProcessor(Car[] cars) {
        this.cars = cars;
    }

    public CarProcessor() {
        cars = new Car[10];
    }

    public void showBrand(String brand) {
        for (Car car : cars) {
            if (cars.length > 0 && car != null && car.brand.equals(brand.trim()))
                printCar(car);
        }
    }

    public void showYearsOfExploit(String model, int years) {
        int presentYear = 2020;
        for (Car car : cars) {
            if (cars.length > 0 && car != null && car.model.equals(model.trim()) && presentYear - car.yearManufacture > years) {
                    printCar(car);
            }
        }
    }

    public void showPriceMoreThan(int yearOfManufacture, double price) {
        for (Car car : cars) {
            if (cars.length > 0 && car != null && car.yearManufacture == yearOfManufacture && car.price > price) {
                printCar(car);
            }
        }
    }

    public void showBrand(Car[] cars, String brand) {
        for (Car car : cars) {
            if (car.brand.equals(brand.trim())) {
                printCar(car);
            }
        }
    }

    public void showYearsOfExploit(Car[] cars, String model, int years) {
        int presentYear = 2020;
        for (Car car : cars) {
            if (car.model.equals(model.trim())) {
                if (presentYear - car.yearManufacture > years) {
                    printCar(car);
                }
            }
        }
    }

    public void showPriceMoreThan(Car[] cars, int yearOfManufacture, double price) {
        for (Car car : cars) {
            if (car.yearManufacture == yearOfManufacture && car.price > price) {
                printCar(car);
            }
        }
    }

    private void printCar(Car car) {
        System.out.println(car.id + " " + car.brand + " " + car.model + " " + car.yearManufacture + " " + car.color + " " +
                car.price + " " + car.regNumber);
    }
}
