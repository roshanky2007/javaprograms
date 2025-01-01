package Arrays;
import java.util.Scanner;

public class Array_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] Numbers = new int[size];

        // Read input values into the array
        System.out.println("Enter " + size + " integers:");
        for(int i = 0; i < size; i++) {
            Numbers[i] = sc.nextInt();
        }

        // Print the values in the array
        System.out.println("The values in the array are:");
        System.out.println(); // Print a blank line
        for(int i = 0; i < size; i++) {
            System.out.println(Numbers[i]);
        }

        sc.close();
    }
}
//output:
//Enter the size of the array: 5
//enter 5 integers:
//1
//2
//3
//4
//5
//The values in the array are:
//1
//2
//3