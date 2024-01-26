
public class Workbook4_2 {
    public static void main(String[] args) {
        tipTheWaiter(20, 19);
    }
    public static void tipTheWaiter(double payment, double bill) {
        if(payment>bill){
            System.out.println("Tip Amount will be: "+ (payment - bill));
        }

        
    }

    
}
