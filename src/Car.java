public class Car extends Vehicle{
    public int doors;
    public String fuelType;
    public Car(int doors, String fuelType, int year, String brand, Driver driver) {
        super(brand, year);
        this.doors = doors;
        this.fuelType = fuelType;
        this.driver = driver;
    }

    @Override
    public void startEngine() {
        System.out.println("Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopped");
    }
}
