public class Driver {
    public String name;
    public String licenseNumber;
    public Driver(String name, String licenseNumber) {
        this.licenseNumber = licenseNumber;
        this.name = name;
    }
    public void displayDriverInfo() {
        System.out.println("Driver name: " + name + ", License number: " + licenseNumber);
    }
}
