package homework7;

public class CarPark {

    private Car[] cars;

    public CarPark(Car[] cars) {
        this.cars = cars;
    }

    public double sumPrice() {
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum;
    }

    public void sortByConsumption() {
        Car temp;
        for (int i = 0; i < cars.length; i++){
            for (int j = 1; j < cars.length; j++) {
                if (cars[j - 1].getFuelConsumption() > cars[j].getFuelConsumption()) {
                    temp = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }

    public Car[] getCarsBySpeed(double minSpeed, double maxSpeed) {
        Car[] resultArray = new Car[0];
        int resultArrayIndex = 0;
        for (int i = 0; i < cars.length; i++) {
            double carMaxSpeed = cars[i].getMaxSpeed();
            if (carMaxSpeed > minSpeed && carMaxSpeed < maxSpeed) {
                resultArray = increaseArray(resultArray);
                resultArray[resultArrayIndex] = cars[i];
                resultArrayIndex++;
            }
        } return resultArray;
    }

    private Car[] increaseArray(Car[] cars) {
        Car[] tempArray = new Car[cars.length + 1];
        for(int i = 0; i < cars.length; i++) {
            tempArray[i] = cars[i];
        } return tempArray;
    }

    public String toString(Car[] cars) {
        int iMax = cars.length - 1;
        StringBuilder b = new StringBuilder();
        b.append("\n");
        int i = 0;

        while(true) {
            b.append((cars[i]));
            if (i == iMax) {
                return b.append(" ").toString();
            }

            b.append("\n");
            ++i;
        }
    }
}
