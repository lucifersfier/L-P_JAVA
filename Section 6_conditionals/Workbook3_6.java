
public class Workbook3_6 {
    public static void main(String[] args) {
        System.out.println("Hey! are you free today ?");
        System.out.println("Let me check my calender");
        String day = "Saturday";
        switch (day) {
            case "Monday": System.out.println("I'm not free sorry!");
                break;
            case "Tuesday": System.out.println("Its tuesday and i am working"); break;
            case "Wednesday": System.out.println("I'm very busy not today "); break;
            case "Thursday": System.out.println("Not today"); break;
            case "Friday": System.out.println("Tommorow"); break;
            case "Saturday": System.out.println("Yeah sure lets go"); break;
            default: System.out.println("Yeah its sunday and its funday so why not");
                break;
        }
    }
    
}
