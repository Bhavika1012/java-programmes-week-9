import java.util.ArrayList;

/*
6. Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class Programme_6_RetrieveArray {
    public static void main(String[] args) {

        // creating an ArrayList of String type
        ArrayList<String> colours = new ArrayList<>();

        // add some colors to the ArrayList
        colours.add("Red");
        colours.add("Green");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Purple");
        colours.add("Pink");

        // print the ArrayList before retrieving an element
        System.out.println("ArrayList before retrieving an element: " + colours);

        // specify the index of the element to retrieve
        int index = 2;

        // using get method to retrieve the element at specified index
        String element = colours.get(index);

        // printing the retrieved element
        System.out.println("Element at index " + index + " is: " + element);

        // printing the ArrayList after retrieving an element
        System.out.println("ArrayList after retrieving an element: " + colours);
    }
}
