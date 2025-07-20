package Arrays;

public class Student_Marks {
    public static void main(String[] args) {
        int[] marks = new int[5]; // Array declaration and new keyword is used to create an array
     // int marks[] = new int[5]; // Another way of declaring an array
     // int marks[] = {100,90,80,70,60}; // Another way of declaring and initializing an array
        marks[0]=100;   //Array initialization and assignment
        marks[1]=90;    
        marks[2]=80;
        marks[3]=70;
        marks[4]=60;
        System.out.println("Marks of student 1: " + marks[0]);
        System.out.println("Marks of student 2: " + marks[1]);
        System.out.println("Marks of student 3: " + marks[2]);
        System.out.println("Marks of student 4: " + marks[3]);
        System.out.println("Marks of student 5: " + marks[4]);

        /*OR you can use for loop to print the marks of all students
         for(int i=0;i<5;i++){
             System.out.println("Marks of student "+(i+1)+": "+marks[i]);
         }*/
    
    }
    
}
/*
 * Output
 * Marks of student 1: 100
 * Marks of student 2: 90
 * Marks of student 3: 80
 * Marks of student 4: 70
 * Marks of student 5: 60
 */




























