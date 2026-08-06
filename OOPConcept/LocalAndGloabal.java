package OOPConcept;

public class LocalAndGloabal {
    // Global variable - class variable it is palced immediately after the class
    String name = "Kashif";
    int age = 17;
    public static void main (String[] args) {
        int i = 10;  // Local variable
        System.out.println(i);

        LocalAndGloabal obj = new LocalAndGloabal(); // if we want to use the gloabal variable inside the local variable then we have to create a object
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.sum(); // here is the calling for sum 
        
    }

    public void sum(){
        int i =1000;
        int k = 2000;
        System.out.println(i); // sum() is a non-static method, you must call it using an object.
        System.out.println(k); 
    }
    
   }