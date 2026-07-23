public class DataTypes {

    public static void main(String[] args) {

        // int
        int a = 10;
        int b = 20;

        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);

        // float
        float c = 10.5f;
        float d = 20.5f;

        System.out.println("The value of c + d is: " + (c + d));

        // char
        char grade = 'A'; //All the characters are enclosed in single quotes
        char initial = 'K';

        System.out.println("The grade is: " + grade);
        System.out.println("My initial is: " + initial);

        // double
        double e = 40.40 ; 
        System.out.println("The value of e is: " + e);

        // boolean
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("The value of b1 is: " + b1);
        System.out.println("The value of b2 is: " + b2);

        // String
        // it is a non-primitive data type
        //A String is actually an object created from the String class.
        String k = "Kash"; // String should be written in double quotes
        System.out.println("My name is: " + k);


        /*An example for learning why i cant use char for strings 
        As because in char we can store only one char but in string we can store multiple characters */
        // example program
        
        char firstLetter = 'K';
        String fullName = "Kashif";

        System.out.println(firstLetter); // K
        System.out.println(fullName);    // Kashif

    }
}