package tech.codegrill;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "pink";
        colors[2] = "blue";

        System.out.println(Arrays.toString(colors));

        // Sedond method of initialisation of arrays

        int[] numbers = {100, 200};
        System.out.println("=======================");

        // Loop through an Array
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println("=======================");
        // Loop through using the enehqnced for loop
        for (String color : colors) {
            System.out.println(color);
        }
        System.out.println("=======================");

        // Loop usnig Streams
        Arrays.stream(colors).forEach(System.out::println);

        // 2D Arrays implementation
    }
}
