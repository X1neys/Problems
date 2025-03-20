public class StudentTest {
    public static void main(String[] args) {
        StudentScholar Maria = new StudentScholar("CS1014770","Computer Science",17,"SM",75);
        
        System.out.println("Student Personal Number: " + Maria.getSPN());
        System.out.println("Course: " + Maria.getCourse());
        System.out.println("Age: " + Maria.getAge());
        System.out.println("Scholarship Type: " + Maria.getScholarType());
        System.out.println("Discount %: " + Maria.getDiscountPercentage());
    }
}