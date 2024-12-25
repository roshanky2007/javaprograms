package Variablesinjava;

public class Lifetimeofvar {
    public static void main(String[] args) {
        
        int x;
        for(x=0; x<3; x++){
            int y = 5;        // y is initialized each time block is entered
            System.out.println("y is: " + y);    
            y = 50;                                 
            System.out.println("y is now: " + y);  

        }   // y is destroyed when program exits block
    }
    
}
/*
Output:
y is: 5
y is now: 50
y is: 5
y is now: 50
y is: 5
y is now: 50 
*/