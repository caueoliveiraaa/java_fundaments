package ActivitiesArrayList.Activity01;

import java.util.ArrayList;

public class Main {
  
    public static void main(String[] args) {

        // Array:
        ArrayList<Person> data = new ArrayList<Person>();

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
        data.add(p1);
        data.add(p2);

        for (int i = 0; i < data.size(); i++) {

            System.out.println(data.get(i).name);
            System.out.println(data.get(i).city);
            System.out.println(data.get(i).age);
            System.out.println("---------------------");
            
        }     

        }

}
