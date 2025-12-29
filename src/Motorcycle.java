public class Motorcycle extends Vehicle{
    public boolean hasSidecar;

    public Motorcycle(boolean hasSidecar, int year, String brand, Driver driver) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
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
