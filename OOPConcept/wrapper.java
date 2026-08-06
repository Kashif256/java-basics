package OOPConcept;

public class wrapper {
    public static void main(String[] args) {

        String a = "100";
        System.out.println(a + 20);  // the output will be '10020' not as '120'

        // suppose if u need a string into integer use wrappper method in this it has an option "Integer.parseInt" it will the parse the value to integer example is given below

        // parseInt is  a data conversion String to int

        int i = Integer.parseInt(a);
        System.out.println(i+20);  // o/p is "120" it parse the value to integer 

        // i is an wrapper class : Integer, double, boolean

        //String to double

        String b = "20.25";
        System.out.println(b + 20.25 ); // o/p will be 20.2520.25

        double j = Double.parseDouble(b);
        System.out.println(j + 20); // o/p 40.25

        // String to boolean 

        String c = "true";

        boolean k = Boolean.parseBoolean(c);
        System.out.println(k ); // true

        // int to string conversion

        int q = 200;
        System.out.println(q+ 20);  // o/p 220 

        // for conversion to int to string 

        String l =String.valueOf(q);
        System.out.println(l+20); // 20020


    }
}

