import java.util.Arrays;

/*
Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ReverseArray {
    public static void main(String[] args) {

    // Initializing an array of integers
    int[] a = {1, 2, 3, 4, 5};

    // Printing the original array using the toString() method of the Arrays class
        System.out.println("Original array: " + Arrays.toString(a));

    // Looping through the array
        for (int i = 0; i < a.length / 2; i++) {

        // Swapping the elements using a temporary variable
        int b = a[i]; // Store the value of the current element in a temporary variable
        a[i] = a[a.length - 1 - i]; // Replace the current element with the element from the end of the array
        a[a.length - 1 - i] = b; // Replace the element from the end of the array with the value of the temporary variable
    }

    // Printing the reversed array using the toString() method of the Arrays class
        System.out.println("Reversed array: " + Arrays.toString(a));

}
}
