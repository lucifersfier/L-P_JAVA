import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        // Create a new chat bot with the name "ChatBot" and an empty message
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi! What is your name ?");
        String name = scanner.nextLine();

        System.out.println("Hi! "+name+ ". I am a chatbot. Where are you from");
        String city = scanner.nextLine();

        System.out.println("I here it's beautiful at "+city+" I'm from the place called Oracle.");
        System.out.println("How old are you ?");
        int Age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("That's great ! I am also the same "+Age+" years old");
        scanner.close();
    }
    
}
