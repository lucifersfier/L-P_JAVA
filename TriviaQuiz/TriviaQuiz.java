import java.util.Scanner;
public class TriviaQuiz {
    public static void main(String[] args) {
        System.out.println("Which country held the 2016 olympics ?");
        Scanner scan = new Scanner(System.in);
        int a = 0;
        String answer = scan.nextLine();
        switch (answer) {
            case "India": System.out.println("Right Answer");
            a=a+4;
                break;
            default: System.out.println("wrong Answer");
                break;
        }
        System.out.println("What is the capital of France?");
        String cap = scan.nextLine();
        switch (cap) {
            case "Paris": System.out.println("Right answer");
            a=a+4;
                break;
            default: System.out.println("Wrong Answer");
                break;
        }
        System.out.println("Total Score is "+a);

    }
    
}
