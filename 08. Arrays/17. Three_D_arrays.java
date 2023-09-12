package Arrays;

import java.util.Scanner;

public class Three_D_arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of teams you want to create in each branch: ");
        // Prompting the user to input the number of teams to be created in each branch.
        int n = sc.nextInt(); // Reading the input.

        // Creating a 3D array to store the employee names.
        String[][][] data = new String[3][n][n];
        // The array has dimensions: 3 branches, n teams per branch, and n employees per
        // team.

        // Loop to populate the 3D array with employee names.
        for (int i = 0; i < 3; i++) { // Loop for each branch (3 branches in this example).
            for (int j = 0; j < n; j++) { // Loop for each team (specified by user input).
                for (int k = 0; k < n; k++) { // Loop for each employee in the team.
                    data[i][j][k] = sc.next(); // Reading and storing the employee name.
                    // data[i][j][k] = sc.nextLine();// to take usernames with their lastnames also
                }
            }
        }

        // Loop to print the employee names along with branch and team information.
        for (int i = 0; i < 3; i++) { // Loop for each branch.
            for (int j = 0; j < n; j++) { // Loop for each team.
                for (int k = 0; k < n; k++) { // Loop for each employee in the team.
                    System.out.println(
                            "Branch No : " + (i + 1) + "\nteam No : " + (j + 1) + "\n" + (k + 1)
                                    + ".Employee name is : "
                                    + data[i][j][k]);
                    // Printing branch number, team number, and employee name.
                }
                System.out.println(); // Printing an empty line to separate teams.
            }
        }
        sc.close();
    }
}
