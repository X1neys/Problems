public class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, String registrationNumber, double cargoCapacity) {
        super(make, model, registrationNumber);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Axles: " + cargoCapacity);
    }
}
