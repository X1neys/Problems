public class StudentScholar extends Student {
    private String scholarType;
    private int discountPercentage;

    public StudentScholar(String s, String c, int a, String st, int dp) {
        super(s,c,a);
        this.scholarType = st;
        this.discountPercentage = dp;
    }

    public String getScholarType() {
        return scholarType;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }
}
