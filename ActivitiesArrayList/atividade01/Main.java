package ActivitiesArrayList.atividade01;

import java.util.ArrayList;

public class Main {
  
    public static void main(String[] args) {
          // Array:
        ArrayList<Person> dados = new ArrayList<Person>();

        // Instantiate objects: 
        Person p1 = new Person();
        p1.name = "Alice";
        p1.city = "Blumenau";
        p1.age = 19;

        Person p2 = new Person();
        p2.name = "Ricardo";
        p2.city = "Gaspar";
        p2.age = 26;

        // Add objects to array list
        dados.add(p1);
        dados.add(p2);

        for (int i = 0; i < dados.size(); i++) {
            System.out.println(dados.get(i).name);
            System.out.println(dados.get(i).city);
            System.out.println(dados.get(i).age);
            System.out.println("---------------------");
        }     

        }

}
