import java.util.Scanner;

public class Workbook5_5 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.println("Enter your name:");
        String flname = name.nextLine();

        System.out.println("Enter your age:");
        int Age = name.nextInt();

        // Consume the newline character left in the buffer
        name.nextLine();

        System.out.println("Enter your user name:");
        String username = name.nextLine();
        name.close();
    }
}
/*          
                        Cheat Sheet


This cheat sheet contains important takeaways that lead up to section two.
1. Getting Started
class: contains all of your code.
main(): entry point of your app.
javac <file-name>.java: compiles your code.
java <file-name>: runs the compiled code.

2. Variables
Data types
There are 6 main data types (we didn't cover boolean yet).




long can store very big numbers. But, int is faster and takes less memory.




Operators




Scanner
nextLine(): scans for a String value.
nextDouble(): scans for a double value.
nextLong(): scans for a long value.
nextInt(): scans for an int value.
Coding Pitfalls
Pitfall



Put math operations in brackets if you wish to embed them inside a String.
Example: "5 + 2 is " + (5 + 2);

Pitfall



nextLine() Trap












Pitfall





nextLine() gets skipped when placed after nextInt() , nextDouble(), or nextLong().





Solution





Add a throwaway nextLine() before the "real" nextLine().





Good coding habits
class: CamelCase.
variable: lowerCamelCase.

Tips and tricks
Terminal
Use the up key to run previous terminal commands.
Write clear to clear the terminal output.
Press the tab key for auto-complete.

Escape characters
\n adds a new line of space.
\t adds a new tab of space.

Shortcut keys
Use CMD/Ctrl+/ to comment a highlighted piece of code.


 
 */