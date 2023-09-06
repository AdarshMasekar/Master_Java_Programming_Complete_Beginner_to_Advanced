package Arrays;

public class Rotate_Matrix {
    // Method to rotate a given NxN matrix 90 degrees clockwise
    static void rotate_90(int[][] matrix) {
        int n = matrix.length; // Get the size of the matrix (N)

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap the elements at (i, j) and (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row to rotate 90 degrees
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Swap the elements at (i, j) and (i, n - j - 1)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }

        // Step 3: Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Sample input matrix
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Rotate the matrix and print the result
        rotate_90(matrix);
    }
}

// output:
// 7 4 1
// 8 5 2
// 9 6 3
