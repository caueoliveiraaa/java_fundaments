package ObjectOriented.Encapsulamento;

public class Person {

    /*
    Encapsulation limits the usage of atributes and methods

    Visibility of atributes and methods:
    Default: Atributes and methods are visible for projects in the same folder 
    Public:  Atributes and methods are visible no matter what class call them (access from anywhere)
    Private: Atributes and methods are visible only in the class where they are created 
    Protected: Atributes and methods are visible in classes where they are created and inherited

    // Set: sends information
    // Get: returns information
    */

    // Atributes
    private String name; 
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
