public class Method {
    public static void main(String[] args) {
        Method obj = new Method();
        obj.sum();
        obj.sum(10);
        obj.sum(30,20);
        
    }
    // cannot create a method inside the method
    // Duplicate methods -- i.e, same method with same number of arguments are not allowed
    
    // method overlapping--> when the method name is same with different arguments or input parameter within the same class.
    public void sum(){ // 0 input parameter
        System.out.println("Sum method -- zero parameter:");
    }
    public void sum(int i){ // 1 input parameter
        System.out.println("1 input parameter");
        System.out.println(i);
    }
    public void sum(int k, int j){ // 2 input parameter
        System.out.println("2 method parameter");
        System.out.println(k+j);
    }
}
