public class Student {
    private String spn;
    private String course;
    private int age;

    public Student(String s, String c, int a) {
        this.spn = s;
        this.course = c;
        this.age = a;
    }

    public String getSPN() {
        return spn;
    }

    public String getCourse() {
        return course;
    }

    public int getAge() {
        return age;
    }
}
