package tech.codegrill;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedLists {
    public static void main(String[] args) {
        LinkedList<WorkingWithQueues.Person> linkedList = new LinkedList<>();
        linkedList.add(new WorkingWithQueues.Person("Andreas", 33));
        linkedList.add(new WorkingWithQueues.Person("Yvan", 27));
        linkedList.add(new WorkingWithQueues.Person("Willy", 25));

        ListIterator<WorkingWithQueues.Person> personListIterator = linkedList.listIterator();

        while(personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while(personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }
}
