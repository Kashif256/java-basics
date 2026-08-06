package OOPConcept;

public class Car {
    // Class and object concept
    int mod;
    int wheel;
    public static void main(String[] args) {
        /*
        Car → Class name
        a → Object (reference variable)
        new Car() → Creates a new object in memory
        */
         Car a = new Car();
         Car b = new Car();
         Car c = new Car();

         // Assigning values

         a.mod = 2015;
         a.wheel = 4;
         b.mod = 2016;
         b.wheel = 4;
         c.mod = 2017;
         c.wheel= 4;
        
        // Printing the value

        System.out.println(a.mod);
        System.out.println(a.wheel);
        System.out.println(b.mod);
        System.out.println(b.wheel);
        System.out.println(c.mod);
        System.out.println(c.wheel);

        System.out.println("After shifting the reference");

        a=b;
        b=c;
        c=a;

        a.mod =110;
        System.out.println(a.mod);
        System.out.println("This is an a's reference:" + b.mod); // In this why it is not giving the value as 110 my doubt is a's reference is b right then it wanna give the value as 110 right ? Answer: It doesn't change because the b's refernce is 2017.
        c.mod= 115;
        System.out.println(a.mod);
        System.out.println("For reference: " + c.mod);
        b.mod = 15;
        System.out.println(c.mod);
    }
    
}
