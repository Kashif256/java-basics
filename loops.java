public class loops{
    public static void main(String[] args){

        // 1. While Loop

        // if the incremental or decremental condition is not applied then it produces n number of output

        int i = 1; // initialization
        while( i<=10){  // condition
            System.out.println("The value of i is: " + i); 
            i = i+2; // incremental  //o/p => 1,3,5,7,9
        }

        System.out.println("************");
        int l = 10;  // initialization
        while(l>= -1){  // condition
            System.out.println(l);
            l=l-1;  // decremental //o/p=>10,9,8,7,6,5,4,3,2,1,0,-1.
        }

        // 2. For loop
        // in java j++ means j = j+1 
        for(int j=1; j<=10; j++){ //initialization, conditional part, incremental 
            System.out.println("The value of j is: " + j);  // o/p => 1,2,3,4,5,6,7,8,9,10
        }

        for(int k=10; k>=1; k--){  // o/p => 10,9,8,7,6,5,4,3,2,1
            System.out.println(k);
        }

    }
  
}

