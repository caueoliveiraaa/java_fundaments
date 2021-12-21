package FirstBasicActivities;
public class Loops {

    // Iniciate the system
    public static void main(String[] args){
        
        // Index
        int index = 0;

        // while loop
        while (index < 11) {
            System.out.println(index);
            index++;
        }

        // Separate loops
        System.out.println("------------------------");

        // Do While
        do {
            System.out.println(index);
            index--;
        }while(index >= 0);
        
        }
    }