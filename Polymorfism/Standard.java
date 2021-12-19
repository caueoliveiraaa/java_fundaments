package Polymorfism;

public class Standard {

    // Atributes:
    double wage;

    // Constructor:
    public Standard(double wage) {
        this.wage = wage;
        transportationTicket();
        incomeTax();

    }
    
    // Methods:
    public void transportationTicket() {

        System.out.println("Standard ransportation ticket R$"+(wage*0.6));

    }

    public void incomeTax() {

        System.out.println("Standard income tax R$"+(wage*0.10));

    }

}   