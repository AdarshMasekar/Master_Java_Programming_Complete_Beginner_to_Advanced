package Arrays;

public class Find_Missing_Number {

    public static int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = 0;
        for (int a : array) {
            sum += a;
        }

        int res = (n * (n + 1)) / 2;
        return (res - sum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 8, 6, 9, 10, 7, 12, 11, 14 };
        System.out.println(missingNumber(arr, arr.length + 1));
    }
}
