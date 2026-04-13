package org.example;
public class Main {
    public static void main(String[] args) {
        StringBuilder nameBuilder = new StringBuilder();

        // 1. Corrected loop syntax (added the colon)
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        String finalResult = "naman";

        // 2. Safely remove the trailing comma and space
        if (nameBuilder.length() > 0) {
            // We subtract 2 to account for both the comma and the space ", "
            finalResult = nameBuilder.substring(0, nameBuilder.length() - 2);
        }

        System.out.println(finalResult);
    }
}
public class Main {

    public static void main(String[] args) {
        // Default name
        String name = "World";

        // Check if a name is provided as a command-line argument
        if (args.length > 0) {
            name = args[0]; // Use the provided name
        }

        System.out.println("Hello, " + name + "!");
package org.example;

public class Main {
    public static void main(String[] args) { // Changed boolean to String[]
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // Iterate through the actual array of arguments
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Added a print statement so you can actually see the result!
        System.out.println(nameBuilder.toString());
    }
}
