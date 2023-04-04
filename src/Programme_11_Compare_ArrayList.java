import java.util.ArrayList;
/*
11. Declare following two arrylist and compare it.

ArrayList<String> c1= new ArrayList<String>();
c1.add("Red");
c1.add("Green");
c1.add("Black");
c1.add("White");
c1.add("Pink");
ArrayList<String> c2= new ArrayList<String>();
c2.add("Red");
c2.add("Green");
c2.add("Black");
c2.add("Pink");
 */
public class Programme_11_Compare_ArrayList {
        public static void main(String[] args) {

            // Declare the two ArrayLists
            ArrayList<String> c1 = new ArrayList<String>();
            c1.add("Red");
            c1.add("Green");
            c1.add("Black");
            c1.add("White");
            c1.add("Pink");

            ArrayList<String> c2 = new ArrayList<String>();
            c2.add("Red");
            c2.add("Green");
            c2.add("Black");
            c2.add("Pink");

            // Check if c1 contains all elements of c2
            boolean result = c1.containsAll(c2);

            // Print the result
            if (result) {
                System.out.println("c1 contains all elements of c2.");
            } else {
                System.out.println("c1 does not contain all elements of c2.");
            }
        }
}
