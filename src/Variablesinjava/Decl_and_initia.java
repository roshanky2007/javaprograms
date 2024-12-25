package Variablesinjava;

public class Decl_and_initia {
    public static void main(String[] args) {
        // Declaring and initializing a variable
        int a;      // Declaration
        a = 10;     // Initialization
        System.out.println("The value of a is: " + a);

        // Declaring and initializing multiple variables
        int b = 20, c = 30;
        System.out.println("The value of b is: " + b);
        System.out.println("The value of c is: " + c);

        // Declaraing and initializing a variable with a value of another variable
        int d = a;
        System.out.println("The value of d is: " + d);
    }   
}

/*Output
The value of a is: 10
The value of b is: 20
The value of c is: 30
The value of d is: 10
*/ 
