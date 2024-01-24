
public class Workbook3_3 {
    public static void main(String[] args) {
        double profit = 0;
        int numOfCustomers = 0;
        int numOfApples = 500;
        System.out.println("First customer buys 4 apples");
        numOfApples -= 4;
        numOfCustomers += 1;
        profit += 1.6;
        System.out.println("Second customer buys 20 apples");
        numOfApples -= 20;
        numOfCustomers += 1;
        profit += 8;
        System.out.println("Third Customer bought 200 apples");
        numOfApples -= 200;
        numOfCustomers +=1;
        profit += 80;
        System.out.println(profit);
        System.out.println(numOfApples);
        System.out.println(numOfCustomers);

    }
    
}
