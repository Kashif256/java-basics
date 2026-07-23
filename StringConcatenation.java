public class StringConcatenation {

    // + operator is used to concatenate two strings or a string with any other data type.
    public static void main(String[] args) {
        int a = 100;
        int b = 200; 

        String c ="Kash";

        System.out.println("The value of a + b + c is:" + ( a + b +("Welcome to the user " + c + (" who is having the id as ")))); // 300 and sentence

        System.out.println("The value of a + b + c is:" + (("Welcome to the user " + c + (" who is having the id as ")) + a + b)); // sentence and 100200

        System.out.println("The value of a + b + c is:" + (("Welcome to the user " + c + (" who is having the id as ")) + (a + b))); // sentence and 300

        /* explanation of output in the first it take the second operation and then calculate and in second line it takes the first value and then add with a=b so the o/p become 100200 not as 300 */


        double e = 40.40;
        double e1 = 50.50;
        System.out.println("The value of e + e1 is: " + (e + e1)); // 90.9

        

    }

}
