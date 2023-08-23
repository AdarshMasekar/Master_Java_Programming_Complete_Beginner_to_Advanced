package Arrays;

public class Find_Average {

    static float find_Average(int[] arr) {
        float ans = 0;

        for (int num : arr) {
            ans += num;
        }

        return (ans / arr.length);
    }

    public static void main(String[] args) {
        int[] arr = { 10, 24, 55, 40, 80 };

        System.out.println("Average of the array arr is : " + find_Average(arr));
    }

}

// output:
// Average of the array arr is : 41.8
