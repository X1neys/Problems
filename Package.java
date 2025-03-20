public class Package {
    private int weight;
    private char semthod;
    public double scost;


    Package(int w,char sm){
        weight = w;
        semthod = sm;
    }

    public void calculatedCost(){
        if(weight <= 8){
            switch(semthod){
                case 'A':
                    scost = 2.00;
                    break;
                case 'T':
                    scost = 1.50;
                    break;
                default:scost = 0.50;
            }
        }else if(weight <= 16){
            switch(semthod){
                case 'A':
                    scost = 3.00;
                    break;
                case 'T':
                    scost = 2.35;
                    break;
                default:scost = 1.50;
        }
    }
}
public void display(){
    calculatedCost();
    System.out.println("===================================");
    System.out.println("Package Weight: " + weight);
    System.out.println("Shipping Method: "  + semthod);
    System.out.println("Shipping Cost: " + scost);
    System.out.println("-----------------------------------");
}
}