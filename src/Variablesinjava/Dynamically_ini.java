package Variablesinjava;

public class Dynamically_ini {
    public static void main(String[] args) {
        double pi = 3.14;   //Not dynimically initialized
        double radius = 5;  
        double area = pi * radius * radius; // Dynamically initialized
        System.out.println("The area of the circle is: " + area);
        
    }


}
    
/*Output:
The area of the circle is: 78.5
*/