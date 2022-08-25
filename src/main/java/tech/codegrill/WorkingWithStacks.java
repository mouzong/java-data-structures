package tech.codegrill;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<String> colors = new Stack<>();

        colors.push("blue");
        colors.push("green");
        colors.push("magenta");
        System.out.println(colors.peek());
        colors.pop();
        System.out.println(colors);
        System.out.println(colors.peek());
    }
}
