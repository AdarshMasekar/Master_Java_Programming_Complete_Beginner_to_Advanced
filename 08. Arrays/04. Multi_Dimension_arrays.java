package Arrays;

import java.util.Scanner;

public class Multi_Dimension_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialization of 2D array
        int[][] arr = new int[3][4];

      // inserting values into 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt(); 
            }
        }

        // printing values of 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
