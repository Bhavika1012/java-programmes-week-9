import java.util.HashMap;

/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {
        public static void main(String[] args) {

            HashMap<String, Integer> people = new HashMap<>(); // Create a HashMap to store String keys and Integer values

            //Storing string and integer values
            people.put("John", 21);
            people.put("Sophie", 25);
            people.put("Smith", 27);

            for (Integer age : people.values()) {  //getKey() and getValue() methods to print names and associated numbers
                System.out.println("Age: " + age);
            }
        }
}
