// Name: Rylan Cheetham
// Date: 11/23/2021
// the purpose of this program is to parse a name depending on
// if the name entered has a middle name or not and display the names
// on separate lines

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter a full name separated by spaces
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.println();
        // trim the string entered to prevent logic errors with parsing the name
        name = name.trim();
        
        int index = name.indexOf(" ");
        if (index == -1) {
            // display an error if fewer than 2 names were entered
            System.out.println("Error: Enter a minimum of 2 names.");
        } else {
            // display the 2 names entered on separate lines
            int index2 = name.indexOf(" ", index + 1);
            if (index2 == -1) {
                String firstName = name.substring(0, index);
                String lastName = name.substring(index + 1);
            
                System.out.println("First name:  " + firstName);
                System.out.println("Last name:   " + lastName);
            } else {
                // display the 3 names entered on separate lines
                int index3 = name.indexOf(" ", index2 + 1);
                if (index3 == -1) {
                    String firstName = name.substring(0, index);
                    String middleName = name.substring(index + 1, index2);
                    String lastName = name.substring(index2 + 1);
                
                    System.out.println("First Name:   " + firstName);
                    System.out.println("Middle Name:  " + middleName);
                    System.out.println("Last Name:    " + lastName);
                } else {
                    // display an error if more than 3 names were entered
                    System.out.println("Error: Enter a maximum of 3 names.");
                }
            }
        }
    }
}
