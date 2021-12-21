package Polymorfism;

public class Manager extends Standard {

    // The super keyword refers to superclass (parent) objects.
    // It is used to call superclass methods, and to access the superclass constructor
    // Constructor
    public Manager(double wage) {
        super(wage);
    }

    // Method
    public void incomeTax(){
        System.out.println("Manager's income tax: "+(wage*0.20));
    }

}
