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
