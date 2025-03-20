public class SuperEmployeeTest {
    public static void main(String[] args) {
        Subcontractual carpenter = new Subcontractual(2025, "de la Cruz", "Juan", 4001, "Carpenter");

        carpenter.displayInfo();
    }
}

class Subcontractual {
    private int year;
    private String lastName;
    private String firstName;
    private int contractNumber;
    private String designation;

    public Subcontractual(int year, String lastName, String firstName, int contractNumber, String designation) {
        this.year = year;
        this.lastName = lastName;
        this.firstName = firstName;
        this.contractNumber = contractNumber;
        this.designation = designation;
    }

    public void displayInfo() {
        System.out.println("Year: " + year);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Contract Number: " + contractNumber);
        System.out.println("Designation: " + designation);
    }
}