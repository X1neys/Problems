import java.util.Scanner;

public class Register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car make: ");
        String carMake = scanner.nextLine();
        System.out.println("Enter car model: ");
        String carModel = scanner.nextLine();
        System.out.println("Enter car license plate: ");
        String carLicensePlate = scanner.nextLine();
        System.out.println("Enter number of doors: ");
        int carDoors = scanner.nextInt();
        scanner.nextLine(); 

        Car car1 = new Car(carMake, carModel, carLicensePlate, carDoors);
        car1.displayInfo();

        System.out.println();

        System.out.println("Enter truck make: ");
        String truckMake = scanner.nextLine();
        System.out.println("Enter truck model: ");
        String truckModel = scanner.nextLine();
        System.out.println("Enter truck license plate: ");
        String truckLicensePlate = scanner.nextLine();
        System.out.println("Enter number of axles: ");
        int truckAxles = scanner.nextInt();

        Truck truck1 = new Truck(truckMake, truckModel, truckLicensePlate, truckAxles);
        truck1.displayInfo();

        scanner.close();
    }
}