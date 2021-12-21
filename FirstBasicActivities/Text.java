package FirstBasicActivities;
public class Text {

    // Iniciate system
    public static void main(String[] args){
        
        // Variable for text
        String text = "Computation";

        // Amount of characters
        // The length() methods returns the length of a string object,
        // i.e. the number of characters stored in an object
        System.out.println("The text: " + text + " has " + text.length() + " characters");

        int index = 0;

        // charAt = returns the char value at the specified index. An index ranges from 0 to length() - 1
        // Do/While loop will execute the code at least once
        do {
            System.out.println(index + " - " + text.charAt(index));
            index++;
        }while(index < text.length());
     
    }
}