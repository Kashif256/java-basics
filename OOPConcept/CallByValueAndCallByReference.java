package OOPConcept;

public class CallByValueAndCallByReference {
    public static void main(String[] args) {

        CallByValueAndCallByReference obj = new CallByValueAndCallByReference();
        int x = 10;
        int y = 20;
        obj.testsum(x,y);  // This method is call by value because we are passing the value of x and y to the method. The value of x and y will not change after the method call.
        //This is called "call by value" or "pass by value".
        
    }
  // Call by value method
    public int testsum(int a, int b){
        int c  = a + b ;
        System.out.println(c);
       return c ; 
    }

  // call by reference method



    
}
