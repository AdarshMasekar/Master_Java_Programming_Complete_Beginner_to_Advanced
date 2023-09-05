package Arrays;

import java.util.Scanner;

public class Store_employees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of companies you want to store the details of employees: ");
        int companies = sc.nextInt();

        for (int i = 0; i < companies; i++) {
            System.out.println("Enter the number of employees you want to store in company " + (i + 1) + " : ");
            int employees = sc.nextInt();
            String names[] = new String[employees];
            for (int j = 0; j < employees; j++) {
                System.out.println("enter the " + (j + 1) + " th employee name");
                names[j] = sc.next();
            }

            System.out.println("Employee names of " + (i + 1) + " company:");
            for (int k = 0; k < names.length; k++) {
                System.out.println(" Employee " + (k + 1) + " name is " + names[k]);
            }
        }
        sc.close();
    }
}
