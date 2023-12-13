// Activity 3: Variable Naming and Type Casting

// Open your IntelliJ Idea IDE and follow the instructions below
// Create a project on IntelliJ. This time feel free to give it an appropriate name. hint We're going to be finding the area and perimeter of a circle.
// Write a java application that prompts a user to enter the diameter of a circle and calculates the area and perimeter of the circle.
// Perform a widening casting operation (integer to double) when storing the result of the operations.
// Print out the results of the two operations in the console.
// Extra features
// If you're able to implement the steps above with time to spare, check on your pair partner and ask if they need help.

import java.util.Scanner;

public class VariableNamingandTypeCasting {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the diameter of the circle: ");
        int diameter = scanner.nextInt();

        double radius = (double) diameter / 2; 
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

 
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        scanner.close();
    }
}
    
