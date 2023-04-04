import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
 */
public class Programme_4_Collection {
    public static void main(String[] args) {
        // Creating a new ArrayList to store color strings
        ArrayList<String> colourList = new ArrayList<>();

        // Adding some colors to the ArrayList using the add() method
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Blue");
        colourList.add("Yellow");
        colourList.add("Pink");

        // Printing the colorList using for-each loop
        System.out.println("Colors in the list:");

        for (String color : colourList) { //for each loop
            System.out.println(color);
        }

    }
}
