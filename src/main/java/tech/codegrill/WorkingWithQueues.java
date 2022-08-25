package tech.codegrill;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        Queue<Person> customers = new LinkedList<>();

        customers.add(new Person("Andreas", 33));

        customers.add(new Person("Demo", 32));

        customers.add(new Person("Bleriot", 33));

        customers.add(new Person("Bertrand", 34));

        System.out.println("\n====");
        System.out.println(" "+customers.size());

        System.out.println("\n============================");
        System.out.println(customers.peek());

        System.out.println("\n============================");
        System.out.println(customers.poll());

        System.out.println("\n========================================================================================");
        System.out.println(customers);
    }

    static  record Person (String name, int age){}
}
