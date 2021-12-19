package Polymorfism;

public class Manager extends Standard {

    // Constructor:
    public Manager(double wage) {
        super(wage);
    }

    // Method:
    public void incomeTax(){
        System.out.println("Manager's income tax: "+(wage*0.20));
    }

}
