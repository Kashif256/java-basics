package OOPConcept;

public class StaticAndNonStatic {
    String name ="Kash"; // non static function
    static int age = 25; // static function how to create this just add static 

    public static void main(String[] args){
        // How to call static methods and vars ?
        // 1. Direct calling 
        addition();   // For both of this got the same o/p as "addition"

        // 2. using class name 
        StaticAndNonStatic.addition(); // For both of this got the same o/p as "addition"

        System.out.println(age); // 25 direct calling
        System.out.println(StaticAndNonStatic.age); // 25 direct calling

        // 3 can i access the static method with use of object
        StaticAndNonStatic obj2 = new StaticAndNonStatic();
        obj2.addition(); // it will give the ouptut but it shows an warning for betteer understanding dont use this way to call static method with the help of object

        // How to call non-static methods ?
        // using obj 

       StaticAndNonStatic obj= new StaticAndNonStatic(); // for calling non-static value first wanna create obj and then we want to call 
       obj.sum();
       StaticAndNonStatic obj1 = new StaticAndNonStatic(); // Create another object
       obj1.name = "Kashif"; // for calling non-static value first wanna create obj and then we want to call
       System.out.println(obj1.name);
       System.out.println(obj.name);
       
    }

    public  void sum(){  // non static function
        System.out.println("sum");
    }

    public static void addition(){  // static function
        System.out.println("Addition");
    }
}
