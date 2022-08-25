package tech.codegrill;

import java.util.HashMap;
import java.util.Map;

public class WorkingWitMaps {
    public static void main(String[] args) {
        Map<Integer, WorkingWithQueues.Person> map = new HashMap<>();
        map.put(1, new WorkingWithQueues.Person("fryker", 33));
        map.put(2, new WorkingWithQueues.Person("Yvan", 27));
        map.put(3, new WorkingWithQueues.Person("Boris", 26));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        // Loop through a map version 1
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.remove(3);

        // loop through a map
        map.forEach((key, person) -> {
            System.out.println(key + " " + person);
        });

        map.put(4, new WorkingWithQueues.Person("Mariamou", 30));

        System.out.println(map.entrySet());
        System.out.println(map.values());
    }
}
