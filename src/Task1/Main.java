
package Task1;
import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        IntStream list = sr.ints(10L, 0, 1000);
        int[] array = list.toArray();
        IntStream l0 = IntStream.of(array);
        IntStream l1 = IntStream.of(array);
        IntStream l2 = IntStream.of(array);
        IntStream l3 = IntStream.of(array);
        IntStream l4 = IntStream.of(array);
        IntStream l5 = IntStream.of(array);

        System.out.println("All numbers: ");
        PrintStream allNumbers = System.out;
        Objects.requireNonNull(allNumbers);
        l0.forEach(allNumbers::println);

        System.out.println("Odd numbers: ");
        IntStream oddNumbers = l1.filter((x) -> {
            return x % 2 == 1;
        });
        oddNumbers.forEach(System.out::println);
        OptionalDouble od1 = l2.filter(x -> x % 2 ==0).average();
        System.out.println("The average of all odd numbers is "
                + (od1.isPresent() ? od1.getAsDouble() : "Incorrect value"));

        System.out.println("Even numbers: ");
        IntStream evenNumbers = l3.filter((x) -> {
            return x % 2 == 0;
        });
        evenNumbers.forEach(System.out::println);
        OptionalDouble od2 = l4.filter(x -> x % 2 == 1).average();
        System.out.println("The average of all even numbers is "
                + (od2.isPresent() ? od2.getAsDouble() : "Incorrect value"));

        OptionalDouble od3 = l5.average();
        System.out.println("The average of all numbers: "
                + (od3.isPresent() ? od3.getAsDouble() : "Incorrect value"));
    }
}

