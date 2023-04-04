import java.util.ArrayList;

public class Programme_7_ArrayList_Empty {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();  // Creating an ArrayList object of String type

        // Adding elements to the ArrayList
        list.add("Red");
        list.add("Blue");
        list.add("Pink");

        // Checking if the ArrayList is empty or not
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
