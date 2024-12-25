/*This is type conversion
*This converts lower data type to higher data type is called inplicit type conversion
*short -> int -> long -> float -> double
*This is Type casting
*This converts higher data type to lower data type is called explicit type conversion
*double -> float -> long -> int -> short -> byte
*char and boolean are not compatible with other data types for type casting
*/
public class TypeConAndCasting {
    public static void main(String[] args) {
        // Implicit type casting
        int a = 10;
        long b = a; // Implicit type casting (int to long)
        float c = b; // Implicit type casting (long to float)
        System.out.println("Type conversion: " + a + " " + b + " " + c);

        // Explicit type casting
        double d = 100.04;
        long e = (long) d; // Explicit type casting (double to long)
        int f = (int) e; // Explicit type casting (long to int)
        System.out.println("Type casting: " + d + " " + e + " " + f);
    }
}

// char and boolean are not compatible with other data types for type casting

/*
 * Output
 * Type conversion: 10 10 10.0
 * Type casting: 100.04 100 100
 */