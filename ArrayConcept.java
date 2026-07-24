public class ArrayConcept {
    // An array in Java is a data structure that stores multiple values of the same data type in a single variable. Each value is stored at a specific position called an index, starting from 0.
    
    // Objet array also in this file

    // disadvantage
    /*
    1.In array the size is fixed --> Static array-- To overcome this problem we use COLLECTION--ARRAY LIST, HASHTABLE --> Dynamic array
    2. Stores only similar value (char,string, int, double float) can be in an single array --- To overcome this we use OBJECT ARRAY
     */
    public static void main(String[] args){
        int i[] = new int[4]; // index value is 4 and starts from 0,1,2,and 3 because n-1
        i[0]=10;
        i[1]=11;
        i[2]=12;
        i[3]=13;

        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        //System.out.println(i[4]); // most important interview question Array index out of exception
        System.out.println("The length of the value is: " + i.length); // to find the length of array or size of array

        // to print each value using for loop concept
        System.out.println("For Loop concept");
        for( int j=0; j<i.length; j++){
            System.out.println("The value of i is: " + i[j]);
        }

        // this is an method or we can have an another method also for performing the array operation

        int[] num ={10,20,30,40};
        System.out.println(num[0]);

        for(int k=0 ; k <=3; k++){
            System.out.println("The value of num is:" + num[k]);
        }

        //Double array

        double d[] = new double [3];
        d[0] = 10.02;
        d[1] = 20.23;
        d[2] = 30.87;

        System.out.println("The value of index 0 is: " + (d[0] + d[1])); // array inside concatenation

        System.out.println("The value of index 1 is: " + d[1]);
        System.out.println("The value of index 2 is: " + d[2]);

        // Object
        // object is a super class of all the class
        // In object we can store multiple values

        Object ob[] = new Object[6];

        ob[0] = "Kashif";
        ob[1] = "21";
        ob[2] = "CSE";
        ob[3] = "Final Year";
        ob[5] = "Kash" ;
        ob[4] = "100004700.047";
        
        System.out.println(ob[0]);
        System.out.println(ob[1]);
        System.out.println(ob[2]);
        System.out.println(ob[3]);
        System.out.println(ob[5]);
        System.out.println(ob[4]);
    }
}
