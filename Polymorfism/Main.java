package Polymorfism;

@SuppressWarnings("all")

public class Main {
    public static void main(String[] args) {
        
        // Standard p = new Standard(1000);

        // The class which comes after "= new" overwrites methods from the other class 
        // when it has the same name but executes a different code: 


        Standard p2 = new Manager(1000);
    }
}
