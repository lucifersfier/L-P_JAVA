public class SwitchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";
        switch (weather) {
            case "rainy": System.out.println("You should wear raincoat"); break;
            case "cloudy": System.out.println("You should wear sweater"); break;
            case "sunny": System.out.println("just wear the t=shirts"); break;
            default: System.out.println("Just wear anything");
        }
        // Section 2: User role
        int role = 2;
        switch (role) {
            case 1: System.out.println("Admin"); break;
            case 2: System.out.println("Editor"); break;
            case 3: System.out.println("User"); break;
            default: System.out.println("Doesn't matter");
        }
                
        

    }
}
