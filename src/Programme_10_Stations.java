import java.util.HashMap;
import java.util.Scanner;

/*
10. Write a programme that tells you which line passes through particular stations.
Just use Zone 1 stations name.
 */
public class Programme_10_Stations {
    public static void main(String[] args) {
        char result; // declaring variable

        System.out.println("Here is a list of Zone 1 Stations : ");
        // output of list of the stations in zone 1
        System.out.println("");
        System.out.println("ALDGATE, EUSTON SQUARE, OXFORD CIRCUS, WATERLOO, TOWER HILL, OLD STREET,");
        System.out.println("SOUTH KENSINGTON, VICTORIA, LANCASTER GATE, GREEN PARK, FARRINGDON, EDGWARE ROAD,");
        System.out.println("QUEENSWAY, KINGS CROSS ST PANCREAS, VAUXHALL, EUSTON, BAYSWATER, ANGEL, PADDINGTON,");
        System.out.println("BAKER STREET, KNIGHTBRIDGE, CHARING CROSS, GLOUCESTER ROAD, REGENTS PARK, HYDE PARK CORNER,");
        System.out.println("LEICESTER SQUARE, LONDON BRIDGE, PICCADILLY CIRCUS, MOORGATE, ST PAUL'S, WESTMINSTER, HOLBORN,");
        System.out.println("COVENT GARDEN, BOND STREET, MARBLE ARCH, TOTTENHAM COURT ROAD, RUSSELL SQUARE,");

        System.out.println("");

        HashMap<String, String> lines = new HashMap<>(); //Creating object for stations and train line names
        // adding elements into lines
        lines.put("ALDGATE", "Circle/Metropolitan");
        lines.put("ANGEL", "Northern");
        lines.put("BAKER STREET", "Bakerloo/Circle/Hammersmith & City/Jubilee/Metropolitan");
        lines.put("BAYSWATER", "Circle/District");
        lines.put("BOND STREET", "Circle/Jubilee");
        lines.put("CHARING CROSS", "Northern/Bakerloo");
        lines.put("COVENT GARDEN", "Piccadilly");
        lines.put("EDGWARE ROAD", "Circle/District/Hammersmith & City");
        lines.put("EUSTON", "Victoria/Northern");
        lines.put("EUSTON SQUARE", "Metropolitan/Hammersmith & City/Circle");
        lines.put("FARRINGDON", "Circle/Hammersmith & City/Metropolitan");
        lines.put("GLOUCESTER ROAD", "District/Circle/Piccadilly");
        lines.put("GREEN PARK", "Jubilee/Piccadilly/Victoria");
        lines.put("HOLBORN", "Central/Piccadilly");
        lines.put("HYDE PARK CORNER", "Piccadilly");
        lines.put("KINGS CROSS ST PANCREAS", "Circle/Piccadilly/Hammersmith & City/Northern/Metropolitan/Victoria");
        lines.put("KNIGHTBRIDGE", "Piccadilly");
        lines.put("LANCASTER GATE", "Central");
        lines.put("LEICESTER SQUARE", "Northern/Piccadilly");
        lines.put("LONDON BRIDGE", "Northern/Jubilee");
        lines.put("MARBLE ARCH", "Central");
        lines.put("MOORGATE", "Circle/Hammersmith & City/Metropolitan/Northern");
        lines.put("OLD STREET", "Northern");
        lines.put("OXFORD CIRCUS", "Bakerloo/Central/Victoria");
        lines.put("PADDINGTON", "Hammersmith & City/Bakerloo/District/Circle");
        lines.put("PICCADILLY CIRCUS", "Piccadilly/Bakerloo");
        lines.put("QUEENSWAY", "Central");
        lines.put("REGENTS PARK", "Bakerloo");
        lines.put("RUSSELL SQUARE", "Piccadilly");
        lines.put("SOUTH KENSINGTON", "District/Circle/Piccadilly");
        lines.put("ST PAUL'S", "Central");
        lines.put("TOTTENHAM COURT ROAD", "Central/Northern");
        lines.put("TOWER HILL", "District/Circle");
        lines.put("VAUXHALL", "Victoria");
        lines.put("VICTORIA", "District/Circle");
        lines.put("WATERLOO", "Bakerloo/Jubilee/Northern");
        lines.put("WESTMINSTER", "Circle/District/Jubilee");

        Scanner scanner;
        do { //do-while loop
            scanner = new Scanner(System.in);
            System.out.println("Enter any station name from the list above : ");

            String name = scanner.nextLine();  //User will enter station name.
            name = name.toUpperCase(); // converting input into uppercase if user enters in lowercase

            for (String i : lines.keySet()) { //keySet() will assign the key from array to i
                if (name.equals(i)) { //Checking if the entered station name matches with the key
                    System.out.println("Tube Lines Available  : " + lines.get(i));
                }
            }
            System.out.println("Do you want to try again : 'Y or 'N' ");
            result = scanner.next().charAt(0);
        } while (result == 'Y' || result == 'y');// when condition is true then the above code will execute again
        scanner.close();
    }
}
