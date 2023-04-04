import java.util.ArrayList;
import java.util.Iterator;

/* Write a Java program to iterate through all elements in an array list using
Iterator.
 */
public class Programme_5_Iterate_ArrayList {

    public static void main(String[] args) {
        // Create a new ArrayList and add some elements to it
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Purple");
        list.add("Pink");

        // Create an iterator for the ArrayList
        Iterator<String> it = list.iterator();

        // Use the iterator to print out each element in the ArrayList
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
