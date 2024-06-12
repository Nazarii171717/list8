package Task3;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Collection<Person> persons = new ArrayList();
        persons.add(new Person("Nazar", "Zavhorodnii"));
        persons.add(new Person("John", "Jones"));
        //persons.add(new Person("Mike", null));
        persons.add(new Person("Karol", "Jones"));
        persons.add(new Person("Dana", "White"));
        persons.add(new Person("Petr", "Jones"));
        persons.add(new Person("Rich", "Black"));
        try
        {
            Optional<Person> person = persons.stream()
                    .filter(x -> x.getLastName().startsWith("Jones")).findFirst();
            System.out.println(person.isPresent() ? person.get() : "Error");


        } catch (NullPointerException e)
        {
            System.out.println("Person in the list does not contain last name");
        }
    }
}
