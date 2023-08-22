package Arrays;

import java.util.*;

public class Arrays_Syntax {

    public static void main(String[] args) {
        // lets discuss the differences between a[] and [] a;

        // in below case both works fine
        int a[] = { 19, 29, 40 };
        int[] b = { 22, 558, 556 };

        // but problem happens when
        // int[] c, d; // this makes both c and d as arraytype variables
        // c = new int[5];
        // d = 10;

        // this will work fine
        int e[], f;

        e = new int[3];

        f = 10;

    }
}
