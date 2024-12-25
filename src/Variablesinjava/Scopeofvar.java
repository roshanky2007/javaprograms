package Variablesinjava;

public class Scopeofvar {
    public static void main(String[] args) {
        int x = 10;         // x is known to all code within the main method
        if (x==10){
            int y = 20;     // y is only known to this block
            System.out.println("x and y are: " + x + " and " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here
        System.out.println("x is: " + x);
    }
    
}
/*
Output:
x and y are: 10 and 20
x is: 40
*/