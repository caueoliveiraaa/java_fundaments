package ObjectOriented.Encapsulamento;

public class Main {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.setName("Cauê");
        obj.setAge(24);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        
    }
}
