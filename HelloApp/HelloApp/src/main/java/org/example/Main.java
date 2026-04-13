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