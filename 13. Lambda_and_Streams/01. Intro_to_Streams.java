package Streams_and_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intro_to_Streams {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 55, 67, 58);
        // if we want to print all numbers from list which are even and greater than 10
        // we would have used a for loop to iterate over each element and checked for
        // even and greater than conditions but we can do the same in less time and
        // efficiently using streams in java

        list.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x > 10)
                .forEach(x -> System.out.print(x + " "));

        Integer[] arr = { 8, 100, 20, 40, 3, 7 };
        List<Integer> list2 = Arrays.asList(arr);
        List<Integer> ans = new ArrayList<>();
        list2.stream()
                .filter(x -> x < 10)
                .forEach(x -> ans.add(x));

        ans.stream()
                .forEach(x -> System.out.print(x + " "));
    }
}