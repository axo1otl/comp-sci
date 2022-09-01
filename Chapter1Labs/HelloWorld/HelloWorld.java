package HelloWorld;

// Matheus Sekiguchi
// August 31, 2022
// Objective: Break down syntax of a simple program

public class HelloWorld {    //Class header, curly brace opens the class
    public static void main(String[] args) {    // The method header. void means "return nothing", its a return type. main allows the program to run. Inside the parentheses are the paramaters, String is a class, [] is an array, args is the name of the parameters, this argument says "An array of strings called args"
        System.out.println("Hello, World!");    // System is a class. A period is called a dot-operator. out is an object, it is accessing the print method. print is a method that writes to the console. The semicolon tells the compiler where the line ends.
        System.out.println("My school laptop works!");
    } // Closes method
}    //Closes the class

/*
A compile error happens when the program does not have the right instructions (like deleting void)
An execute error happens when the program does not have a class to execute (remove public, some programs do default to public)
A logical error happens is a user made error
A syntax error happens when an unclosed bracket or quote is in the code
*/