package FirstBasicActivities;
public class Text {

    // Iniciate system:
    public static void main(String[] args){
        
        // Variable for text:
        String text = "Computation";

        // Amount of characters: 
        System.out.println("The text: " + text + " has " + text.length() + " characters");
        // The length() returns the length of a string object,
        // i.e. the number of characters stored in an object.

        // Index:
        int index = 0;

        // While loop with do will execute the code at least once:
        do {
            System.out.println(index + " - " + text.charAt(index));
            index++;
        }while(index < text.length());
        
        }
    }