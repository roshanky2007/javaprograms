public class Datatypes {
    public static void main(String[] args) 
    {   
        byte b = 15;
        short s = 150;
        int i = 1500;
        long l = 15000l;          //l is compulsory to mention for long otherwise it will be considered as int
        float f = 150000.0f;      //150000.0F is also valid (f is compulsory to mention for float otherwise it will be considered as double)    
        double d = 1500000.0;     //1500000.0d is also valid
        char c = 'A';
        String str = "Hello, World!"; // Use String for a sequence of characters
        boolean bool = true;

        System.out.println("Byte b=: " + b);
        System.out.println("Short s=: " + s);
        System.out.println("Int i=: " + i);
        System.out.println("Long l=: " + l);
        System.out.println("Float f=: " + f);  
        System.out.println("Double d=: " + d);
        System.out.println("Char c=: " + c);
        System.out.println("String str=: " + str);
        System.out.println("Boolean bool=: " + bool);
       
        System.out.println("----------------------------------------------");
    
     //This is how you can get the maximum and minimum values of the primitive data types in Java       
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);      
        System.out.println(Character.MAX_VALUE); 
        System.out.println(Character.MIN_VALUE);
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
        
    }
}
/*Output
true
false//* Byte b=: 15
Short s=: 150
Int i=: 1500
Long l=: 15000
Float f=: 150000.0
Double d=: 1500000.0
Char c=: A
String str=: Hello, World!
Boolean bool=: true
----------------------------------------------
127
-128
32767
-32768
2147483647
-2147483648
9223372036854775807
-9223372036854775808
3.4028235E38
1.4E-45
1.7976931348623157E308
4.9E-324
?     //(? =NUll char    acter  )
      //(Largest Unicode character so cant be seen in output)  
true
false*/
