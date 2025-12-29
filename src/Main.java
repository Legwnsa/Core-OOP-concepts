void main() {

    Driver d1 = new Driver("Damir", "967ADA12");
    Driver d2 = new Driver("Aidos", "123AAA12");

    Vehicle car = new Car(4, "Petrol", 2001, "Toyota", d1);
    Vehicle motorcycle = new Motorcycle(false, 2019, "Yamaha", d1);
    Vehicle truck = new Truck(12.5, 6, 2008, "Volvo", d2);

    Vehicle[] vehicles = { car, motorcycle, truck };

            for (Vehicle v : vehicles) {
                v.startEngine();
                v.displayInfo();
                v.displayDriver();
                v.stopEngine();
                System.out.println("-----------------");
            }
}
