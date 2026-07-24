public class IncrementAndDecrement {
    public static void main(String[] args){

        /*IN this increment and decrement process will occur
        1.Post increment a++ = a+1
        2.pre increment ++a = 1+a
        3.post increment a-- = a-1
        4.pre decrement  --a = 1-a 
         */

        //Post increment

        int s = 1; // Initialization
        int q = s++; // Post-increment q gets the value from the s and keep the value as q and then the s value incremented by 1 because it is an post incremental operator
        System.out.println("The value of s is: " + s); // o/p => 2
        System.out.println("The value of q is: " + q); // o/p => 1

        //Pre increment

        int a = 1; // Initialization
        int b = ++a; // In this first it increase the value 1+ a and then the b value become as 2 and the a value also become as 2.

        System.out.println("The value of a is :" +a); // o/p => a is 2
        System.out.println("The value of b is:" +b); // o/p => b is 2

        // Post Decrement

        int c = 3;  // Initialization
        int d = c--; // This is same like Post increment but in this the decremental process will occur first the d value take c's value and then decremental process will occcur
        System.out.println("The value of c is: " + c); // o/p => 2
        System.out.println("The value of d is:" + d); // o/p => 3

        // Pre Decrement

        int e = 3;  // Initialization
        int f = --e; // In this first the decrement process will occur and then f value will be assign after decrement.
        System.out.println("The value of e is: " + e); // o/p => 2
        System.out.println("The value of f is:" + f); // o/p => 2
    }
}