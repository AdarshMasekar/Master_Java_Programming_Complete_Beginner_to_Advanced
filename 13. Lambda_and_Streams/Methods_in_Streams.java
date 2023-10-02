package Streams_and_Lambda;

import java.util.ArrayList;

class Methods_in_Streams {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(30);
        list.add(55);
        list.add(70);
        list.add(95);
        list.add(05);
        list.add(25);
        list.add(40);
        list.add(65);
        list.add(80);

        // to print this list in sorted order we can use stream methos like this
        list.stream()
                .sorted()
                .forEach(x -> System.out.print(x + " "));

        for (Integer num : list) {
            System.out.print(num + " ");
        }

        // a small code to find sum of squares of all even numbers in an arraylist
        int sumOfSquaresOfEvenNumbers = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, Integer::sum);
        System.out.println(sumOfSquaresOfEvenNumbers);
    }
}