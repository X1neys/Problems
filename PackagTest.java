public class PackagTest{
    public static void main(String[] args) {
        
        Package p1 = new Package(2, 'M');
        Package p2 = new PackageInsured(12, 'T');
        Package p3 = new PackageInsured(25, 'A');
        p1.display();
        p2.display();
        p3.display();
    }
}