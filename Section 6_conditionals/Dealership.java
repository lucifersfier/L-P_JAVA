import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" - Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a car");
        System.out.println(" - Select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a": System.out.println("You want to buy a car");
            System.out.println("What is your budget?");
            int budget = scan.nextInt();
            scan.nextLine();
        // budget greater than or equal to 10000
            if(budget>=10000){
                System.out.println("Great! A Nissan Altima is available");
                System.out.println("Do you have insurance? Write 'yes' or 'no'");
                String insurance = scan.nextLine();
                switch (insurance) {
                    case "yes": System.out.println("Great you have an insurance"); break;
                    default: System.out.println("You can't buy this car because of no insurance");
                        break;
                }
                System.out.println("Do you have a license? Write 'yes' or 'no'");
                String license = scan.nextLine();
                switch (license) {
                    case "yes": System.out.println("Great you have a license means you are eligible to drive"); break;
                    default: System.out.println("Sorry but you should apply for the license first");
                        break;
                }
                System.out.println("What is your credit score?");
                int creditScore = scan.nextInt();
                if(creditScore > 660){
                    System.out.println("Congratulations, you are eligible for the loan");
                }
                else{
                    System.out.println("You're not eligible for the loan");
                }
        // if they have insurace, a license, and credit score greater than 660
                if(insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                    System.out.println("Sold! Pleasure doing business with you");
                }
                else{
                    System.out.println("We're sorry. You are not eligible");
                }
            }
            else{
                System.out.println("Your budget is too low. Please come back when you have more");
            }
                break;
            case "b": System.out.println("you want to sell a car");
            System.out.println("What is your car valued at?");
            int value = scan.nextInt();
            System.out.println("What is your selling price?");
            int price = scan.nextInt();
            if(value>10000 && price<30000){
                System.out.println("We will buy your car. Pleasure doing business with you!");
            }
        // value is greater than price and price is less than 30000
            else{
                System.out.println("Sorry, we're not interested.");
            }
                break;
            default: System.out.println("invalid option");
        }
        
        //otherwise
        scan.close();
        }
    }

