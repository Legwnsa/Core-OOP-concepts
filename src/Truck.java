public class Truck extends Vehicle{
    public double capacity;
    public int numAxles;

    public Truck(double capacity, int numAxles, int year, String brand, Driver driver) {
        super(brand, year);
        this.capacity = capacity;
        this.numAxles = numAxles;
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
