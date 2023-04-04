import java.util.Scanner;

/*
2. Re write the student mark sheet programme using if else and while loop.
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
_______________________________
| |
| Mark Sheet |
|_______________________________|
| Name : Jay |
| Roll No: 08 |
|_______________________________|
| Subjects : Marks |
|_______________________________|
| Math : 98 |
| Science : 90 |
| English : 85 |
|_______________________________|
| Total : 273 |
|_______________________________|
| Percentage : 91.0 |
| Result : Pass |
| Grade : A+ |
|_______________________________|
 */
public class Programme_2_MarkSheet {
    int mathsMarks, scienceMarks, englishMarks;

    public void markSheet(String name, int rollNumber, int maths, int science, int english) //declaring instance method
    {

        int total = maths + science + english; // calculating the total marks of all 3 subject
        double percentage = (total * 100) / 300; // calculating the percentage

        String result;
        if (percentage >= 35 && percentage <= 100) { //Calculating pass or fail.
            result = "Pass";
            System.out.println(result); //output if the above condition is true

        } else { //if the above is not true, print the below
            result = "Fail";
            System.out.println(result); //output if the condition is false
        }


        //calculating grade based on percentage calculated above
        String grade = "";
        if (percentage >= 80 && percentage <= 100) {
            grade = "A+";
        } else if (percentage < 80 && percentage >= 60) {
            grade = "A";
        } else if (percentage < 60 && percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35 && percentage < 50) {
            grade = "C";
        } else {
            grade = "-";
            System.out.println(grade);
        }


        //printing the marksheet
        System.out.println("-------------------------------------");
        System.out.println("|                                   |");
        System.out.println("|          Mark sheet               |");
        System.out.println("|-----------------------------------|");
        System.out.println("| Name        :" + name + "                |");
        System.out.println("| Roll Number :" + rollNumber + "                |");
        System.out.println("|                                   |");
        System.out.println("------------------------------------");
        System.out.println("| Subject     :    Marks            |");
        System.out.println("------------------------------------");
        System.out.println("| Maths       :    " + maths + "             |");
        System.out.println("| Science     :    " + science + "           |");
        System.out.println("| English     :    " + english + "           |");
        System.out.println("------------------------------------");
        System.out.println("| Total       :    " + total + "              |");
        System.out.println("------------------------------------");
        System.out.println("| Percentage  :    " + percentage + "         |");
        System.out.println("| Result      :    " + result + "           |");
        System.out.println("| Grade       :    " + grade + "                  |");

        System.out.println("------------------------------------");


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner object for user input
        System.out.println("Enter the student name: ");
        String sName = scanner.nextLine(); //reading and storing user input
        System.out.println("Enter the student roll number:");
        int sRollNumber = scanner.nextInt();//reading and storing user input
        System.out.println("Enter the Math's marks:");

        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100)

        //if(mathsMarks<0 || mathsMarks>100)
        {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("Enter the valid marks : "); //to input the valid marks
            mathsMarks = scanner.nextInt(); //to input the valid marks
        }


        System.out.println("Enter the Science's marks:");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.println("Enter the valid marks : ");
            scienceMarks = scanner.nextInt(); //input the valid science marks
        }


        System.out.println("Enter the English's marks:");
        int englishMarks = scanner.nextInt(); //Storing English marks
        while (englishMarks < 10 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
            System.out.print("Enter the valid marks : ");
            englishMarks = scanner.nextInt();
        }
        Programme_2_MarkSheet obj = new Programme_2_MarkSheet(); //object created to call the instance method
        obj.markSheet(sName, sRollNumber, mathsMarks, scienceMarks, englishMarks); // calling instance method
        scanner.close();

    }
}
