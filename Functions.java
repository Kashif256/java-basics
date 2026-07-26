public class Functions {
    // Function = Method
    // main is an method 
    /*  Non-static (Instance) Method.
    A non-static method belongs to an object. */
    public static void main(String[] args) {
        Functions obj = new Functions();
        //During this one object will be created, obj is the refrence of the object.
        // after creeating the object, the copy of all non static methods will be given to the static method 
        /*  which are non static method 
        example in code if we didn't mentioned as static then it is known as "non-static" method
        */ 

        // without writing the obj we cannot get the output it wil show blank value as ouptut for that we are using the object
        obj.test();
        int c = obj.kash(); // in this we want to initialize c and then want to print or else the output will not be appear.
        System.out.println(c);
        obj.k();
        int d= obj.division(18,6);
        System.out.println(d);
       
    }
     // How to create function " public void methodname "
     // void means does not return any value

     public void test(){   // no input, no output
        System.out.println("Test method");
    }

     /* public void kash(){
        int a = 20;
        int b = 10;
        int c = a+b;

        return c; // while runnig this code we will get a error like cannot retrun value on void method so to overcome this we are using the new code 
     }*/

     public int kash(){ // no input but some kind of output
        int a = 20;
        int b = 10;
        int c = a+b;

        return c; // the type of c is int so it is placed before the method.
    }

    // return type is String

     public String k(){  // no input but some output
        System.out.println("K method");
        String s = "Kashif";

        return s;
    }

    public int division(int x , int y){
        System.out.println("Division method:");
        int d = x/y;

        return d;

    }


}
