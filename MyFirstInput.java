
// Activity 1 (Introduction): My First Input

// Open your IntelliJ Idea IDE and follow the instructions below
// Create a project called 'MyFirstInput'
// Create a class called MyFirstInput
// Add a main method to your app.
// Make your code looks like the file shown below
// package com.generation.java;
import java.io.Console;

class MyFirstInput {
 public static void main(String[] args) {
   Console console = System.console();
   System.out.println("Please enter your name ");
   String name = console.readLine();

   System.out.println("My name is "+ name);
 }

    
}
