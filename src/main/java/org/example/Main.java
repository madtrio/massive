package org.example;

import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        int [] num = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length / 2; i++) {
            int out = num [i];
            num[i] = num [num.length - 1 - i];
            num[num.length - 1 - i] = out;
        }

        System.out.println(Arrays.toString(num));
    }

}